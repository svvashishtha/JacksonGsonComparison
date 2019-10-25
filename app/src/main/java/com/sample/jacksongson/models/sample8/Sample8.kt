package com.sample.jacksongson.models.sample8

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample8(
    @get:JsonProperty("batters") val  batters: Batters?,
    @get:JsonProperty("id") val  id: String?,
    @get:JsonProperty("name") val  name: String?,
    @get:JsonProperty("ppu") val  ppu: Double?,
    @get:JsonProperty("topping") val  topping: List<Topping>?,
    @get:JsonProperty("type") val  type: String?
)