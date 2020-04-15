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
package uk.co.reecedunn.intellij.plugin.marklogic.query.rest.debugger

import com.intellij.xdebugger.frame.XExecutionStack
import com.intellij.xdebugger.frame.XStackFrame

internal class MarkLogicExecutionStack(
    displayName: String,
    private val session: MarkLogicDebugSession
) : XExecutionStack(displayName) {

    private var frames: List<XStackFrame>? = null

    override fun computeStackFrames(firstFrameIndex: Int, container: XStackFrameContainer?) {
        frames = session.stack()
        container?.addStackFrames(frames!!, true)
    }

    override fun getTopFrame(): XStackFrame? = frames?.firstOrNull()
}