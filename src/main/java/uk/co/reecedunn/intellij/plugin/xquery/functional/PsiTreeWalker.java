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
package uk.co.reecedunn.intellij.plugin.xquery.functional;

import com.intellij.psi.PsiElement;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public final class PsiTreeWalker {
    public void each(Consumer<PsiElement> consumer) {
        PsiElement element = mElement;
        while (element != null) {
            consumer.accept(element);
            element = mNextElementFunction.apply(element);
        }
    }

    public Option<PsiElement> findFirst(Predicate<PsiElement> matcher) {
        PsiElement element = mElement;
        while (element != null) {
            if (matcher.test(element)) {
                return Option.some(element);
            }
            element = mNextElementFunction.apply(element);
        }
        return Option.none();
    }

    public void findAll(Predicate<PsiElement> matcher, Consumer<PsiElement> consumer) {
        PsiElement element = mElement;
        while (element != null) {
            if (matcher.test(element)) {
                consumer.accept(element);
            }
            element = mNextElementFunction.apply(element);
        }
    }

    // region Value Constructors

    public static PsiTreeWalker ancestors(PsiElement element) {
        return new PsiTreeWalker(element.getParent(), PsiElement::getParent);
    }

    public static PsiTreeWalker descendants(PsiElement element) {
        return new PsiTreeWalker(element.getFirstChild(), PsiElement::getFirstChild);
    }

    public static PsiTreeWalker children(PsiElement element) {
        return new PsiTreeWalker(element.getFirstChild(), PsiElement::getNextSibling);
    }

    public static PsiTreeWalker reversedChildren(PsiElement element) {
        return new PsiTreeWalker(element.getLastChild(), PsiElement::getPrevSibling);
    }

    // endregion
    // region Implementation Details

    private final PsiElement mElement;
    private final Function<PsiElement, PsiElement> mNextElementFunction;

    private PsiTreeWalker(PsiElement element, Function<PsiElement, PsiElement> nextElementFunction) {
        mElement = element;
        mNextElementFunction = nextElementFunction;
    }

    // endregion
}
