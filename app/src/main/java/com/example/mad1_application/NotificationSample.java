package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class NotificationSample extends AppCompatActivity {
    private static final String CHANNEL_ID = "My Channel";
    private static final int NOTIFICATION_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_sample);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification ;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this)
                   // .setSmallIcon(R.drawable.icon)
                    .setContentText("New Message")
                    .setSubText("New Notification from your App")
                    .setChannelId(CHANNEL_ID)
                    .build();
            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "new channel", NotificationManager.IMPORTANCE_HIGH));
        }
        else{
            notification = new Notification.Builder(this)
                    //.setSmallIcon(R.drawable.icon)
                    .setContentText("New Message")
                    .setSubText("New Notification from your App")
                    .build();
        }

        nm.notify(NOTIFICATION_ID, notification);

    }
}