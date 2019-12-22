/*
 * Copyright (C) 2016-2019 Reece H. Dunn
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

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import uk.co.reecedunn.intellij.plugin.core.sequences.children
import uk.co.reecedunn.intellij.plugin.xdm.model.XsAnyUriValue
import uk.co.reecedunn.intellij.plugin.xdm.model.XsNCNameValue
import uk.co.reecedunn.intellij.plugin.xdm.model.XsQNameValue
import uk.co.reecedunn.intellij.plugin.xdm.module.path.XdmModulePathFactory
import uk.co.reecedunn.intellij.plugin.xdm.module.path.XdmModuleType
import uk.co.reecedunn.intellij.plugin.xdm.module.path.resolve
import uk.co.reecedunn.intellij.plugin.xpath.model.*
import uk.co.reecedunn.intellij.plugin.xquery.ast.xquery.*
import uk.co.reecedunn.intellij.plugin.xquery.model.XQueryPrologResolver

class XQueryNamespaceDeclPsiImpl(node: ASTNode) :
    ASTWrapperPsiElement(node),
    XQueryNamespaceDecl,
    XQueryPrologResolver,
    XPathNamespaceDeclaration {
    // region XQueryPrologResolver

    override val prolog
        get(): Sequence<XQueryProlog> {
            val file = namespaceUri?.let {
                it.resolve(project, XdmModuleType.XQuery.extensions) ?: it.resolveUri<XQueryModule>(true)
            }
            val library = file?.children()?.filterIsInstance<XQueryLibraryModule>()?.firstOrNull()
            return (library as? XQueryPrologResolver)?.prolog ?: emptySequence()
        }

    // endregion
    // region XPathNamespaceDeclaration

    override val namespacePrefix
        get(): XsNCNameValue? = children().filterIsInstance<XsQNameValue>().firstOrNull()?.localName

    override val namespaceUri
        get(): XsAnyUriValue? = children().filterIsInstance<XsAnyUriValue>().firstOrNull()

    // endregion
}
