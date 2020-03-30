package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.firstapp.FirstFragment.OnDbOpListener;

public class MainActivity extends AppCompatActivity implements OnDbOpListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new FirstFragment())
                    .commit();*/
        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {

                return;
            }
            FirstFragment firstFragment = new FirstFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
        }
    }
    @Override
    public void dBOpPerformed(int method) {

        switch (method) {

            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SecondFragment()).addToBackStack(null).commit();

        }
    }

}