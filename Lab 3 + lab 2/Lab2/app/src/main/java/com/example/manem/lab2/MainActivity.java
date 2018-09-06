package com.example.manem.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMgr1 = findViewById(R.id.button);
        Button buttonMgr2 = findViewById(R.id.button2);
        Button buttonMgr3 = findViewById(R.id.button3);
        Button buttonMgr4 = findViewById(R.id.button4);

        buttonMgr1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intentC1 = new Intent(MainActivity.this, Vibrador.class);
                startActivity(intentC1);
            }
        });

        buttonMgr2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intentC2 = new Intent(MainActivity.this, Proximity.class);
                startActivity(intentC2);
            }
        });

        buttonMgr3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intentC3 = new Intent(MainActivity.this, Notify.class);
                intentC3.putExtra("Message", "Notification");
                startActivity(intentC3);
            }
        });

        buttonMgr4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intentC4 = new Intent(MainActivity.this, ShowText.class);
                EditText text1 = findViewById(R.id.text1);
                String message = text1.getText().toString();
                intentC4.putExtra("message", message);
                startActivity(intentC4);

            }
        });
    }
}
