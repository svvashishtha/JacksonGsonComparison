package com.sample.jacksongson.models.sample1

import com.fasterxml.jackson.annotation.JsonProperty

data class Sample1(
    @get:JsonProperty("glossary")  val glossary: Glossary?
)