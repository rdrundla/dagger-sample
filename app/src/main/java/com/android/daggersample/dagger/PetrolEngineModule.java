package com.android.daggersample.dagger;

import com.android.daggersample.car.Engine;
import com.android.daggersample.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    private final int horsePower;

    public PetrolEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new PetrolEngine(horsePower);
    }
}
