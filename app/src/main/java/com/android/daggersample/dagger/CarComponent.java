package com.android.daggersample.dagger;

import com.android.daggersample.MainActivity;
import com.android.daggersample.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
