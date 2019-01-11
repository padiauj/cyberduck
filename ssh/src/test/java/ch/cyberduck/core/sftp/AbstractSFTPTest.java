package ch.cyberduck.core.sftp;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.Credentials;
import ch.cyberduck.core.DisabledCancelCallback;
import ch.cyberduck.core.DisabledHostKeyCallback;
import ch.cyberduck.core.DisabledLoginCallback;
import ch.cyberduck.core.DisabledPasswordStore;
import ch.cyberduck.core.DisabledProgressListener;
import ch.cyberduck.core.Host;
import ch.cyberduck.core.Local;
import ch.cyberduck.core.LocalFactory;
import ch.cyberduck.core.LoginConnectionService;
import ch.cyberduck.core.LoginOptions;
import ch.cyberduck.core.PathCache;
import ch.cyberduck.core.Profile;
import ch.cyberduck.core.ProtocolFactory;
import ch.cyberduck.core.exception.LoginCanceledException;
import ch.cyberduck.core.serializer.impl.dd.ProfilePlistReader;

import org.apache.commons.lang3.StringUtils;
import org.apache.sshd.common.file.virtualfs.VirtualFileSystemFactory;
import org.apache.sshd.server.SshServer;
import org.apache.sshd.server.auth.keyboard.DefaultKeyboardInteractiveAuthenticator;
import org.apache.sshd.server.auth.password.PasswordAuthenticator;
import org.apache.sshd.server.auth.pubkey.StaticPublickeyAuthenticator;
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider;
import org.apache.sshd.server.session.ServerSession;
import org.apache.sshd.server.subsystem.sftp.SftpSubsystemFactory;
import org.junit.After;
import org.junit.Before;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;

import static org.junit.Assert.fail;

public class AbstractSFTPTest {

    private SshServer sshServer;

    protected SFTPSession session;

    @Before
    public void start() throws Exception {
        sshServer = SshServer.setUpDefaultServer();
        sshServer.setPort(2202);
        sshServer.setPasswordAuthenticator(new PasswordAuthenticator() {
            @Override
            public boolean authenticate(String username, String password, ServerSession session) {
                if(!StringUtils.equals(System.getProperties().getProperty("sftp.user"), username)) {
                    return false;
                }
                if(!StringUtils.equals(System.getProperties().getProperty("sftp.password"), password)) {
                    return false;
                }
                return true;
            }
        });
        sshServer.setKeyboardInteractiveAuthenticator(new DefaultKeyboardInteractiveAuthenticator());
        sshServer.setPublickeyAuthenticator(new StaticPublickeyAuthenticator(true) {
        });
        sshServer.setKeyPairProvider(new SimpleGeneratorHostKeyProvider());
        sshServer.setSubsystemFactories(Collections.singletonList(new SftpSubsystemFactory()));
        final Local directory = LocalFactory.get(System.getProperty("java.io.tmpdir"), UUID.randomUUID().toString());
        directory.mkdir();
        sshServer.setFileSystemFactory(new VirtualFileSystemFactory(Paths.get(directory.getAbsolute())));
        sshServer.start();
    }


    @After
    public void stop() throws Exception {
        try {
            session.close();
        }
        finally {
            sshServer.stop();
        }
    }

    @Before
    public void setup() throws Exception {
        final ProtocolFactory factory = new ProtocolFactory(new HashSet<>(Collections.singleton(new SFTPProtocol())));
        final Profile profile = new ProfilePlistReader(factory).read(
            this.getClass().getResourceAsStream("/SFTP.cyberduckprofile"));
        final Host host = new Host(profile, profile.getDefaultHostname(), 2202, new Credentials(
            System.getProperties().getProperty("sftp.user"), System.getProperties().getProperty("sftp.password")
        ));
        session = new SFTPSession(host);
        new LoginConnectionService(new DisabledLoginCallback() {
            @Override
            public Credentials prompt(final Host bookmark, final String title, final String reason, final LoginOptions options) throws LoginCanceledException {
                fail(reason);
                return null;
            }
        }, new DisabledHostKeyCallback(),
            new DisabledPasswordStore(), new DisabledProgressListener()).connect(session, PathCache.empty(), new DisabledCancelCallback());
    }
}
