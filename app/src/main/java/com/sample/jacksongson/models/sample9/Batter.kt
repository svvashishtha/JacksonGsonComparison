package com.sample.jacksongson.models.sample9

import com.fasterxml.jackson.annotation.JsonProperty

data class Batter(
    @get:JsonProperty("id") val  id: String,
    @get:JsonProperty("type") val  type: String
)