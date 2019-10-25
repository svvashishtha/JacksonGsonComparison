package com.sample.jacksongson.models.sample8

import com.fasterxml.jackson.annotation.JsonProperty

data class Batters(
    @get:JsonProperty("batter") val  batter: List<Batter>?
)