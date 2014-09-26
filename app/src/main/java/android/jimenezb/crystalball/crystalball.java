 package android.jimenezb.crystalball;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;


 public class crystalball extends Activity {
    private TextView answerText;
     private SensorManager sensormanager;
     private Sensor accelrometer;
     private float acceleration;
     private float currentacceleration;
     private float previousacceleration;
     private final SensorEventListener sensorListener = new SensorEventListener() {
         @Override
         public void onSensorChanged(SensorEvent event) {

         }

         @Override
         public void onAccuracyChanged(Sensor sensor, int accuracy) {

         }
     };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crystalball);

        sensormanager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        accelrometer = sensormanager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        acceleration = 0.0f;
        currentacceleration = SensorManager.GRAVITY_EARTH;
        previousacceleration = SensorManager.GRAVITY_EARTH;


    answerText = (TextView) findViewById(R.id.answerText);
     answerText.setText(Predictions.get().getprediction());
    }




     @Override
     protected void onResume() {
         super.onResume();
         sensormanager.registerListener(sensorListener, accelrometer, SensorManager.SENSOR_DELAY_NORMAL);
     }

     @Override
     protected void onPause() {
         super.onPause();
         sensormanager.unregisterListener(sensorListener);
     }
 }

