package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class progress_Bar extends AppCompatActivity {

    ProgressBar pB;
    TextView tV;

    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        pB= findViewById(R.id.pB);
        tV= findViewById(R.id.tV);


        Timer t= new Timer();

        TimerTask ts= new TimerTask() {
            @Override
            public void run() {
                counter++;
                pB.setProgress(counter);

                tV.setText(counter);


            }
        };

        t.schedule(ts,0);
    }
}