package com.sample.jacksongson.models.sample5

import com.fasterxml.jackson.annotation.JsonProperty

data class Item(
    @get:JsonProperty("id") val id: String?,
    @get:JsonProperty("label") val label: String?
)