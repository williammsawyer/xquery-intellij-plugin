/*
 * Copyright (C) 2019 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.xdm.module.path

enum class XdmModuleType(val extensions: Array<String>) {
    DotNet(arrayOf()), // Saxon
    Java(arrayOf()), // BaseX, eXist-db, Saxon
    XMLSchema(arrayOf(".xsd")),
    XQuery(arrayOf(".xq", ".xqm", ".xqy", ".xql", ".xqu", ".xquery")),
    XSLT(arrayOf()); // MarkLogic

    companion object {
        val JAVA = arrayOf(Java)
        val MODULE = arrayOf(XQuery, Java, DotNet)
        val MODULE_OR_SCHEMA = arrayOf(XQuery, XMLSchema, Java, DotNet)
        val NONE = arrayOf<XdmModuleType>()
        val SCHEMA = arrayOf(XMLSchema)
        val STYLESHEET = arrayOf(XSLT)
    }
}
