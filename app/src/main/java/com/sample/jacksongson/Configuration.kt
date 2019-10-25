package com.sample.jacksongson

import com.sample.jacksongson.parsers.ParserImplType

data class Configuration (
    val iterations: Int,
    val serializeAndDeserialize : Boolean,
    val parser : ParserImplType
    )