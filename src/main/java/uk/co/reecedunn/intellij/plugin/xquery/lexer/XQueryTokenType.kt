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
package uk.co.reecedunn.intellij.plugin.xquery.lexer

import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import uk.co.reecedunn.intellij.plugin.xqdoc.lexer.XQDocTokenType
import uk.co.reecedunn.intellij.plugin.intellij.lang.XQuery

object XQueryTokenType {
    val WHITE_SPACE: IElementType = TokenType.WHITE_SPACE
    val BAD_CHARACTER: IElementType = TokenType.BAD_CHARACTER

    val UNEXPECTED_END_OF_BLOCK = IElementType("XQUERY_UNEXPECTED_END_OF_BLOCK_TOKEN", XQuery)

    val COMMENT = IElementType("XQUERY_COMMENT_TOKEN", XQuery)
    val COMMENT_START_TAG = IElementType("XQUERY_COMMENT_START_TAG_TOKEN", XQuery)
    val COMMENT_END_TAG = IElementType("XQUERY_COMMENT_END_TAG_TOKEN", XQuery)

    val XML_COMMENT = IElementType("XQUERY_XML_COMMENT_TOKEN", XQuery)
    val XML_COMMENT_START_TAG = IElementType("XQUERY_XML_COMMENT_START_TAG_TOKEN", XQuery)
    val XML_COMMENT_END_TAG = IElementType("XQUERY_XML_COMMENT_END_TAG_TOKEN", XQuery)

    val PROCESSING_INSTRUCTION_BEGIN = IElementType("XQUERY_PROCESSING_INSTRUCTION_BEGIN_TOKEN", XQuery)
    val PROCESSING_INSTRUCTION_END = IElementType("XQUERY_PROCESSING_INSTRUCTION_END_TOKEN", XQuery)
    val PROCESSING_INSTRUCTION_CONTENTS = IElementType("XQUERY_PROCESSING_INSTRUCTION_CONTENTS_TOKEN", XQuery)

    val DIRELEM_MAYBE_OPEN_XML_TAG = IElementType("XQUERY_DIRELEM_MAYBE_OPEN_XML_TAG_TOKEN", XQuery)
    val DIRELEM_OPEN_XML_TAG = IElementType("XQUERY_DIRELEM_OPEN_XML_TAG_TOKEN", XQuery)

    val OPEN_XML_TAG = IElementType("XQUERY_OPEN_XML_TAG_TOKEN", XQuery)
    val END_XML_TAG = IElementType("XQUERY_END_XML_TAG_TOKEN", XQuery)
    val CLOSE_XML_TAG = IElementType("XQUERY_CLOSE_XML_TAG_TOKEN", XQuery)
    val SELF_CLOSING_XML_TAG = IElementType("XQUERY_SELF_CLOSING_XML_TAG_TOKEN", XQuery)
    val XML_ELEMENT_CONTENTS = IElementType("XQUERY_XML_ELEMENT_CONTENTS_TOKEN", XQuery)
    val XML_EQUAL = IElementType("XQUERY_XML_EQUAL_TOKEN", XQuery)
    val XML_WHITE_SPACE = IElementType("XQUERY_XML_WHITE_SPACE_TOKEN", XQuery)
    val XML_TAG_NCNAME: IElementType = INCNameType("XQUERY_XML_TAG_NCNAME_TOKEN")
    val XML_TAG_QNAME_SEPARATOR = IElementType("XQUERY_XML_TAG_QNAME_SEPARATOR_TOKEN", XQuery)
    val XML_ATTRIBUTE_NCNAME: IElementType = INCNameType("XQUERY_XML_ATTRIBUTE_NCNAME_TOKEN")
    val XML_ATTRIBUTE_QNAME_SEPARATOR = IElementType("XQUERY_XML_ATTRIBUTE_QNAME_SEPARATOR_TOKEN", XQuery)

