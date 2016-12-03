/*
 * Copyright (C) 2016 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.xqdoc.lexer;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import uk.co.reecedunn.intellij.plugin.xquery.lang.XQuery;
import uk.co.reecedunn.intellij.plugin.xquery.lexer.INCNameType;
import uk.co.reecedunn.intellij.plugin.xquery.lexer.IXQueryKeywordOrNCNameType;

public interface XQDocTokenType extends TokenType {
    IElementType XQDOC_COMMENT_MARKER = new IElementType("XQDOC_COMMENT_MARKER", XQuery.INSTANCE);

    IElementType COMMENT_CONTENTS = new IElementType("XQDOC_COMMENT_CONTENTS", XQuery.INSTANCE);
    IElementType CONTENTS = new IElementType("XQDOC_CONTENTS", XQuery.INSTANCE);

    IElementType TRIM = new IElementType("XQDOC_TRIM", XQuery.INSTANCE);

    IElementType TAG_MARKER = new IElementType("XQDOC_TAG_MARKER", XQuery.INSTANCE);
    IElementType TAG = new IElementType("XQDOC_TAG", XQuery.INSTANCE);

    IElementType OPEN_XML_TAG = new IElementType("XQDOC_OPEN_XML_TAG_TOKEN", XQuery.INSTANCE);
    IElementType END_XML_TAG = new IElementType("XQUERY_END_XML_TAG_TOKEN", XQuery.INSTANCE);
    IElementType CLOSE_XML_TAG = new IElementType("XQUERY_CLOSE_XML_TAG_TOKEN", XQuery.INSTANCE);
    IElementType SELF_CLOSING_XML_TAG = new IElementType("XQDOC_SELF_CLOSING_XML_TAG_TOKEN", XQuery.INSTANCE);

    IElementType XML_TAG = new IElementType("XQDOC_XML_TAG", XQuery.INSTANCE);
    IElementType XML_EQUAL = new IElementType("XQDOC_XML_EQUAL_TOKEN", XQuery.INSTANCE);
    IElementType XML_ATTRIBUTE_VALUE_START = new IElementType("XQDOC_XML_ATTRIBUTE_VALUE_START_TOKEN", XQuery.INSTANCE);
    IElementType XML_ATTRIBUTE_VALUE_CONTENTS = new IElementType("XQDOC_XML_ATTRIBUTE_VALUE_CONTENTS_TOKEN", XQuery.INSTANCE);
    IElementType XML_ATTRIBUTE_VALUE_END = new IElementType("XQDOC_XML_ATTRIBUTE_VALUE_END_TOKEN", XQuery.INSTANCE);

    IElementType XML_ELEMENT_CONTENTS = new IElementType("XQDOC_XML_ELEMENT_CONTENTS_TOKEN", XQuery.INSTANCE);

    IElementType INVALID = new IElementType("XQDOC_INVALID_TOKEN", XQuery.INSTANCE);
}
