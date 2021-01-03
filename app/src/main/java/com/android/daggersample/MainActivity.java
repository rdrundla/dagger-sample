package com.android.daggersample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import javax.inject.Inject;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    // Field can not be private if need to be injected
    @Inject
    Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        car.drive();
    }
}
