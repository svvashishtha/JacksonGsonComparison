package com.sample.jacksongson.models.sample7

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample7(
    @get:JsonProperty("color_values") val  color_values: List<Color>?
)

data class Color(
    @get:JsonProperty("color") val  color: String?,
    @get:JsonProperty("value") val  value: String?
)