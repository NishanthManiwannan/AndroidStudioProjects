package com.example.nishanth.welcome;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome_Screen extends AppCompatActivity {
    private static int Time = 3000;//3 Seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent = new Intent(Welcome_Screen.this,Home.class);
               startActivity(intent);
               finish();
            }
        },Time);
    }
}
