package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity implements View.OnClickListener {

    Button Answer;
    private TextView textViewResult;
    private final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Answer = findViewById(R.id.answer);
        Answer.setOnClickListener(this);

        textViewResult = findViewById(R.id.textViewResult);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            String university = data.getStringExtra("name");
            setUniversityTextView(university);
            Log.d("myLogs", "something change? " );
        }

    }



    public void setUniversityTextView(String university){
        textViewResult.setText(university);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.answer:
                clickAnswer();
                break;
            default:
                break;
        }
    }

    public void clickAnswer(){
        Intent intent = new Intent(this, DataActivity2.class);
        startActivityForResult(intent, REQUEST_CODE);

    }
}
