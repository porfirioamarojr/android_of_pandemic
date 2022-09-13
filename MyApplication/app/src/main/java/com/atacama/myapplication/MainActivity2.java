package com.atacama.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("MYAPP", "---->> onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYAPP", "---->> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYAPP", "---->> onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYAPP", "---->> onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYAPP", "---->> onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYAPP", "---->> onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MYAPP", "---->> onRestart()");

    }
}