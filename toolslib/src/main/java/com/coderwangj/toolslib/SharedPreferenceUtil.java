package com.coderwangj.toolslib;

import android.content.Context;

/**
 * Created by WangJ on 2017/8/10.
 */

public class SharedPreferenceUtil {

    private static final String FILE_NAME = "";

    private static void putString(Context context, String name, String value) {
        context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
                .edit()
                .putString(name, value)
                .apply();
    }

    private static String getString(Context context, String name) {
        return context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
                .getString(name, "");
    }
}
