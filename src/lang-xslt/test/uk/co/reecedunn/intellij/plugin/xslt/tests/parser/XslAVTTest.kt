/*
 * Copyright (C) 2020 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.xslt.tests.parser

import org.hamcrest.CoreMatchers.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import uk.co.reecedunn.intellij.plugin.core.tests.assertion.assertThat
import uk.co.reecedunn.intellij.plugin.core.vfs.ResourceVirtualFile
import uk.co.reecedunn.intellij.plugin.core.vfs.decode
import uk.co.reecedunn.intellij.plugin.core.vfs.toPsiFile
import uk.co.reecedunn.intellij.plugin.xpath.parser.XPathParserDefinition
import uk.co.reecedunn.intellij.plugin.xslt.ast.schema.XsltSchemaType
import uk.co.reecedunn.intellij.plugin.xslt.parser.schema.XslAVT

// NOTE: This class is private so the JUnit 4 test runner does not run the tests contained in it.
@Suppress("Reformat")
@DisplayName("XSLT 3.0 - Schema Types - xsl:avt")
private class XslAVTTest : ParserTestCase(XslAVT.ParserDefinition(), XPathParserDefinition()) {
    fun parseResource(resource: String): XsltSchemaType {
        val file = ResourceVirtualFile.create(this::class.java.classLoader, resource)
        return file.toPsiFile(myProject) as XsltSchemaType
    }

    fun loadResource(resource: String): String? {
        return ResourceVirtualFile.create(this::class.java.classLoader, resource).decode()
    }

    @Nested
    @DisplayName("XQuery IntelliJ Plugin XSLT EBNF (4) AttributeValueTemplate")
    inner class AttributeValueTemplate {
        @Test
        @DisplayName("escaped characters")
        fun escapedCharacters() {
            val expected = loadResource("tests/parser/schema-type/avt/AttributeValueTemplate_EscapedChar.txt")
            val actual = parseResource("tests/parser/schema-type/avt/AttributeValueTemplate_EscapedChar.input")
            assertThat(prettyPrintASTNode(actual), `is`(expected))
        }

        @Test
        @DisplayName("unpaired right brace")
        fun unpairedRightBrace() {
            val expected = loadResource("tests/parser/schema-type/avt/AttributeValueTemplate_UnpairedRightBrace.txt")
            val actual = parseResource("tests/parser/schema-type/avt/AttributeValueTemplate_UnpairedRightBrace.input")
            assertThat(prettyPrintASTNode(actual), `is`(expected))
        }
    }

    @Test
    @DisplayName("XQuery IntelliJ Plugin XSLT EBNF (5) AttrContentChar")
    fun attrContentChar() {
        val expected = loadResource("tests/parser/schema-type/avt/AttrContentChar.txt")
        val actual = parseResource("tests/parser/schema-type/avt/AttrContentChar.input")
        assertThat(prettyPrintASTNode(actual), `is`(expected))
    }

    @Nested
    @DisplayName("XQuery IntelliJ Plugin XSLT EBNF (6) EnclosedExpr")
    inner class EnclosedExpr {
        @Test
        @DisplayName("after text")
        fun afterText() {
            val expected = loadResource("tests/parser/schema-type/avt/EnclosedExpr.txt")
            val actual = parseResource("tests/parser/schema-type/avt/EnclosedExpr.input")
            assertThat(prettyPrintASTNode(actual), `is`(expected))
        }

        @Test
        @DisplayName("EnclosedExpr only")
        fun enclosedExprOnly() {
            val expected = loadResource("tests/parser/schema-type/avt/EnclosedExpr_Only.txt")
            val actual = parseResource("tests/parser/schema-type/avt/EnclosedExpr_Only.input")
            assertThat(prettyPrintASTNode(actual), `is`(expected))
        }
    }
}