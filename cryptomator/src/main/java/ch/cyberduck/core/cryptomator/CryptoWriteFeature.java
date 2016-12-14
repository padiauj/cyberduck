package ch.cyberduck.core.cryptomator;

/*
 * Copyright (c) 2002-2016 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.DefaultIOExceptionMappingService;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathCache;
import ch.cyberduck.core.Session;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Write;
import ch.cyberduck.core.io.StatusOutputStream;
import ch.cyberduck.core.transfer.TransferStatus;

import org.cryptomator.cryptolib.api.Cryptor;
import org.cryptomator.cryptolib.api.FileHeader;

import java.io.IOException;

public class CryptoWriteFeature implements Write {

    private final Session<?> session;
    private final Write delegate;
    private final CryptoVault vault;

    public CryptoWriteFeature(final Session<?> session, final Write delegate, final CryptoVault vault) {
        this.session = session;
        this.delegate = delegate;
        this.vault = vault;
    }

    @Override
    public StatusOutputStream<?> write(final Path file, final TransferStatus status) throws BackgroundException {
        if(vault.contains(file)) {
            try {
                final Path encrypted = vault.encrypt(session, file);
                final Cryptor cryptor = vault.getCryptor();
                // Header
                final FileHeader header;
                if(null == status.getHeader()) {
                    header = cryptor.fileHeaderCryptor().create();
                }
                else {
                    header = cryptor.fileHeaderCryptor().decryptHeader(status.getHeader());
                }
                final StatusOutputStream<?> proxy = delegate.write(encrypted, status.length(vault.toCiphertextSize(status.getLength())));
                proxy.write(cryptor.fileHeaderCryptor().encryptHeader(header).array());
                return new CryptoOutputStream<>(proxy, cryptor, header);
            }
            catch(IOException e) {
                throw new DefaultIOExceptionMappingService().map(e);
            }
        }
        return delegate.write(file, status);
    }

    @Override
    public Append append(final Path file, final Long length, final PathCache cache) throws BackgroundException {
        return delegate.append(file, length, cache);
    }

    @Override
    public boolean temporary() {
        return delegate.temporary();
    }

    @Override
    public boolean random() {
        return delegate.random();
    }
}
