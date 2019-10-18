package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoogleMaps extends AppCompatActivity implements View.OnClickListener {
    Button Call;
    Button Browser;
    Button Maps;
    Button Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);

        Call = findViewById(R.id.call);
        Call.setOnClickListener(this);

        Browser = findViewById(R.id.browser);
        Browser.setOnClickListener(this);

        Maps = findViewById(R.id.maps);
        Maps.setOnClickListener(this);

        Fragment = findViewById(R.id.maps);
        Fragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.call:
                onClickCall(view);
                break;
            case R.id.browser:
                onClickOpenBrowser(view);
                break;
            case R.id.maps:
                onClickOpenMaps(view);
                break;

        }
    }


    public void onClickCall(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:89811112233"));
        startActivity(intent);
    }
    public void onClickOpenBrowser(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://developer.android.com"));
        startActivity(intent);
    }
    public void onClickOpenMaps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:55.749479,37.613944"));
        startActivity(intent);
    }
}
