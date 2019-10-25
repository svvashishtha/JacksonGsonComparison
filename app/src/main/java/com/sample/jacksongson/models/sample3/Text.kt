package com.sample.jacksongson.models.sample3

import com.fasterxml.jackson.annotation.JsonProperty

data class Text(
    @get:JsonProperty("alignment")val alignment: String?,
    @get:JsonProperty("data")val data: String?,
    @get:JsonProperty("hOffset")val hOffset: Int?,
    @get:JsonProperty("name")val name: String?,
    @get:JsonProperty("onMouseUp")val onMouseUp: String?,
    @get:JsonProperty("size")val size: Int?,
    @get:JsonProperty("style")val style: String?,
    @get:JsonProperty("vOffset")val vOffset: Int?
)