    val XML_ATTRIBUTE_VALUE_START = IElementType("XQUERY_XML_ATTRIBUTE_VALUE_START_TOKEN", XQuery)
    val XML_ATTRIBUTE_VALUE_CONTENTS = IElementType("XQUERY_XML_ATTRIBUTE_VALUE_CONTENTS_TOKEN", XQuery)
    val XML_ATTRIBUTE_VALUE_END = IElementType("XQUERY_XML_ATTRIBUTE_VALUE_END_TOKEN", XQuery)
    val XML_ESCAPED_CHARACTER = IElementType("XQUERY_XML_ESCAPED_CHARACTER_TOKEN", XQuery)

    val XML_CHARACTER_REFERENCE = IElementType("XQUERY_XML_CHARACTER_REFERENCE_TOKEN", XQuery)
    val XML_PREDEFINED_ENTITY_REFERENCE = IElementType("XQUERY_XML_PREDEFINED_ENTITY_REFERENCE_TOKEN", XQuery)
    val XML_PARTIAL_ENTITY_REFERENCE = IElementType("XQUERY_XML_PARTIAL_ENTITY_REFERENCE_TOKEN", XQuery)
    val XML_EMPTY_ENTITY_REFERENCE = IElementType("XQUERY_XML_EMPTY_ENTITY_REFERENCE_TOKEN", XQuery)

    val CDATA_SECTION = IElementType("XQUERY_CDATA_SECTION_TOKEN", XQuery)
    val CDATA_SECTION_START_TAG = IElementType("XQUERY_CDATA_SECTION_START_TAG_TOKEN", XQuery)
    val CDATA_SECTION_END_TAG = IElementType("XQUERY_CDATA_SECTION_END_TAG_TOKEN", XQuery)

    val PRAGMA_CONTENTS = IElementType("XQUERY_PRAGMA_CONTENTS_TOKEN", XQuery)
    val PRAGMA_BEGIN = IElementType("XQUERY_PRAGMA_BEGIN_TOKEN", XQuery)
    val PRAGMA_END = IElementType("XQUERY_PRAGMA_END_TOKEN", XQuery)

    val INTEGER_LITERAL = IElementType("XQUERY_INTEGER_LITERAL_TOKEN", XQuery)
    val DECIMAL_LITERAL = IElementType("XQUERY_DECIMAL_LITERAL_TOKEN", XQuery)
    val DOUBLE_LITERAL = IElementType("XQUERY_DOUBLE_LITERAL_TOKEN", XQuery)
    val PARTIAL_DOUBLE_LITERAL_EXPONENT = IElementType("XQUERY_PARTIAL_DOUBLE_LITERAL_EXPONENT_TOKEN", XQuery)

    val STRING_LITERAL_START = IElementType("XQUERY_STRING_LITERAL_START_TOKEN", XQuery)
    val STRING_LITERAL_CONTENTS = IElementType("XQUERY_STRING_LITERAL_CONTENTS_TOKEN", XQuery)
    val STRING_LITERAL_END = IElementType("XQUERY_STRING_LITERAL_END_TOKEN", XQuery)
    val ESCAPED_CHARACTER = IElementType("XQUERY_ESCAPED_CHARACTER_TOKEN", XQuery)

    val BRACED_URI_LITERAL_START = IElementType("XQUERY_BRACED_URI_LITERAL_START_TOKEN", XQuery)
    val BRACED_URI_LITERAL_END = IElementType("XQUERY_BRACED_URI_LITERAL_END_TOKEN", XQuery)

    val CHARACTER_REFERENCE = IElementType("XQUERY_CHARACTER_REFERENCE_TOKEN", XQuery)
    val PREDEFINED_ENTITY_REFERENCE = IElementType("XQUERY_PREDEFINED_ENTITY_REFERENCE_TOKEN", XQuery)
    val PARTIAL_ENTITY_REFERENCE = IElementType("XQUERY_PARTIAL_ENTITY_REFERENCE_TOKEN", XQuery)
    val ENTITY_REFERENCE_NOT_IN_STRING = IElementType("XQUERY_ENTITY_REFERENCE_NOT_IN_STRING_TOKEN", XQuery)
    val EMPTY_ENTITY_REFERENCE = IElementType("XQUERY_EMPTY_ENTITY_REFERENCE_TOKEN", XQuery)

    val NCNAME: IElementType = INCNameType("XQUERY_NCNAME_TOKEN")
    val QNAME_SEPARATOR = IElementType("XQUERY_QNAME_SEPARATOR_TOKEN", XQuery)

