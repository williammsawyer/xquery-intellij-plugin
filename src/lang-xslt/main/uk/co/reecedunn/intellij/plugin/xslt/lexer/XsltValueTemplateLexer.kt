/*
 * Copyright (C) 2020-2022 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.xslt.lexer

import uk.co.reecedunn.intellij.plugin.core.lexer.STATE_DEFAULT
import uk.co.reecedunn.intellij.plugin.xpath.lexer.XPathLexer
import uk.co.reecedunn.intellij.plugin.xpath.lexer.XPathTokenType
import uk.co.reecedunn.intellij.plugin.xslt.lang.ValueTemplate
import xqt.platform.xml.lexer.LeftCurlyBracket
import xqt.platform.xml.lexer.RightCurlyBracket
import xqt.platform.xml.model.XmlCharReader

class XsltValueTemplateLexer : XPathLexer() {
    // region States

    private fun stateDefault() {
        when (mTokenRange.codePoint) {
            XmlCharReader.EndOfBuffer -> {
                mType = null
            }

            LeftCurlyBracket -> {
                mTokenRange.match()
                if (mTokenRange.codePoint == LeftCurlyBracket) {
                    mTokenRange.match()
                    mType = ValueTemplate.ESCAPED_CHARACTER
                } else {
                    mType = XPathTokenType.BLOCK_OPEN
                    pushState(STATE_VALUE_TEMPLATE_EXPRESSION)
                }
            }

            RightCurlyBracket -> {
                mTokenRange.match()
                mType = if (mTokenRange.codePoint == RightCurlyBracket) {
                    mTokenRange.match()
                    ValueTemplate.ESCAPED_CHARACTER
                } else {
                    XPathTokenType.BLOCK_CLOSE
                }
            }

            else -> while (true) {
                when (mTokenRange.codePoint) {
                    XmlCharReader.EndOfBuffer, LeftCurlyBracket, RightCurlyBracket -> {
                        mType = ValueTemplate.VALUE_CONTENTS
                        return
                    }

                    else -> {
                        mTokenRange.match()
                    }
                }
            }
        }
    }

    // endregion
    // region Lexer

    override fun advance(state: Int): Unit = when (state) {
        STATE_DEFAULT -> stateDefault()
        STATE_VALUE_TEMPLATE_EXPRESSION -> stateDefault(state)
        else -> super.advance(state)
    }

    // endregion

    companion object {
        // region State Constants

        private const val STATE_VALUE_TEMPLATE_EXPRESSION = 32

        // endregion
    }
}
