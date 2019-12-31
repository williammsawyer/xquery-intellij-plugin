/*
 * Copyright (C) 2018 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.xpath.psi.impl.plugin

import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.psi.tree.IElementType
import uk.co.reecedunn.intellij.plugin.xpath.ast.plugin.PluginWildcardIndicator
import uk.co.reecedunn.intellij.plugin.xdm.types.XdmWildcardValue

class PluginWildcardIndicatorPsiImpl(type: IElementType, text: CharSequence) :
    LeafPsiElement(type, text),
    PluginWildcardIndicator,
    XdmWildcardValue {

    override val data: String = "*"

    override val element get(): PsiElement? = this

    override fun toString(): String = "PluginWildcardIndicatorImpl"
}
