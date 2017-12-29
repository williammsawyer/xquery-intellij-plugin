/*
 * Copyright (C) 2016-2017 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.xquery.psi.impl.xquery

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import uk.co.reecedunn.intellij.plugin.core.sequences.children
import uk.co.reecedunn.intellij.plugin.core.sequences.descendants
import uk.co.reecedunn.intellij.plugin.xdm.model.XdmLexicalValue
import uk.co.reecedunn.intellij.plugin.xpath.ast.xpath.XPathStringLiteral
import uk.co.reecedunn.intellij.plugin.xquery.ast.xquery.*
import uk.co.reecedunn.intellij.plugin.xquery.filetypes.XQueryFileType
import uk.co.reecedunn.intellij.plugin.xquery.lang.Specification
import uk.co.reecedunn.intellij.plugin.xquery.lang.XQuery

class XQueryModuleImpl(provider: FileViewProvider) : PsiFileBase(provider, XQuery), XQueryModule {
    override fun getFileType(): FileType = XQueryFileType.INSTANCE

    override val XQueryVersions get(): Sequence<XQueryVersionRef> {
        var isFirst = true
        return children().map { child -> when (child) {
            is XQueryVersionDecl -> {
                isFirst = false
                val version: XPathStringLiteral? = child.version
                val xquery: Specification? = XQuery.versionsForXQuery((version as? XdmLexicalValue)?.lexicalRepresentation).firstOrNull()
                XQueryVersionRef(version, xquery)
            }
            is XQueryLibraryModule, is XQueryMainModule -> {
                if (isFirst) {
                    isFirst = false
                    XQueryVersionRef(null, null) // No XQueryVersionDecl for the primary module.
                } else
                    null
            }
            else -> null
        }}.filterNotNull()
    }

    override val XQueryVersion get(): XQueryVersionRef = XQueryVersions.firstOrNull() ?: XQueryVersionRef(null, null)

    override fun toString(): String = "XQueryModule(" + containingFile.name + ")"
}
