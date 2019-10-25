package com.sample.jacksongson.models.sample5

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample5(
    @get:JsonProperty("menu") val menu: Menu?
)