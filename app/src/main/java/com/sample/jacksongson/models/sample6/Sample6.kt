package com.sample.jacksongson.models.sample6

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample6(
    @get:JsonProperty("colorList") val  colorList: List<ColorList>?
)
data class ColorList(
    @get:JsonProperty("colors") val  colors: List<Color>?)