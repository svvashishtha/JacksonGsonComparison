package com.sample.jacksongson.parsers

import com.sample.jacksongson.Configuration

interface JsonParser {
    fun start(config: Configuration)
    fun setParserEventListener(parserProgressListener: ParserProgressListener)

}