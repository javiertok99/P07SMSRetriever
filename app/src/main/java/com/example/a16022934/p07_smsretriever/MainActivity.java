package com.example.a16022934.p07_smsretriever;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        Fragment f1 = new FragmentNumber();
        transaction.replace(R.id.frameNumber, f1);

        Fragment f2 = new FragmentText();
        transaction.replace(R.id.frameText, f2);

        transaction.commit();
    }
}
