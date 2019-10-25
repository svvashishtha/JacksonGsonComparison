package com.sample.jacksongson.models.sample4

import com.fasterxml.jackson.annotation.JsonProperty

data class Servlet(
    @get:JsonProperty("init_param")val init_param: InitParam?,
    @get:JsonProperty("servlet_class")val servlet_class: String?,
    @get:JsonProperty("servlet_name")val servlet_name: String?
)