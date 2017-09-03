package com.example.saha.myapplication;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rooztime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooztime);
    }
    public void oni(View view){
        Intent a=new Intent (getApplicationContext(),s3.class);
        startActivity(a);


    }
    public void on(View view){
        /*NotificationCompat.Builder mBuilder =   new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.abi) // notification icon
                .setContentTitle("Notification!") // title for notification
                .setContentText("kelidestan.com") // message for notification
                .setAutoCancel(true); // clear notification after click
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(0, mBuilder.build());*/
        Intent a=new Intent (getApplicationContext(),s2.class);
        startActivity(a);


    }
}
