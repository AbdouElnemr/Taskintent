package com.example.asar.taskintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class alarm_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_activity);

    }

    @Override
    protected void onStart() {
        Toast.makeText(getBaseContext(),"welcome to Alarm activity ",Toast.LENGTH_SHORT).show();
        super.onStart();
    }


    public void go(View view) {

        TimePicker timePicker=(TimePicker)findViewById(R.id.timePicker1);
        int hour=timePicker.getCurrentHour();
        int minute=timePicker.getCurrentMinute();
        String format;
        if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }

        Intent intent=new Intent(this,notification_activiy.class);
        intent.putExtra("hour",hour);
        intent.putExtra("minute",minute);
        intent.putExtra("format",format);
        startActivity(intent);

    }
}
