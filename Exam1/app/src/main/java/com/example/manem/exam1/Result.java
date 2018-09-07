package com.example.manem.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Result extends AppCompatActivity {
    public int contp = 0;
    public int contpc = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intentC4 = getIntent();
        int res = 0;
        //int contp = 0;
        //int contpc = 0;
        res = intentC4.getIntExtra("result", res);
        Random myrand = new Random();
        int pc = myrand.nextInt(3) + 1;

        TextView text = findViewById(R.id.text);
        TextView player = findViewById(R.id.player);
        TextView computer = findViewById(R.id.pc);
        Button reset = findViewById(R.id.score);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contp = 0;
                contpc = 0;
                TextView player = findViewById(R.id.player);
                TextView computer = findViewById(R.id.pc);
                player.setText(String.valueOf(contp));
                computer.setText(String.valueOf(contpc));
            }
        });

        String string0 = "Something went wrong... No points";
        String string1 = "Draw... No points";
        String string2 = "You Won: Rock beats Scissor";
        String string3 = "You Lost: Paper beats Rock";
        String string4 = "You Lost: Scissor beats Paper";
        String string5 = "You Won: Paper beats Rock";
        String string6 = "You won: Scissors beats paper";
        String string7 = "You lost: Rock beats scissors";

        if (res == 0){
            text.setText(string0);
        } else if (res == pc){
            player.setText(String.valueOf(contp));
            computer.setText(String.valueOf(contpc));
            text.setText(string1);
        } else if (res == 1 && pc == 3){
            contp += 1;
            player.setText(String.valueOf(contp));
            computer.setText(String.valueOf(contpc));
            text.setText(string2);
        } else if (res == 1 && pc == 2){
            contpc++;
            player.setText(String.valueOf(contp));
            computer.setText(String.valueOf(contpc));
            text.setText(string3);
        } else if (res == 2 && pc == 3){
            contpc++;
            player.setText(String.valueOf(contp));
            computer.setText(String.valueOf(contpc));
            text.setText(string4);
        } else if (res == 2 && pc == 1){
            contp++;
            player.setText(String.valueOf(contp));
            computer.setText(String.valueOf(contpc));
            text.setText(string5);
        } else if (res == 3 && pc == 2){
            contp++;
            player.setText(String.valueOf(contp));
            computer.setText(String.valueOf(contpc));
            text.setText(string6);
        } else if (res == 3 && pc == 1){
            contpc++;
            player.setText(String.valueOf(contp));
            computer.setText(String.valueOf(contpc));
            text.setText(string7);
        }
    }
}
