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
package uk.co.reecedunn.intellij.plugin.xqdoc.documentation

import com.intellij.util.text.nullize
import uk.co.reecedunn.intellij.plugin.intellij.resources.XQDocBundle
import uk.co.reecedunn.intellij.plugin.xdm.module.path.XdmModuleType

interface XQDocDocumentation {
    val moduleTypes: Array<XdmModuleType>

    val href: String?

    val summary: String?

    val notes: String?

    val examples: Sequence<String>
}

interface XQDocFunctionDocumentation : XQDocDocumentation {
    val operatorMapping: String?

    val signatures: String?

    val properties: String?

    val privileges: String?

    val rules: String?

    val errorConditions: String?
}

fun XQDocDocumentation.sections(moduleType: XdmModuleType): String {
    val sections = sequenceOf(
        XQDocBundle.message("section.summary") to summary,
        XQDocBundle.message("section.operator-mapping") to (this as? XQDocFunctionDocumentation)?.operatorMapping,
        XQDocBundle.message("section.signatures") to (this as? XQDocFunctionDocumentation)?.signatures,
        XQDocBundle.message("section.properties") to (this as? XQDocFunctionDocumentation)?.properties,
        XQDocBundle.message("section.required-privileges") to (this as? XQDocFunctionDocumentation)?.privileges,
        XQDocBundle.message("section.rules") to (this as? XQDocFunctionDocumentation)?.rules,
        XQDocBundle.message("section.error-conditions") to (this as? XQDocFunctionDocumentation)?.errorConditions,
        XQDocBundle.message("section.notes") to notes,
        XQDocBundle.message("section.examples") to examples.joinToString("\n").nullize()
    ).filter { it.second != null }
    return "<dl>${sections.joinToString("") { "<dt>${it.first}</dt><dd>${it.second}</dd>" }}</dl>"
}
