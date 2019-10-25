package com.sample.jacksongson.models.sample2

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample2(
    @get:JsonProperty("menu")val menu: Menu?
)