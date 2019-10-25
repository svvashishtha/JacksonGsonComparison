package com.sample.jacksongson.models.sample6

import com.fasterxml.jackson.annotation.JsonProperty

data class Code(
    @get:JsonProperty("hex") val hex: String,
    @get:JsonProperty("rgba") val rgba: List<Int>
)