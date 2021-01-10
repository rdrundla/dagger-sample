package com.android.daggersample;

import android.app.Application;

import com.android.daggersample.dagger.AppComponent;
import com.android.daggersample.dagger.DaggerAppComponent;

public class DaggerApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
