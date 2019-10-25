package com.sample.jacksongson.models.sample3

import com.fasterxml.jackson.annotation.JsonProperty

data class Image(
    @get:JsonProperty("alignment") val alignment: String?,
    @get:JsonProperty("hOffset") val hOffset: Int?,
    @get:JsonProperty("name") val name: String?,
    @get:JsonProperty("src") val src: String?,
    @get:JsonProperty("vOffset") val vOffset: Int?
)