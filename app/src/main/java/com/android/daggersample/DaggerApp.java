package com.android.daggersample;

import android.app.Application;

import com.android.daggersample.dagger.AppComponent;
import com.android.daggersample.dagger.DaggerAppComponent;
import com.android.daggersample.dagger.DriverModule;

public class DaggerApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.factory()
                .create(new DriverModule("Rd Rundla"));
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
