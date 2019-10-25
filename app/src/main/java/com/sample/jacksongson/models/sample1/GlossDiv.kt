package com.sample.jacksongson.models.sample1

import com.fasterxml.jackson.annotation.JsonProperty

data class GlossDiv(
    @get:JsonProperty("GlossList") val GlossList: GlossList?,
    @get:JsonProperty("title") val title: String?
)