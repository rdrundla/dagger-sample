package com.android.daggersample.car;

import com.android.daggersample.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements Engine {
    private static final String TAG = DieselEngine.class.getSimpleName();

    private final int horsePower;
    private final int engineCapacity;

    @Inject
    public DieselEngine(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: DieselEngine " +
                ", horsePower: " + horsePower +
                ", engineCapacity: " + engineCapacity);
    }
}
