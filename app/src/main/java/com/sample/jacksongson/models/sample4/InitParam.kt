package com.sample.jacksongson.models.sample4

import com.fasterxml.jackson.annotation.JsonProperty

data class InitParam(
    @get:JsonProperty("adminGroupID")val adminGroupID: Int?,
    @get:JsonProperty("betaServer")val betaServer: Boolean?,
    @get:JsonProperty("dataLog")val dataLog: Int?,
    @get:JsonProperty("dataLogLocation") val dataLogLocation: String?,
    @get:JsonProperty("dataLogMaxSize") val dataLogMaxSize: String?,
    @get:JsonProperty("fileTransferFolder") val fileTransferFolder: String?,
    @get:JsonProperty("log") val log: Int?,
    @get:JsonProperty("logLocation") val logLocation: String?,
    @get:JsonProperty("logMaxSize") val logMaxSize: String?,
    @get:JsonProperty("lookInContext") val lookInContext: Int?,
    @get:JsonProperty("removePageCache") val removePageCache: String?,
    @get:JsonProperty("removeTemplateCache") val removeTemplateCache: String?,
    @get:JsonProperty("templatePath") val templatePath: String?
)