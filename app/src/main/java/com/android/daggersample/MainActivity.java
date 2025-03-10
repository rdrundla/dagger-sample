package com.android.daggersample;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.android.daggersample.car.Car;
import com.android.daggersample.dagger.ActivityComponent;
import com.android.daggersample.dagger.PetrolEngineModule;

import javax.inject.Inject;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    // Field can not be private if need to be injected
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((DaggerApp) getApplication()).getAppComponent()
                .getActivityComponentFactory()
                .create(150, 2000);

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
