package com.android.daggersample.dagger;

import com.android.daggersample.car.Rims;
import com.android.daggersample.car.Tiers;
import com.android.daggersample.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tiers provideTiers() {
        Tiers tiers = new Tiers();
        tiers.inflate();
        return tiers;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tiers tiers) {
        return new Wheels(rims, tiers);
    }
}
