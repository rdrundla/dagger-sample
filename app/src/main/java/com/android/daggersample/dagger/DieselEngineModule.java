package com.android.daggersample.dagger;

import com.android.daggersample.car.DieselEngine;
import com.android.daggersample.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
