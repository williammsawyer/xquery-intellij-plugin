/*
 * Copyright (C) 2021 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.marklogic.xray.configuration

import com.intellij.openapi.options.SettingsEditor
import uk.co.reecedunn.intellij.plugin.core.ui.layout.panel
import javax.swing.JComponent

class XRayTestConfigurationEditor : SettingsEditor<XRayTestConfiguration>() {
    // region Form

    private val panel = panel {
    }

    // endregion
    // region SettingsEditor

    override fun createEditor(): JComponent = panel

    override fun resetEditorFrom(settings: XRayTestConfiguration) {
    }

    override fun applyEditorTo(settings: XRayTestConfiguration) {
    }

    // endregion
}
