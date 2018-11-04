/*
 * Copyright (C) 2018 Reece H. Dunn
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
package uk.co.reecedunn.intellij.plugin.intellij.execution.configurations

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import uk.co.reecedunn.intellij.plugin.intellij.execution.process.QueryProcessHandler
import uk.co.reecedunn.intellij.plugin.processor.query.MimeTypes

class QueryProcessorRunState(environment: ExecutionEnvironment?) : CommandLineState(environment) {
    override fun startProcess(): ProcessHandler {
        val configuration = environment.runProfile as QueryProcessorRunConfiguration
        val query = configuration.processor!!.session.eval("1 to 3", MimeTypes.XQUERY)
        return QueryProcessHandler(query)
    }
}
