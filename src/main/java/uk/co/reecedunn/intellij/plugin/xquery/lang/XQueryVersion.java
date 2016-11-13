/*
 * Copyright (C) 2016 Reece H. Dunn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.reecedunn.intellij.plugin.xquery.lang;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum XQueryVersion {
    VERSION_0_9_MARKLOGIC("0.9-ml", 0.9),
    VERSION_1_0("1.0", 1.0),
    VERSION_1_0_MARKLOGIC("1.0-ml", 1.0),
    VERSION_3_0("3.0", 3.0),
    VERSION_3_1("3.1", 3.1),
    // MarkLogic Extensions:
    VERSION_6_0("6.0", 6.0),
    VERSION_7_0("7.0", 7.0),
    VERSION_8_0("8.0", 8.0),
    // Saxon Extensions:
    VERSION_9_4("9.4", 9.4),
    VERSION_9_5("9.5", 9.5),
    VERSION_9_6("9.6", 9.6),
    VERSION_9_7("9.7", 9.7);

    private final String mID;
    private final double mValue;

    XQueryVersion(@NotNull String id, double value) {
        mID = id;
        mValue = value;
    }

    @Nullable
    public static XQueryVersion parse(@Nullable CharSequence value) {
        if ("0.9-ml".equals(value)) return VERSION_0_9_MARKLOGIC;
        if ("1.0".equals(value)) return VERSION_1_0;
        if ("1.0-ml".equals(value)) return VERSION_1_0_MARKLOGIC;
        if ("3.0".equals(value)) return VERSION_3_0;
        if ("3.1".equals(value)) return VERSION_3_1;
        if ("6.0".equals(value)) return VERSION_6_0;
        if ("7.0".equals(value)) return VERSION_7_0;
        if ("8.0".equals(value)) return VERSION_8_0;
        if ("9.4".equals(value)) return VERSION_9_4;
        if ("9.5".equals(value)) return VERSION_9_5;
        if ("9.6".equals(value)) return VERSION_9_6;
        if ("9.7".equals(value)) return VERSION_9_7;
        return null;
    }

    @Override
    public String toString() {
        return mID;
    }

    public double toDouble() {
        return mValue;
    }

    public boolean supportsVersion(XQueryVersion version) {
        return version != null && toDouble() >= version.toDouble();
    }
}
