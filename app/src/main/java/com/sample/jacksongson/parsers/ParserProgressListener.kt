package com.sample.jacksongson.parsers

import com.sample.jacksongson.TemporalResult

interface ParserProgressListener {
    fun parserstarted()
    fun prserCycle(cycle: Int)
    fun parserFinished()
    fun deliverParsingTemporalResult(result: TemporalResult)

}