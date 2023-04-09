package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration_form extends AppCompatActivity {

    EditText firstName, lastName, password, rePassword, userName, email;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

            firstName= findViewById(R.id.firstName);
            lastName= findViewById(R.id.lastName);
            rePassword= findViewById(R.id.rePassword);
            userName= findViewById(R.id.userName);
            password= findViewById(R.id.passWord);
            email= findViewById(R.id.emailId);
            register= findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName= firstName.getText().toString().trim();
                String lName = lastName.getText().toString().trim();
                String pass = password.getText().toString().trim();
                String repass = rePassword.getText().toString().trim();
                String email_id = email.getText().toString().trim();

                if (fName.isEmpty() || lName.isEmpty() || pass.isEmpty() || repass.isEmpty()) {
                    Toast.makeText(Registration_form.this, "Please fill in all required fields", Toast.LENGTH_SHORT).show();
                } else if (!pass.equals(repass)) {
                    Toast.makeText(Registration_form.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(Registration_form.this, "Registration successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

