package com.sample.jacksongson.models.sample4

import com.fasterxml.jackson.annotation.JsonProperty

data class ServletMapping(
    @get:JsonProperty("cofaxAdmin")val cofaxAdmin: String?,
    @get:JsonProperty("cofaxCDS")val cofaxCDS: String?,
    @get:JsonProperty("cofaxEmail")val cofaxEmail: String?,
    @get:JsonProperty("cofaxTools")val cofaxTools: String?,
    @get:JsonProperty("fileServlet")val fileServlet: String?
)