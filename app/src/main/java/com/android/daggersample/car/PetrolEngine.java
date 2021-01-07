package com.android.daggersample.car;

import com.android.daggersample.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = PetrolEngine.class.getSimpleName();

    private final int horsePower;

    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: PetrolEngine... horsepower : " + horsePower);
    }
}
