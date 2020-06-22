package dev.eastar.common

import android.content.Context
import android.util.Log
import android.widget.Toast

class SampleCommon {
    val name: String = "I'm Sample " + javaClass.name
    fun printName(context: Context) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
        Log.e("tag", name)
    }
}