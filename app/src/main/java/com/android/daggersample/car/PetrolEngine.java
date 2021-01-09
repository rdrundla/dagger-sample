package com.android.daggersample.car;

import com.android.daggersample.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = PetrolEngine.class.getSimpleName();

    private final int horsePower;
    private final int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: PetrolEngine... " +
                "\nhorsePower : " + horsePower +
                "\nengineCapacity : " + engineCapacity);
    }
}
