/*
 * Copyright (C) 2016, 2020-2021 Reece H. Dunn
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

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import uk.co.reecedunn.intellij.plugin.xdm.types.XdmSequenceType
import uk.co.reecedunn.intellij.plugin.xpath.ast.xpath.XPathCastableExpr
import uk.co.reecedunn.intellij.plugin.xpath.lexer.XPathTokenType
import uk.co.reecedunn.intellij.plugin.xpm.optree.expression.XpmExpression
import uk.co.reecedunn.intellij.plugin.xpm.optree.expression.type.XpmSequenceTypeOperation

class XPathCastableExprPsiImpl(node: ASTNode) : ASTWrapperPsiElement(node), XPathCastableExpr {
    override val expressionElement: PsiElement
        get() = findChildByType(XPathTokenType.K_CASTABLE)!!

    override val operation: XpmSequenceTypeOperation = XpmSequenceTypeOperation.CastableAs

    override val expression: XpmExpression
        get() = firstChild as XpmExpression

    override val type: XdmSequenceType
        get() = lastChild as XdmSequenceType
}
