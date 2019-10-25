package com.sample.jacksongson.models.sample10

import com.fasterxml.jackson.annotation.JsonProperty

data class Image(
    @get:JsonProperty("height") val  height: Int?,
    @get:JsonProperty("url") val  url: String?,
    @get:JsonProperty("width") val  width: Int?
)