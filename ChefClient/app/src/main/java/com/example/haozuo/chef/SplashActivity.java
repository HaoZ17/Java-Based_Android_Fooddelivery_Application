package com.example.haozuo.chef;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//hide status  bar
        getSupportActionBar().hide();//hide action bar

        setContentView(R.layout.splash_activity);
        Thread myThread = new Thread() {//create sub-thread
            @Override
            public void run() {
                try {
                    sleep(2000);//thread sleep 
                    Intent it = new Intent(getApplicationContext(), LoginActivity.class);//launch MainActivity
                    startActivity(it);
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();//start thread
    }
}
