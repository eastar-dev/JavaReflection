package dev.eastar.common

import android.content.Context
import android.util.Log
import android.widget.Toast
import java.lang.reflect.Method

class SampleCommon {
    val name: String = "I'm Sample " + javaClass.name
    fun printName(context: Context) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
        Log.e("tag", name)

        val clz = Class.forName("dev.eastar.javareflection.SampleApp");
        val app = clz.newInstance()
        val appPrintNameMethod: Method = clz.getMethod("printName", Context::class.java)
        appPrintNameMethod.invoke(app, context)
    }
}