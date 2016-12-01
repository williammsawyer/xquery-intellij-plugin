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
package uk.co.reecedunn.intellij.plugin.xquery.psi;

import uk.co.reecedunn.intellij.plugin.core.functional.Option;

public interface XQueryNamespaceResolver {
    /**
     * Gets the URI associated with the namespace prefix.
     *
     * @param prefix The namespace prefix to resolve.
     *
     * @return The namespace associated with the namespace prefix, or null if the prefix is not supported.
     */
    Option<XQueryNamespace> resolveNamespace(CharSequence prefix);
}
