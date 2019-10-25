package com.sample.jacksongson.models.sample2

import com.fasterxml.jackson.annotation.JsonProperty

data class Menuitem(
    @get:JsonProperty("onclick") val onclick: String?,
    @get:JsonProperty("value") val value: String?
)