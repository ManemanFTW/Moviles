package com.example.manem.lab2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Proximity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity);
        SensorManager sensorm = (SensorManager) getSystemService(SENSOR_SERVICE);
        final Sensor proximity = sensorm.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        if(proximity == null){
            Toast.makeText(Proximity.this, "Proximityu sensor off", Toast.LENGTH_SHORT).show();
        }

        AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
        DialogConf.setTitle("Proximity Sensor");
        DialogConf.setMessage("You are too close to the phone, set it away...");
        DialogConf.setIcon(R.mipmap.ic_launcher);

        DialogConf.setNeutralButton("OK, I got it!",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Do whatever you want here
                    }
                });
        final AlertDialog MyDialog = DialogConf.create();

        SensorEventListener proximitySensorListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < 4) {
                    // Detected something nearby
                    //getWindow().getDecorView().setBackgroundColor(Color.RED);
                    MyDialog.show();

                } else {
                    // Nothing is nearby
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };

        sensorm.registerListener(proximitySensorListener, proximity, sensorm.SENSOR_DELAY_NORMAL);

    }
}
