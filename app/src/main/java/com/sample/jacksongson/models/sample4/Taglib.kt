package com.sample.jacksongson.models.sample4

import com.fasterxml.jackson.annotation.JsonProperty

data class Taglib(
    @get:JsonProperty("taglib_location") val taglib_location: String?,
    @get:JsonProperty("taglib_uri") val taglib_uri: String?
)