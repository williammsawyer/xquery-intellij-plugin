/*
 * Copyright (C) 2021 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.xpm.lang.configuration

import uk.co.reecedunn.intellij.plugin.xpm.lang.XpmLanguageVersion
import uk.co.reecedunn.intellij.plugin.xpm.lang.XpmProductVersion
import uk.co.reecedunn.intellij.plugin.xpm.lang.XpmSpecificationVersion

data class XpmLanguageConfiguration(
    val language: XpmLanguageVersion,
    val product: XpmProductVersion,
    val implements: Map<String, XpmSpecificationVersion> = mapOf()
) {
    constructor(language: XpmLanguageVersion, product: XpmProductVersion, vararg implements: XpmSpecificationVersion) :
            this(language, product, implements.associateBy { it.specification.id })
}