package com.sample.jacksongson.models.sample2

import com.fasterxml.jackson.annotation.JsonProperty

data class Menu(
    @get:JsonProperty("id")val id: String?,
    @get:JsonProperty("popup")val popup: Popup?,
    @get:JsonProperty("value")val value: String?
)