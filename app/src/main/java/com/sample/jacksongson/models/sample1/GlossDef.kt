package com.sample.jacksongson.models.sample1

import com.fasterxml.jackson.annotation.JsonProperty

data class GlossDef(
    @get:JsonProperty("GlossSeeAlso")val GlossSeeAlso: List<String>?,
    @get:JsonProperty("para")val para: String?
)