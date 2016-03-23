package com.example.asar.taskintent;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.TimeZone;

public class notification_activiy extends AppCompatActivity {
    Bundle b;



    public Calendar calendar;
     NotificationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_activiy);
        calendar=Calendar.getInstance(TimeZone.getTimeZone("GMT-4:00"));
        b=getIntent().getExtras();
        int hoursys = calendar.get(Calendar.HOUR);
        int minsys = calendar.get(Calendar.MINUTE);
        TextView textView=(TextView)findViewById(R.id.large);

       int hour=  b.getInt("hour");
        int minute = b.getInt("minute");
        String format = b.getString("format");
        textView.setText(new StringBuilder().append(hour).append(" : ").append(minute).append(" ").append(format));

        if(hour==hoursys&& minute==minsys) {


            Notification n = new Notification.Builder(this)
                    .setContentTitle("New mail from " + "test@gmail.com")
                    .setContentText("Subject")
                    .setSmallIcon(R.drawable.alarm)
                    .setAutoCancel(true)
                    .setDefaults(Notification.DEFAULT_SOUND)
                    .build();
            NotificationManager notificationManager =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.notify(0, n);
        }

    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getBaseContext(),"you are most welcome",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}







