package com.sample.jacksongson.models.sample1

import com.fasterxml.jackson.annotation.JsonProperty

data class Glossary(
    @get:JsonProperty("GlossDiv") val GlossDiv: GlossDiv?,
    @get:JsonProperty("title") val title: String?
)