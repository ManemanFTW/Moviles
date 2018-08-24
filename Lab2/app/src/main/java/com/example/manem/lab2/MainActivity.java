package com.example.manem.lab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        private buttonMgr1;
        private buttonMgr2;
        private buttonMgr3;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMgr1 = findViewById(R.id.button);
        buttonMgr2 = findViewById(R.id.button2);
        buttonMgr3 = findViewById(R.id.button3);
        editTextMgr = findViewById(R.id.editText);
        txtViewMgr = findViewById(R.id.textView);

        buttonMgr1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intentC1 = new Intent(MainActivity.this);
                startActivity(intentC1);
            }
        });

        buttonMgr2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                myString = editTextMgr.getText().toString();
                Intent intentC2 = new Intent(MainActivity.this, Main2Activity);
                intentC1.putExtra("theString", myString);
                startActivity(intentC2);
            }
        });

        buttonMgr3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intentC3 = new Intent(MainActivity2.this, Main3Activity);
                startActivity(intentC3);
            }
        });

        buttonMgr3.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               n = n++;
               txtViewMgr.setText("Button 3 click");
           }
        });

    }
}
