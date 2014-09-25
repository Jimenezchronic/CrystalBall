 package android.jimenezb.crystalball;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;


 public class crystalball extends Activity {
    private TextView answerText;
     private SensorManager sensormanager;
     private Sensor accerometer;
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

    answerText = (TextView) findViewById(R.id.answerText);
     answerText.setText(Predictions.get().getprediction());
    }

     @Override
     protected void onResume() {
         super.onResume();
     }

     @Override
     protected void onPause() {
         super.onPause();
     }
 }

