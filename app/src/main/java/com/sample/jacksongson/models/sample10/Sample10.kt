package com.sample.jacksongson.models.sample10

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample10(
    @get:JsonProperty("id") val  id: String?,
    @get:JsonProperty("image") val  image: Image?,
    @get:JsonProperty("name") val  name: String?,
    @get:JsonProperty("thumbnail") val  thumbnail: Thumbnail?,
    @get:JsonProperty("type") val  type: String?
)