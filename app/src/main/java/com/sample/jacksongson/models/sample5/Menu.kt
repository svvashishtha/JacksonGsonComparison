package com.sample.jacksongson.models.sample5

import com.fasterxml.jackson.annotation.JsonProperty

data class Menu(
    @get:JsonProperty("header") val header: String?,
    @get:JsonProperty("items") val items: List<Item>?
)