    val INVALID = IElementType("XQUERY_INVALID_TOKEN", XQuery)
    val PARENTHESIS_OPEN = IElementType("XQUERY_PARENTHESIS_OPEN_TOKEN", XQuery)
    val PARENTHESIS_CLOSE = IElementType("XQUERY_PARENTHESIS_CLOSE_TOKEN", XQuery)
    val NOT_EQUAL = IElementType("XQUERY_NOT_EQUAL_TOKEN", XQuery)
    val VARIABLE_INDICATOR = IElementType("XQUERY_VARIABLE_INDICATOR_TOKEN", XQuery)
    val STAR = IElementType("XQUERY_STAR_TOKEN", XQuery)
    val COMMA = IElementType("XQUERY_COMMA_TOKEN", XQuery)
    val MINUS = IElementType("XQUERY_MINUS_TOKEN", XQuery)
    val DOT = IElementType("XQUERY_DOT_TOKEN", XQuery)
    val SEPARATOR = IElementType("XQUERY_SEPARATOR_TOKEN", XQuery)
    val PLUS = IElementType("XQUERY_PLUS_TOKEN", XQuery)
    val EQUAL = IElementType("XQUERY_EQUAL_TOKEN", XQuery)
    val BLOCK_OPEN = IElementType("XQUERY_BLOCK_OPEN_TOKEN", XQuery)
    val BLOCK_CLOSE = IElementType("XQUERY_BLOCK_CLOSE_TOKEN", XQuery)
    val LESS_THAN = IElementType("XQUERY_LESS_THAN_TOKEN", XQuery)
    val GREATER_THAN = IElementType("XQUERY_GREATER_THAN_TOKEN", XQuery)
    val LESS_THAN_OR_EQUAL = IElementType("XQUERY_LESS_THAN_OR_EQUAL_TOKEN", XQuery)
    val GREATER_THAN_OR_EQUAL = IElementType("XQUERY_GREATER_THAN_OR_EQUAL_TOKEN", XQuery)
    val UNION = IElementType("XQUERY_UNION_TOKEN", XQuery)
    val OPTIONAL = IElementType("XQUERY_OPTIONAL_TOKEN", XQuery)
    val AXIS_SEPARATOR = IElementType("XQUERY_AXIS_SEPARATOR_TOKEN", XQuery)
    val ASSIGN_EQUAL = IElementType("XQUERY_ASSIGN_EQUAL_TOKEN", XQuery)
    val DIRECT_DESCENDANTS_PATH = IElementType("XQUERY_DIRECT_DESCENDANTS_PATH_TOKEN", XQuery)
    val ALL_DESCENDANTS_PATH = IElementType("XQUERY_ALL_DESCENDANTS_PATH_TOKEN", XQuery)
    val ATTRIBUTE_SELECTOR = IElementType("XQUERY_ATTRIBUTE_SELECTOR_TOKEN", XQuery)
    val SQUARE_OPEN = IElementType("XQUERY_SQUARE_OPEN_TOKEN", XQuery)
    val SQUARE_CLOSE = IElementType("XQUERY_SQUARE_CLOSE_TOKEN", XQuery)
    val PARENT_SELECTOR = IElementType("XQUERY_PARENT_SELECTOR_TOKEN", XQuery)
    val NODE_BEFORE = IElementType("XQUERY_NODE_BEFORE_TOKEN", XQuery)
    val NODE_AFTER = IElementType("XQUERY_NODE_AFTER_TOKEN", XQuery)

    val CONCATENATION = IElementType("XQUERY_CONCATENATION", XQuery) // XQuery 3.0
    val MAP_OPERATOR = IElementType("XQUERY_MAP_OPERATOR_TOKEN", XQuery) // XQuery 3.0
    val FUNCTION_REF_OPERATOR = IElementType("XQUERY_FUNCTION_REF_OPERATOR_TOKEN", XQuery) // XQuery 3.0
    val ANNOTATION_INDICATOR = IElementType("XQUERY_ANNOTATION_INDICATOR_TOKEN", XQuery) // XQuery 3.0

