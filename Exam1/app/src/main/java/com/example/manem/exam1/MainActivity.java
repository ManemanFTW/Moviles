package com.example.manem.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rockb = findViewById(R.id.rock);
        Button paperb = findViewById(R.id.paper);
        Button scissb = findViewById(R.id.scissors);

        rockb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB1 = new Intent(MainActivity.this, Result.class);
                int r = 1;
                intentB1.putExtra("result", r);
                startActivity(intentB1);

            }
        });

        paperb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentB2 = new Intent(MainActivity.this, Result.class);
                int r = 2;
                intentB2.putExtra("result", r);
                startActivity(intentB2);
            }
        });

        scissb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentB3 =  new Intent(MainActivity.this, Result.class);
                int r = 3;
                intentB3.putExtra("result", r);
                startActivity(intentB3);
            }
        });
    }
}
