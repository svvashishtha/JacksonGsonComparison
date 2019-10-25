package com.sample.jacksongson.parsers

import android.util.Log
import com.google.gson.Gson
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

class GsonParser(val appExecutors: AppExecutors) : JsonParser {

    val filename_offset = "sample"
    val TAG = "GsonParser"
    override fun start(config: Configuration) {

        appExecutors.diskIO().execute {
            var timeStart = System.currentTimeMillis()
            var avgTimeArray = LongArray(10) { 0 }
            val gson = Gson()
            //for sample 1
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
                    when (j) {
                        1 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample1::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1

                        }
                        2 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample2::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1

                        }
                        3 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample3::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1

                        }
                        4 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample4::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1

                        }
                        5 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample5::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1

                        }
                        6 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample6::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1
                        }
                        7 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample7::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1
                        }
                        8 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample8::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1
                        }
                        9 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample9::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1
                        }
                        10 -> {
                            var timeStart1 = System.currentTimeMillis()
                            val obj = gson.fromJson(sampleString, Sample10::class.java)
                            if (config.serializeAndDeserialize && sampleString != gson.toJson(obj)) {
                                Log.e(TAG, "sampleString = $sampleString i = $i j = $j")
                            }
                            var timeEnd1 = System.currentTimeMillis() - timeStart1
                            avgTimeArray[j - 1] += timeEnd1
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

    var parserProgressListener: ParserProgressListener? = null
    override fun setParserEventListener(parserProgressListener: ParserProgressListener) {
        this.parserProgressListener = parserProgressListener
    }

}