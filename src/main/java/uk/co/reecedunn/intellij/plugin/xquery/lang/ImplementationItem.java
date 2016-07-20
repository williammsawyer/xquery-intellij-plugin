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
package uk.co.reecedunn.intellij.plugin.xquery.lang;

import org.w3c.dom.*;
import uk.co.reecedunn.intellij.plugin.xquery.resources.XQueryBundle;

import java.util.ArrayList;
import java.util.List;

public class ImplementationItem {
    public static final String IMPLEMENTATION_VERSION = "version";
    public static final String IMPLEMENTATION_DIALECT = "dialect";

    public static final ImplementationItem NULL_ITEM = new ImplementationItem();

    private final Element mElement;
    private final String mID;
    private final String mName;

    private ImplementationItem() {
        mElement = null;
        mID = null;
        mName = XQueryBundle.message("xquery.implementation.not-supported");
    }

    ImplementationItem(Document document) {
        mElement = document.getDocumentElement();
        mID = null;
        mName = null;
    }

    ImplementationItem(Element element) {
        final NamedNodeMap attributes = element.getAttributes();
        mElement = element;
        mID = attributes.getNamedItem("id").getNodeValue();
        if (attributes.getNamedItem("localized").getNodeValue().equals("true")) {
            mName = XQueryBundle.message(attributes.getNamedItem("name").getNodeValue());
        } else {
            mName = attributes.getNamedItem("name").getNodeValue();
        }
    }

    public String getID() {
        return mID;
    }

    public String toString() {
        return mName;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ImplementationItem))
            return false;
        ImplementationItem otherItem = (ImplementationItem)other;
        if (otherItem.getID() == null) {
            return mID == null;
        }
        return otherItem.getID().equals(mID);
    }

    public List<ImplementationItem> getItems(String tagName) {
        final List<ImplementationItem> items = new ArrayList<>();
        if (mElement != null) {
            NodeList nodes = mElement.getElementsByTagName(tagName);
            for (int i = 0; i != nodes.getLength(); ++i) {
                items.add(new ImplementationItem((Element)nodes.item(i)));
            }
        }
        return items;
    }

    public ImplementationItem getDefaultItem(String tagName) {
        if (mElement != null) {
            NodeList nodes = mElement.getElementsByTagName(tagName);
            for (int i = 0; i != nodes.getLength(); ++i) {
                Node node = nodes.item(i);
                if (node.getAttributes().getNamedItem("default").getNodeValue().equals("true")) {
                    return new ImplementationItem((Element)node);
                }
            }
        }
        return NULL_ITEM;
    }

    public List<ImplementationItem> getItemsForXQueryVersion(String tagName, XQueryVersion version) {
        final List<ImplementationItem> items = new ArrayList<>();
        if (mElement != null) {
            NodeList nodes = mElement.getElementsByTagName(tagName);
            for (int i = 0; i != nodes.getLength(); ++i) {
                Node node = nodes.item(i);
                Node attr = node.getAttributes().getNamedItem("xquery-version");
                if (attr != null && attr.getNodeValue().equals(version.toString())) {
                    items.add(new ImplementationItem((Element) node));
                }
            }
        }
        return items;
    }

    public ImplementationItem getDefaultItemForXQueryVersion(String tagName, XQueryVersion version) {
        if (mElement != null) {
            NodeList nodes = mElement.getElementsByTagName(tagName);
            for (int i = 0; i != nodes.getLength(); ++i) {
                Node node = nodes.item(i);
                if (node.getAttributes().getNamedItem("default").getNodeValue().equals("true")) {
                    Node attr = node.getAttributes().getNamedItem("xquery-version");
                    if (attr != null && attr.getNodeValue().equals(version.toString())) {
                        return new ImplementationItem((Element) node);
                    }
                }
            }
        }
        return NULL_ITEM;
    }
}
