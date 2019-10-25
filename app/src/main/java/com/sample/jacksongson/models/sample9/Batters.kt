package com.sample.jacksongson.models.sample9

import com.fasterxml.jackson.annotation.JsonProperty

data class Batters(
    @get:JsonProperty("batter") val  batter: List<Batter>
)