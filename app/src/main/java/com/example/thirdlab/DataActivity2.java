package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button Send;
    private EditText universityEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);

        Send = findViewById(R.id.send);
        Send.setOnClickListener(this);

        universityEditText = findViewById(R.id.editText);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.send:
                toSend();
                break;
            default:
                break;
        }
    }


    public void toSend(){
        Intent intent = new Intent(this, DataActivity.class);
        intent.putExtra("name", universityEditText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();

    }
}
