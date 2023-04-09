package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class radioButton extends AppCompatActivity {

    RadioGroup rgRadio;
    RadioButton rbRed, rbYellow, rbGreen, rbBlue;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        rgRadio=findViewById(R.id.rgRadio);
        rbBlue=findViewById(R.id.rbBlue);
        rbYellow=findViewById(R.id.rbYellow);
        rbGreen=findViewById(R.id.rbGreen);
        rbRed=findViewById(R.id.rbRed);

        tvRes=findViewById(R.id.tvRes);

        rgRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.rbRed:
                        tvRes.setBackgroundColor(getResources().getColor(R.color.red));
                        break;

                    case R.id.rbYellow:
                        tvRes.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;

                    case R.id.rbGreen:
                        tvRes.setBackgroundColor(getResources().getColor(R.color.green));
                        break;

                    case R.id.rbBlue:
                        tvRes.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;

                }
            }
        });


    }
}