    val ARROW = IElementType("XQUERY_ARROW_TOKEN", XQuery) // XQuery 3.1
    val STRING_CONSTRUCTOR_START = IElementType("XQUERY_STRING_CONSTRUCTOR_START_TOKEN", XQuery) // XQuery 3.1
    val STRING_CONSTRUCTOR_CONTENTS = IElementType("XQUERY_STRING_CONSTRUCTOR_CONTENTS_TOKEN", XQuery) // XQuery 3.1
    val STRING_CONSTRUCTOR_END = IElementType("XQUERY_STRING_CONSTRUCTOR_END_TOKEN", XQuery) // XQuery 3.1
    val STRING_INTERPOLATION_OPEN = IElementType("XQUERY_STRING_INTERPOLATION_OPEN_TOKEN", XQuery) // XQuery 3.1
    val STRING_INTERPOLATION_CLOSE = IElementType("XQUERY_STRING_INTERPOLATION_CLOSE_TOKEN", XQuery) // XQuery 3.1

    val TERNARY_IF = IElementType("XQUERY_TERNARY_IF_TOKEN", XQuery) // EXPath XPath/XQuery NG Proposal
    val TERNARY_ELSE = IElementType("XQUERY_TERNARY_ELSE_TOKEN", XQuery) // EXPath XPath/XQuery NG Proposal
    val ELVIS = IElementType("XQUERY_ELVIS_TOKEN", XQuery) // EXPath XPath/XQuery NG Proposal

