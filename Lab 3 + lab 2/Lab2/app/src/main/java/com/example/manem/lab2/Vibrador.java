package com.example.manem.lab2;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Vibrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrador);
        Toast.makeText(this, "vibrando", Toast.LENGTH_SHORT).show();
        Vibrator myvibrator =
                (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        myvibrator.vibrate(100);
        //Toast.makeText(myvibrador.this, "The phone is vibrating", Toast.LENGTH_SHORT).show();
    }
}
