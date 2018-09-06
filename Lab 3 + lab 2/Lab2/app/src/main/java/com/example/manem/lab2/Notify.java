package com.example.manem.lab2;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Notify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);

        NotificationCompat.Builder NotifBuilder = new
                NotificationCompat.Builder(this);
        NotifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        NotifBuilder.setContentTitle("This is my shiny notification!");
        NotifBuilder.setContentText("This is the detail of the notification");

        NotificationManager MyNotification = (NotificationManager)
                getSystemService(Context.NOTIFICATION_SERVICE);
        MyNotification.notify(2, NotifBuilder.build());
    }
}