package com.sample.jacksongson.models.sample1

import com.fasterxml.jackson.annotation.JsonProperty

data class GlossEntry(

    @get:JsonProperty("Abbrev")val Abbrev: String?,

    @get:JsonProperty("Acronym")val Acronym: String?,

    @get:JsonProperty("GlossDef")val GlossDef: GlossDef?,

    @get:JsonProperty("GlossSee")val GlossSee: String?,

    @get:JsonProperty("GlossTerm")val GlossTerm: String?,

    @get:JsonProperty("ID")val ID: String?,

    @get:JsonProperty("SortAs")val SortAs: String?
)