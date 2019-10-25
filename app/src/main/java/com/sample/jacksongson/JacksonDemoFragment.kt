package com.sample.jacksongson

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sample.jacksongson.parsers.ParserImplType
import kotlinx.android.synthetic.main.fragment_jackson_demo.*


class JacksonDemoFragment : Fragment() {

    private var listener: Navigation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jackson_demo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        close_button.setOnClickListener {
            listener?.closeButtonCLicked()
        }
        start_parser.setOnClickListener {
            listener?.startParser(getConfigurationFromViews())
        }
    }

    private fun getConfigurationFromViews(): Configuration {
        val iterations = iterations_text.text.toString().toInt()
        val serializeAndDeserialize =
            serialize_radiogroup.checkedRadioButtonId == R.id.serialize_deserialize_checkbox
        return Configuration(iterations, serializeAndDeserialize, ParserImplType.JACKSON)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Navigation) {
            listener = context
        } else {
            throw RuntimeException("$context must implement Navigation")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            JacksonDemoFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}
