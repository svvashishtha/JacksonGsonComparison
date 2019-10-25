package com.sample.jacksongson.models.sample9

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample9(
    @get:JsonProperty("batters_list") val batters_list: List<BatterClass>?
)

data class BatterClass(
    @get:JsonProperty("batters") val batters: Batters?,
    @get:JsonProperty("id") val id: String?,
    @get:JsonProperty("name") val name: String?,
    @get:JsonProperty("ppu") val ppu: Double?,
    @get:JsonProperty("topping") val topping: List<Topping>?,
    @get:JsonProperty("type") val type: String?
)