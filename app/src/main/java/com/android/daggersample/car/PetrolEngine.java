package com.android.daggersample.car;

import com.android.daggersample.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = PetrolEngine.class.getSimpleName();

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "start: PetrolEngine");
    }
}
