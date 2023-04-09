package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Color_change extends AppCompatActivity {
    Button Red, Blue, Green;
    LinearLayout LL1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);

        Red= findViewById(R.id.red);
        Blue= findViewById(R.id.blue);
        Green= findViewById(R.id.green);
        LL1= findViewById(R.id.ll1);

        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LL1.setBackgroundResource(R.color.red);
            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LL1.setBackgroundResource(R.color.blue);
            }
        });

        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LL1.setBackgroundResource(R.color.green);
            }
        });

    }
}