package com.mfcwl.servicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void StartedService(View view) {

        Intent in = new Intent(MainActivity.this,Start_Service.class);
        in.putExtra("sleept",1);
        startService(in);
    }


    public void StopService(View view) {

        Intent in =new Intent(MainActivity.this,Start_Service.class);
        stopService(in);

        Intent ins =new Intent(MainActivity.this,Start_Service.class);
        stopService(ins);

        //** The service calling time manipluation methods**//


    }


}
