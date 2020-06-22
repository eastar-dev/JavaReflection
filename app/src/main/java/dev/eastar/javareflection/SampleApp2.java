package dev.eastar.javareflection;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class SampleApp2 {
    private static final String name = "I'm " + SampleApp2.class.getName();

    public void printName(Context context) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
        Log.e("tag", name);
    }
}
