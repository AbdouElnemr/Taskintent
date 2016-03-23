package com.example.asar.taskintent;

import android.app.Activity;
import android.content.Intent;
 import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Toast.makeText(getBaseContext(),"welcome to login activity",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    public void check(View view) {

        EditText text1=(EditText)findViewById(R.id.edit1);
        EditText text2=(EditText)findViewById(R.id.edit2);
        String user=text1.getText().toString();
        String pass=text2.getText().toString();

         if(user.equals("") ){
                text1.setError("please,enter username");
         }
         if (pass.equals("")){

            text2.setError("Please,enter password");


        }


             if (user.equals("aaa") && pass.equals("aaa")) {

                 Intent i = new Intent(this, alarm_activity.class);
                 startActivity(i);


             } else {

                 Toast.makeText(getBaseContext(), "user name or password is invalid", Toast.LENGTH_SHORT).show();
             }





         }




        }