    val K_AFTER = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_AFTER") // Update Facility 1.0
    val K_ALL = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ALL") // Full Text 1.0
    val K_ALLOWING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ALLOWING") // XQuery 3.0
    val K_ANCESTOR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ANCESTOR")
    val K_ANCESTOR_OR_SELF = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ANCESTOR_OR_SELF")
    val K_AND = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_AND")
    val K_ANDALSO = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ANDALSO") // Saxon 9.9
    val K_ANY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ANY") // Full Text 1.0
    val K_ARRAY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ARRAY") // XQuery 3.1
    val K_ARRAY_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ARRAY_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC80_RESERVED_FUNCTION_NAME) // MarkLogic 8.0
    val K_AS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_AS")
    val K_ASCENDING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ASCENDING")
    val K_ASSIGNABLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ASSIGNABLE") // Scripting Extension 1.0
    val K_AT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_AT")
    val K_ATTRIBUTE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ATTRIBUTE", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_ATTRIBUTE_DECL = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ATTRIBUTE_DECL_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_BASE_URI = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_BASE_URI")
    val K_BEFORE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_BEFORE") // Update Facility 1.0
    val K_BINARY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_BINARY") // MarkLogic 6.0
    val K_BLOCK = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_BLOCK") // Scripting Extension 1.0
    val K_BOOLEAN_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_BOOLEAN_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC80_RESERVED_FUNCTION_NAME) // MarkLogic 8.0
    val K_BOUNDARY_SPACE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_BOUNDARY_SPACE")
    val K_BY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_BY")
    val K_CASE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CASE")
    val K_CAST = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CAST")
    val K_CASTABLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CASTABLE")
    val K_CATCH = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CATCH") // XQuery 3.0
    val K_CHILD = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CHILD")
    val K_COLLATION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_COLLATION")
    val K_COMMENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_COMMENT", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_COMPLEX_TYPE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_COMPLEX_TYPE_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_CONSTRUCTION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CONSTRUCTION")
    val K_CONTAINS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CONTAINS") // Full Text 1.0
    val K_CONTENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CONTENT") // Full Text 1.0
    val K_CONTEXT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_CONTEXT") // XQuery 3.0
    val K_COPY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_COPY") // Update Facility 1.0
    val K_COPY_NAMESPACES = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_COPY_NAMESPACES")
    val K_COUNT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_COUNT") // XQuery 3.0
    val K_DECIMAL_FORMAT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DECIMAL_FORMAT") // XQuery 3.0
    val K_DECIMAL_SEPARATOR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DECIMAL_SEPARATOR") // XQuery 3.0
    val K_DECLARE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DECLARE")
    val K_DEFAULT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DEFAULT")
    val K_DELETE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DELETE") // Update Facility 1.0
    val K_DESCENDANT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DESCENDANT")
    val K_DESCENDANT_OR_SELF = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DESCENDANT_OR_SELF")
    val K_DESCENDING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DESCENDING")
    val K_DIACRITICS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DIACRITICS") // Full Text 1.0
    val K_DIFFERENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DIFFERENT") // Full Text 1.0
    val K_DIGIT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DIGIT") // XQuery 3.0
    val K_DISTANCE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DISTANCE") // Full Text 1.0
    val K_DIV = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DIV")
    val K_DOCUMENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DOCUMENT")
    val K_DOCUMENT_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_DOCUMENT_NODE", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_ELEMENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ELEMENT", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_ELEMENT_DECL = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ELEMENT_DECL_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_ELSE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ELSE")
    val K_EMPTY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EMPTY")
    val K_EMPTY_SEQUENCE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EMPTY_SEQUENCE", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_ENCODING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ENCODING")
    val K_END = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_END") // XQuery 3.0
    val K_EQ = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EQ")
    val K_ENTIRE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ENTIRE") // Full Text 1.0
    val K_EVERY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EVERY")
    val K_EXACTLY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EXACTLY") // Full Text 1.0
    val K_EXCEPT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EXCEPT")
    val K_EXIT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EXIT") // Scripting Extension 1.0
    val K_EXPONENT_SEPARATOR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EXPONENT_SEPARATOR") // XQuery 3.1
    val K_EXTERNAL = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_EXTERNAL")
    val K_FIRST = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FIRST") // Update Facility 1.0
    val K_FN = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FN") // Saxon 9.8
    val K_FOLLOWING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FOLLOWING")
    val K_FOLLOWING_SIBLING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FOLLOWING_SIBLING")
    val K_FOR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FOR")
    val K_FROM = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FROM") // Full Text 1.0
    val K_FT_OPTION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FT_OPTION") // Full Text 1.0
    val K_FTAND = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FTAND") // Full Text 1.0
    val K_FTNOT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FTNOT") // Full Text 1.0
    val K_FTOR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FTOR") // Full Text 1.0
    val K_FUNCTION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FUNCTION", IXQueryKeywordOrNCNameType.KeywordType.XQUERY30_RESERVED_FUNCTION_NAME)
    val K_FUZZY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_FUZZY") // BaseX 6.1
    val K_GE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_GE")
    val K_GREATEST = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_GREATEST")
    val K_GROUP = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_GROUP") // XQuery 3.0
    val K_GROUPING_SEPARATOR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_GROUPING_SEPARATOR") // XQuery 3.0
    val K_GT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_GT")
    val K_IDIV = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_IDIV")
    val K_IF = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_IF", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_IMPORT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_IMPORT")
    val K_IN = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_IN")
    val K_INFINITY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INFINITY") // XQuery 3.0
    val K_INHERIT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INHERIT")
    val K_INSENSITIVE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INSENSITIVE") // Full Text 1.0
    val K_INSERT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INSERT") // Update Facility 1.0
    val K_INSTANCE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INSTANCE")
    val K_INTERSECT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INTERSECT")
    val K_INTO = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INTO") // Update Facility 1.0
    val K_INVOKE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_INVOKE") // Update Facility 3.0
    val K_IS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_IS")
    val K_ITEM = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ITEM", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_LANGUAGE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LANGUAGE") // Full Text 1.0
    val K_LAST = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LAST") // Update Facility 1.0
    val K_LAX = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LAX")
    val K_LE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LE")
    val K_LEAST = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LEAST")
    val K_LET = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LET")
    val K_LEVELS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LEVELS") // Full Text 1.0
    val K_LOWERCASE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LOWERCASE") // Full Text 1.0
    val K_LT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_LT")
    val K_MAP = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_MAP") // XQuery 3.1
    val K_MINUS_SIGN = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_MINUS_SIGN") // XQuery 3.0
    val K_MOD = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_MOD")
    val K_MODIFY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_MODIFY") // Update Facility 1.0
    val K_MODULE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_MODULE")
    val K_MOST = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_MOST") // Full Text 1.0
    val K_NAMESPACE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NAMESPACE")
    val K_NAMESPACE_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NAMESPACE_NODE", IXQueryKeywordOrNCNameType.KeywordType.XQUERY30_RESERVED_FUNCTION_NAME) // XQuery 3.0
    val K_NAN = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NAN") // XQuery 3.0
    val K_NE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NE")
    val K_NEXT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NEXT") // XQuery 3.0
    val K_NO = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NO") // Full Text 1.0
    val K_NO_INHERIT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NO_INHERIT")
    val K_NO_PRESERVE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NO_PRESERVE")
    val K_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NODE", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_NODES = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NODES") // Update Facility 1.0
    val K_NON_DETERMINISTIC = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NON_DETERMINISTIC") // BaseX 8.4
    val K_NOT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NOT") // Full Text 1.0
    val K_NULL_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NULL_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC80_RESERVED_FUNCTION_NAME) // MarkLogic 8.0
    val K_NUMBER_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_NUMBER_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC80_RESERVED_FUNCTION_NAME) // MarkLogic 8.0
    val K_OBJECT_NODE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_OBJECT_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC80_RESERVED_FUNCTION_NAME) // MarkLogic 8.0
    val K_OCCURS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_OCCURS") // Full Text 1.0
    val K_OF = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_OF")
    val K_ONLY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ONLY") // XQuery 3.0
    val K_OPTION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_OPTION")
    val K_OR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_OR")
    val K_ORDER = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ORDER")
    val K_ORDERED = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ORDERED")
    val K_ORDERING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ORDERING")
    val K_ORELSE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ORELSE") // Saxon 9.9
    val K_PARAGRAPH = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PARAGRAPH") // Full Text 1.0
    val K_PARAGRAPHS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PARAGRAPHS") // Full Text 1.0
    val K_PARENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PARENT")
    val K_PATTERN_SEPARATOR = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PATTERN_SEPARATOR") // XQuery 3.0
    val K_PER_MILLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PER_MILLE") // XQuery 3.0
    val K_PERCENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PERCENT") // XQuery 3.0
    val K_PHRASE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PHRASE") // Full Text 1.0
    val K_PRECEDING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PRECEDING")
    val K_PRECEDING_SIBLING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PRECEDING_SIBLING")
    val K_PRESERVE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PRESERVE")
    val K_PRIVATE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PRIVATE") // MarkLogic 6.0
    val K_PREVIOUS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PREVIOUS") // XQuery 3.0
    val K_PROCESSING_INSTRUCTION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PROCESSING_INSTRUCTION", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_PROPERTY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PROPERTY") // MarkLogic 6.0
    val K_PUBLIC = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_PUBLIC") // XQuery 3.0 (§4.15 -- Annotations)
    val K_RELATIONSHIP = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_RELATIONSHIP") // Full Text 1.0
    val K_RENAME = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_RENAME") // Update Facility 1.0
    val K_REPLACE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_REPLACE") // Update Facility 1.0
    val K_RETURN = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_RETURN")
    val K_RETURNING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_RETURNING") // Scripting Extension 1.0
    val K_REVALIDATION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_REVALIDATION") // Update Facility 1.0
    val K_SAME = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SAME") // Full Text 1.0
    val K_SATISFIES = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SATISFIES")
    val K_SCHEMA = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA")
    val K_SCHEMA_ATTRIBUTE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA_ATTRIBUTE", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_SCHEMA_COMPONENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA_COMPONENT_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_SCHEMA_ELEMENT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA_ELEMENT", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_SCHEMA_FACET = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA_FACET_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC80_RESERVED_FUNCTION_NAME) // MarkLogic 8.0
    val K_SCHEMA_PARTICLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA_PARTICLE_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_SCHEMA_ROOT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA_ROOT_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_SCHEMA_TYPE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCHEMA_TYPE_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_SCORE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SCORE") // Full Text 1.0
    val K_SELF = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SELF")
    val K_SENSITIVE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SENSITIVE") // Full Text 1.0
    val K_SENTENCE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SENTENCE") // Full Text 1.0
    val K_SENTENCES = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SENTENCES") // Full Text 1.0
    val K_SEQUENTIAL = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SEQUENTIAL") // Scripting Extension 1.0
    val K_SIMPLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SIMPLE") // Scripting Extension 1.0
    val K_SIMPLE_TYPE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SIMPLE_TYPE_NODE", IXQueryKeywordOrNCNameType.KeywordType.MARKLOGIC70_RESERVED_FUNCTION_NAME) // MarkLogic 7.0
    val K_SKIP = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SKIP") // Update Facility 1.0
    val K_SLIDING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SLIDING") // XQuery 3.0
    val K_SOME = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SOME")
    val K_STABLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_STABLE")
    val K_START = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_START") // XQuery 3.0
    val K_STEMMING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_STEMMING") // Full Text 1.0
    val K_STOP = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_STOP") // Full Text 1.0
    val K_STRICT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_STRICT")
    val K_STRIP = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_STRIP")
    val K_STYLESHEET = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_STYLESHEET") // MarkLogic 6.0
    val K_SWITCH = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_SWITCH", IXQueryKeywordOrNCNameType.KeywordType.XQUERY30_RESERVED_FUNCTION_NAME) // XQuery 3.0
    val K_TEXT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TEXT", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_THEN = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_THEN")
    val K_THESAURUS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_THESAURUS") // Full Text 1.0
    val K_TIMES = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TIMES") // Full Text 1.0
    val K_TO = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TO")
    val K_TRANSFORM = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TRANSFORM") // Update Facility 3.0
    val K_TREAT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TREAT")
    val K_TRY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TRY") // XQuery 3.0
    val K_TUMBLING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TUMBLING") // XQuery 3.0
    val K_TUPLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TUPLE") // Saxon 9.8
    val K_TYPE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TYPE") // XQuery 3.0
    val K_TYPESWITCH = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_TYPESWITCH", IXQueryKeywordOrNCNameType.KeywordType.RESERVED_FUNCTION_NAME)
    val K_UNASSIGNABLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_UNASSIGNABLE") // Scripting Extension 1.0
    val K_UNION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_UNION")
    val K_UNORDERED = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_UNORDERED")
    val K_UPDATE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_UPDATE") // BaseX 7.8
    val K_UPDATING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_UPDATING") // Update Facility 1.0
    val K_UPPERCASE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_UPPERCASE") // Full Text 1.0
    val K_USING = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_USING") // Full Text 1.0
    val K_VALIDATE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_VALIDATE")
    val K_VALUE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_VALUE") // Update Facility 1.0
    val K_VARIABLE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_VARIABLE")
    val K_VERSION = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_VERSION")
    val K_WEIGHT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WEIGHT") // Full Text 1.0
    val K_WHEN = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WHEN") // XQuery 3.0
    val K_WHERE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WHERE")
    val K_WHILE = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WHILE", IXQueryKeywordOrNCNameType.KeywordType.SCRIPTING10_RESERVED_FUNCTION_NAME) // Scripting Extension 1.0
    val K_WILDCARDS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WILDCARDS") // Full Text 1.0
    val K_WINDOW = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WINDOW") // XQuery 3.0; Full Text 1.0
    val K_WITH = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WITH") // Update Facility 1.0
    val K_WITHOUT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WITHOUT") // Full Text 1.0
    val K_WORD = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WORD") // Full Text 1.0
    val K_WORDS = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_WORDS") // Full Text 1.0
    val K_XQUERY = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_XQUERY")
    val K_ZERO_DIGIT = IXQueryKeywordOrNCNameType("XQUERY_KEYWORD_OR_NCNAME_ZERO_DIGIT") // XQuery 3.0

    val STRING_LITERAL_TOKENS = TokenSet.create(
            STRING_LITERAL_CONTENTS,
            STRING_CONSTRUCTOR_CONTENTS,
            XML_ATTRIBUTE_VALUE_CONTENTS,
            XML_ELEMENT_CONTENTS)

    val COMMENT_TOKENS = TokenSet.create(
            XQDocTokenType.COMMENT_CONTENTS,
            XQDocTokenType.CONTENTS,
            COMMENT,
            XML_COMMENT)

    val LITERAL_TOKENS = TokenSet.create(
            INTEGER_LITERAL,
            DECIMAL_LITERAL,
            DOUBLE_LITERAL,
            PARTIAL_DOUBLE_LITERAL_EXPONENT)
}
