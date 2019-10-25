package com.sample.jacksongson.models.sample4

import com.fasterxml.jackson.annotation.JsonProperty

data class WebApp(
    @get:JsonProperty("servlet") val servlet: List<Servlet>?,
    @get:JsonProperty("servlet_mapping") val servlet_mapping: ServletMapping?,
    @get:JsonProperty("taglib") val taglib: Taglib?
)