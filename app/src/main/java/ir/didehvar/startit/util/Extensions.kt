package ir.didehvar.startit.util

import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE


fun View.hide() {
    visibility = GONE
}

fun View.show() {
    visibility = VISIBLE
}
