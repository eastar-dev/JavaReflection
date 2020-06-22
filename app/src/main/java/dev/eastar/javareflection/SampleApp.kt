package dev.eastar.javareflection

import android.content.Context
import android.util.Log
import android.widget.Toast

class SampleApp {
    val name: String = "I'm Sample " + javaClass.name
    fun printName(context: Context) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
        Log.e("tag", name)
    }
}