/*
 * Copyright (C) 2019 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.basex.query.session.binding

class LocalQuery(val `object`: Any, val localQueryClass: Class<*>) {
    fun bind(name: String, value: Any?, type: String?) {
        // BaseX cannot bind to namespaced variables, so only pass the NCName.
        localQueryClass.getMethod("bind", String::class.java, Any::class.java, String::class.java)
            .invoke(`object`, name, value, type)
    }

    fun context(value: Any?, type: String?) {
        localQueryClass.getMethod("context", Any::class.java, String::class.java).invoke(`object`, value, type)
    }

    fun close() {
        localQueryClass.getMethod("close").invoke(`object`)
    }
}
