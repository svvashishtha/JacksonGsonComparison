package com.sample.jacksongson.models.sample1

import com.fasterxml.jackson.annotation.JsonProperty

data class GlossList(
    @get:JsonProperty("GlossEntry")val GlossEntry: GlossEntry?
)