package com.sample.jacksongson.parsers

import android.util.Log
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.sample.jacksongson.*
import com.sample.jacksongson.models.sample1.Sample1
import com.sample.jacksongson.models.sample10.Sample10
import com.sample.jacksongson.models.sample2.Sample2
import com.sample.jacksongson.models.sample3.Sample3
import com.sample.jacksongson.models.sample4.Sample4
import com.sample.jacksongson.models.sample5.Sample5
import com.sample.jacksongson.models.sample6.Sample6
import com.sample.jacksongson.models.sample7.Sample7
import com.sample.jacksongson.models.sample8.Sample8
import com.sample.jacksongson.models.sample9.Sample9

class JacksonParser(val appExecutors: AppExecutors) : JsonParser {
    var parserProgressListener: ParserProgressListener? = null

    override fun setParserEventListener(parserProgressListener: ParserProgressListener) {
        this.parserProgressListener = parserProgressListener
    }

    private lateinit var mapper: ObjectMapper
    val filename_offset = "sample"
    val TAG = "JacksonParser"

    override fun start(config: Configuration) {
        appExecutors.diskIO().execute {
            var timeStart = System.currentTimeMillis()
            var avgTimeArray = LongArray(10) { 0 }
            mapper = jacksonObjectMapper()
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            appExecutors.mainThread().execute {
                parserProgressListener?.parserstarted()
            }

            for (i in 0..config.iterations) {
                appExecutors.mainThread().execute {
                    parserProgressListener?.prserCycle(i)
                }
                for (j in 1..10) {
                    val sampleString = Utilities.loadJSONFromAsset(
                        SampleApplication.getSampleApplication(),
                        filename_offset + j.toString()
                    )
                    when (i) {
                        1 -> {
                            val obj = mapper.readValue<Sample1>(sampleString)
                            if (config.serializeAndDeserialize && sampleString != mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }

                        }
                        2 -> {
                            val obj = mapper.readValue<Sample2>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        3 -> {
                            val obj = mapper.readValue<Sample3>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        4 -> {
                            val obj = mapper.readValue<Sample4>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        5 -> {
                            val obj = mapper.readValue<Sample5>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        6 -> {
                            val obj = mapper.readValue<Sample6>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        7 -> {
                            val obj = mapper.readValue<Sample7>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        8 -> {
                            val obj = mapper.readValue<Sample8>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        9 -> {
                            val obj = mapper.readValue<Sample9>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                        10 -> {
                            val obj = mapper.readValue<Sample10>(sampleString)
                            if (config.serializeAndDeserialize && sampleString !=  mapper.writeValueAsString(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i")
                            }
                        }
                    }



                }


            }
            var timeEnd = System.currentTimeMillis() - timeStart
            appExecutors.mainThread().execute {
                parserProgressListener?.deliverParsingTemporalResult(TemporalResult(timeEnd,avgTimeArray))
            }
            appExecutors.mainThread().execute {
                parserProgressListener?.parserFinished()
            }
        }
    }


}
