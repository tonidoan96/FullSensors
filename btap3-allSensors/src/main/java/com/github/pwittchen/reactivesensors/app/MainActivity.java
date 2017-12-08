
package com.github.pwittchen.reactivesensors.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.github.pwittchen.reactivesensors.R;
import com.github.pwittchen.reactivesensors.app.samples.*;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewAndSetOnClickListener(R.id.b_gyroscope, GyroscopeActivity.class);
    findViewAndSetOnClickListener(R.id.b_orientation, OrientationActivity.class);
    findViewAndSetOnClickListener(R.id.b_accelerometer, AccelerometerActivity.class);
    findViewAndSetOnClickListener(R.id.b_ambient_temperature, AmbientTemperatureActivity.class);
    findViewAndSetOnClickListener(R.id.b_gravity, GravityActivity.class);
    findViewAndSetOnClickListener(R.id.b_light, LightActivity.class);
    findViewAndSetOnClickListener(R.id.b_linear_acceleration, LinearAccelerationActivity.class);
    findViewAndSetOnClickListener(R.id.b_magnetic_field, MagneticFieldActivity.class);
    findViewAndSetOnClickListener(R.id.b_pressure, PressureActivity.class);
    findViewAndSetOnClickListener(R.id.b_proximity, ProximityActivity.class);
    findViewAndSetOnClickListener(R.id.b_relative_humidity, RelativeHumidityActivity.class);
    findViewAndSetOnClickListener(R.id.b_rotation_vector, RotationVectorActivity.class);
    findViewAndSetOnClickListener(R.id.b_temperature, TemperatureActivity.class);
  }

  private void findViewAndSetOnClickListener(int viewId, final Class<?> cls) {
    findViewById(viewId).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
      }
    });
  }
}
