package com.android.daggersample.car;

import com.android.daggersample.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = Car.class.getSimpleName();

    @Inject
    Engine engine;

    @Inject
    Driver driver;

    private final Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "drive: Driver: " + driver.hashCode() + " Drives Car: " + this.hashCode());
    }
}
