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
package uk.co.reecedunn.intellij.plugin.xpath.psi.impl.xpath

import com.intellij.lang.ASTNode
import uk.co.reecedunn.intellij.plugin.core.data.CachedProperty
import uk.co.reecedunn.intellij.plugin.xdm.XsAnySimpleType
import uk.co.reecedunn.intellij.plugin.xdm.XsUntyped
import uk.co.reecedunn.intellij.plugin.xdm.datatype.QName
import uk.co.reecedunn.intellij.plugin.xdm.model.*
import uk.co.reecedunn.intellij.plugin.xpath.ast.xpath.XPathAtomicOrUnionType
import uk.co.reecedunn.intellij.plugin.xpath.ast.xpath.XPathAtomicType

class XPathAtomicOrUnionTypePsiImpl(node: ASTNode):
        XPathEQNamePsiImpl(node),
        XPathAtomicOrUnionType,
        XPathAtomicType,
        XdmTypeDeclaration {

    override fun subtreeChanged() {
        super.subtreeChanged()
        cachedStaticType.invalidate()
    }

    override val staticType get(): XdmSequenceType = cachedStaticType.get() ?: XsUntyped
    private val cachedStaticType = CachedProperty {
        val qname = (firstChild as XdmConstantExpression).constantValue as? QName
        qname?.let { XdmAtomicOrUnionType(it, XsAnySimpleType) }
    }
}
