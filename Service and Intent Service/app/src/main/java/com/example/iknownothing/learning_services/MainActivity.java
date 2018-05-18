package com.example.iknownothing.learning_services;

import android.Manifest;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
Button start,stop;
static int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       /* if(Build.VERSION.SDK_INT >=23 && ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED)
        {
            requestPermissions(new String[]
                    {Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION},100);

        }*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=findViewById(R.id.startService);
        stop=findViewById(R.id.stopService);
        text=findViewById(R.id.text);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startService(new Intent(MainActivity.this,IntentService.class));
                    text.setText("Media Player is Running"+counter);
                    }
        });

        stop.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v)
           {
               stopService(new Intent(MainActivity.this,IntentService.class));
               text.setText("Media Player is Stopped"+counter);

           }

        });
    }
}
