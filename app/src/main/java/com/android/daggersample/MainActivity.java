package com.android.daggersample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();
        car.drive();
    }
}
