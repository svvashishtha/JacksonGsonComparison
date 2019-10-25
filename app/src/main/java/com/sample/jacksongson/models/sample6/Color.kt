package com.sample.jacksongson.models.sample6

import com.fasterxml.jackson.annotation.JsonProperty

data class Color(
    @get:JsonProperty("category") val  category: String?,
    @get:JsonProperty("code") val  code: Code?,
    @get:JsonProperty("color") val  color: String?,
    @get:JsonProperty("type") val  type: String?
)