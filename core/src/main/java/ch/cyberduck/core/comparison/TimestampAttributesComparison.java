package ch.cyberduck.core.comparison;

/*
 * Copyright (c) 2012 David Kocher. All rights reserved.
 * http://cyberduck.ch/
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
 *
 * Bug fixes, suggestions and comments should be sent to:
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathAttributes;
import ch.cyberduck.core.features.AttributesComparison;
import ch.cyberduck.core.synchronization.Comparison;
import ch.cyberduck.core.synchronization.TimestampComparisonService;

import java.util.TimeZone;

public class TimestampAttributesComparison implements AttributesComparison {

    private final TimeZone tz;

    public TimestampAttributesComparison(final TimeZone tz) {
        this.tz = tz;
    }

    @Override
    public Comparison compare(final Path.Type type, final PathAttributes file, final PathAttributes other) {
        return new TimestampComparisonService(tz).compare(file, other);
    }
}
