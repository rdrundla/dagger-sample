package com.android.daggersample.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }
}
