package com.sample.jacksongson.models.sample3

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample3(
    @get:JsonProperty("widget") val widget: Widget?
)