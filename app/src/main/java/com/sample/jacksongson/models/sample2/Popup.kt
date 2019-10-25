package com.sample.jacksongson.models.sample2

import com.fasterxml.jackson.annotation.JsonProperty

data class Popup(
    @get:JsonProperty("menuitem")val menuitem: List<Menuitem>
)