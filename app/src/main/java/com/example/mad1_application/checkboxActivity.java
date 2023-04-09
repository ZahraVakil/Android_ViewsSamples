package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class checkboxActivity extends AppCompatActivity {

    TextView tvLabel;
    CheckBox cbJava;
    CheckBox cbC;
    CheckBox cbPhp;

    Button btnSubmit;
    TextView tvShow;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        tvLabel=(TextView)findViewById(R.id.tvLabel);
        cbJava=(CheckBox)findViewById(R.id.cbJava);
        cbC=(CheckBox)findViewById(R.id.cbC);
        cbPhp=(CheckBox)findViewById(R.id.cbPhp);

        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        tvShow=(TextView)findViewById(R.id.tvShow);


        cbJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbJava.isChecked()){
                    cbJava.setTextColor(getResources().getColor(R.color.green));
                }else {
                    cbJava.setTextColor(getResources().getColor(R.color.black));
                }

            }
        });

        cbC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbC.isChecked()){
                    cbC.setTextColor(getResources().getColor(R.color.green));
                }else {
                    cbC.setTextColor(getResources().getColor(R.color.black));
                }

            }
        });

        cbPhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbPhp.isChecked()){
                    cbPhp.setTextColor(getResources().getColor(R.color.green));
                }else {
                    cbPhp.setTextColor(getResources().getColor(R.color.black));
                }

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="";

                if(cbJava.isChecked()){
                    s+="\n" + cbJava.getText().toString();
                }
                if(cbC.isChecked()){
                    s+=" " + cbC.getText().toString();
                }
                if(cbPhp.isChecked()){
                    s+=" " + cbPhp.getText().toString();
                }

                tvShow.setText(s);
            }
        });


    }
}