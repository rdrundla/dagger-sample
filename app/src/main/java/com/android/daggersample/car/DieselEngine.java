package com.android.daggersample.car;

import com.android.daggersample.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = DieselEngine.class.getSimpleName();

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: DieselEngine");
    }
}
