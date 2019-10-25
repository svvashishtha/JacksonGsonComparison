package com.sample.jacksongson.models.sample3

import com.fasterxml.jackson.annotation.JsonProperty

data class Window(
    @get:JsonProperty("height") val height: Int?,
    @get:JsonProperty("name") val name: String?,
    @get:JsonProperty("title") val title: String?,
    @get:JsonProperty("width") val width: Int?
)