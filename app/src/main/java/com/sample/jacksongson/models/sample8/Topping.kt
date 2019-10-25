package com.sample.jacksongson.models.sample8

import com.fasterxml.jackson.annotation.JsonProperty

data class Topping(
    @get:JsonProperty("id") val  id: String?,
    @get:JsonProperty("type") val  type: String?
)