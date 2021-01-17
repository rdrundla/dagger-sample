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
    int provideHorsePower() {
        return this.horsePower;
    }

    @Provides
    Engine providePetrolEngine(PetrolEngine engine) {
        return engine;
    }
}
