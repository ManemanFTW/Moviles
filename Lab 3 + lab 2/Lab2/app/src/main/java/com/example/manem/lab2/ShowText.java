package com.example.manem.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);
        Intent intentC4 = getIntent();
        String str = intentC4.getStringExtra("message");
        TextView tv = findViewById(R.id.textView2);
        tv.setText(str);
    }
}
