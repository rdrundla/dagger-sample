package com.android.daggersample.dagger;

import com.android.daggersample.car.Engine;
import com.android.daggersample.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine engine);

}
