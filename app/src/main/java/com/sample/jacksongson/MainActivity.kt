package com.sample.jacksongson

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sample.jacksongson.parsers.GsonParser
import com.sample.jacksongson.parsers.JacksonParser
import com.sample.jacksongson.parsers.ParserImplType
import com.sample.jacksongson.parsers.ParserProgressListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Navigation {
    override fun startParser(config: Configuration) {
        if (config.parser == ParserImplType.JACKSON) {
            jacksonParser?.start(config)
        } else if (config.parser == ParserImplType.GSON) {
            gsonParser?.start(config)
        }
        closeButtonCLicked()
    }

    var jacksonParser: JacksonParser? = null
    var gsonParser: GsonParser? = null
    override fun closeButtonCLicked() {
        supportFragmentManager.findFragmentById(R.id.container)?.let {
            supportFragmentManager.beginTransaction().remove(
                it
            )
        }
        container.visibility = View.GONE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpParsers()
    }

    private fun setUpParsers() {
        setUpJackson()
        setUpGson()
    }

    private fun setUpGson() {
        gson_demo.setOnClickListener {
            container.visibility = View.VISIBLE
            supportFragmentManager.beginTransaction()
                .add(R.id.container, GsonDemoFragment.newInstance()).commit()
        }
        gsonParser = GsonParser(AppExecutors())
        gsonParser?.parserProgressListener = object : ParserProgressListener {

            override fun deliverParsingTemporalResult(result: TemporalResult) {
                average_time_gson_value.visibility = View.VISIBLE
                average_time_gson.visibility = View.VISIBLE
                total_time_gson_value.visibility = View.VISIBLE
                total_time_gson.visibility = View.VISIBLE

                total_time_gson_value.text = result.totalTime.toString()

            }

            override fun parserstarted() {
                progress_bar_gson.visibility = View.VISIBLE
                current_iteration_gson_value.visibility = View.VISIBLE
                current_iteration_gson.visibility = View.VISIBLE
            }

            override fun prserCycle(cycle: Int) {
                current_iteration_gson_value.text = cycle.toString()
            }

            override fun parserFinished() {
                progress_bar_gson.visibility = View.INVISIBLE
                current_iteration_gson_value.visibility = View.VISIBLE
                current_iteration_gson.visibility = View.VISIBLE
            }


        }
    }

    private fun setUpJackson() {
        jackson_demo.setOnClickListener {
            container.visibility = View.VISIBLE
            supportFragmentManager.beginTransaction()
                .add(R.id.container, JacksonDemoFragment.newInstance()).commit()
        }
        jacksonParser = JacksonParser(AppExecutors())
        jacksonParser?.parserProgressListener = object : ParserProgressListener {

            override fun deliverParsingTemporalResult(result: TemporalResult) {
                average_time_jack_value.visibility = View.VISIBLE
                average_time_jack.visibility = View.VISIBLE
                total_time_jack_value.visibility = View.VISIBLE
                total_time_jack.visibility = View.VISIBLE

                total_time_jack_value.text = result.totalTime.toString()
            }

            override fun parserstarted() {
                progress_bar_jackson.visibility = View.VISIBLE
                current_iteration_jackson_value.visibility = View.VISIBLE
                current_iteration_jackson.visibility = View.VISIBLE
            }

            override fun prserCycle(cycle: Int) {
                current_iteration_jackson_value.text = cycle.toString()
            }

            override fun parserFinished() {
                progress_bar_jackson.visibility = View.INVISIBLE
                current_iteration_jackson_value.visibility = View.VISIBLE
                current_iteration_jackson.visibility = View.VISIBLE
            }

        }
    }
}
