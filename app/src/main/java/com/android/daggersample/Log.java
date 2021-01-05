package com.android.daggersample;

public class Log {
    private static final String TAG = "Car/";

    public static void d(String tag, String msg) {
        android.util.Log.d(TAG + tag, msg);
    }
}
