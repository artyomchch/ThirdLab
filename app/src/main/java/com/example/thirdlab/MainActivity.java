package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Checktime;
    Button ResultApp;
    Button SystemIntents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Checktime = findViewById(R.id.checktime);
        Checktime.setOnClickListener(this);

        ResultApp =findViewById(R.id.resultApp);
        ResultApp.setOnClickListener(this);

        SystemIntents = findViewById(R.id.systemintents);
        SystemIntents.setOnClickListener(this);

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.checktime:
                checktime();
                break;
            case R.id.resultApp:
                data();
                break;
            case R.id.systemintents:
                googlemaps();
                break;

        }

    }


    public void checktime(){
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));
        System.out.println(dateString);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", dateString);
        startActivity(intent);
    }

    public void data(){
        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }

    public void googlemaps(){
        Intent intent = new Intent(this, GoogleMaps.class);
        startActivity(intent);
    }
    }



