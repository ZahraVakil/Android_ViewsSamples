package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnClickMe;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //right click on on create and GENERATE make override methods of activity life cycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName=(EditText)findViewById(R.id.edtName);
        btnClickMe=(Button)findViewById(R.id.btnClickMe);
        tvResult=(TextView)findViewById(R.id.tvResult);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {tvResult.setText(edtName.getText());
            }
        });
    }
}