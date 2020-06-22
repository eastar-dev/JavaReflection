package dev.eastar.javareflection

import android.content.Context
import android.util.Log
import android.widget.Toast

class OuterApp {
    val name: String = "I'm " + javaClass.name
    inner class InnerApp {
        fun printName(context: Context) {
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
            Log.e("tag", name)
        }
    }
}