package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class date_picker extends AppCompatActivity {

    Button btnDate;
    TextView tvDate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        btnDate=findViewById(R.id.btnDate);
        tvDate= findViewById(R.id.tvDate);

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar= Calendar.getInstance();
                int day= calendar.get(Calendar.DATE);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog= new DatePickerDialog(date_picker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String mydate = dayOfMonth+ "/"+ month+"/"+year;
                        tvDate.setText(mydate);
                    }
                }, year,month,day);

                datePickerDialog.show();

            }
        });
    }
}