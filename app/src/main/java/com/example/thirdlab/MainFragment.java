package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFragment extends AppCompatActivity implements View.OnClickListener {
    Fragment fragment1, fragment2;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);



        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
    }

    @Override
    public void onClick(View view) {
        fragmentManager = getSupportFragmentManager();
        switch (view.getId()) {
            case R.id.frag1:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment1).commit();
                break;
            case R.id.frag2:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment2).commit();
                break;

                default:
                    break;
        }
    }




}
