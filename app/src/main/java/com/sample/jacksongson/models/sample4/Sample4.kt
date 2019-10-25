package com.sample.jacksongson.models.sample4

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample4(
    @get:JsonProperty("web_app")val web_app: WebApp?
)