package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView Clock;
   // public String time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView Clock = findViewById(R.id.clock);

        Intent intent = getIntent();
        String time = intent.getStringExtra("message");

        Clock.setText(time);
        //Clock.setText(R.str);

    }
}
