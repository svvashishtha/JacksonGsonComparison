package com.sample.jacksongson.models.sample3

import com.fasterxml.jackson.annotation.JsonProperty

data class Widget(
    @get:JsonProperty("debug") val debug: String?,
    @get:JsonProperty("image") val image: Image?,
    @get:JsonProperty("text") val text: Text?,
    @get:JsonProperty("window") val window: Window?
)