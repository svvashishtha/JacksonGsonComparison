package com.sample.jacksongson

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatTextView


class ExpandableTitleTextview @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0

) : AppCompatTextView(context, attrs, defStyleAttr), View.OnClickListener {
    init {
        setOnClickListener(this)
    }

    private var expanded = false // first state is "state_collapsed"


    override fun onClick(v: View?) {
        changeState()
    }

    private fun changeState() {
        expanded = if (!expanded) {
            setCompoundDrawablesWithIntrinsicBounds(
                resources.getDrawable(R.drawable.ic_expand_less_black_24dp, null),
                null,
                null,
                null
            )
            true
        } else {
            setCompoundDrawables(
                resources.getDrawable(R.drawable.ic_expand_more_black_24dp, null),
                null,
                null,
                null
            )
            false
        }
    }


}