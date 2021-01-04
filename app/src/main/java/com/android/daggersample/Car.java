package com.android.daggersample;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = Car.class.getSimpleName();

    @Inject
    Engine engine;

    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "drive: driving...");
    }
}
