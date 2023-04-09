package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
    }

    public void showAlertDialog (View v){
        android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(this);
            alert.setTitle("Android Studio");
            alert.setMessage("Do you love Android??");
            alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(AlertDialog.this, "Good Job!! :)", Toast.LENGTH_SHORT).show();
                }
            });

            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(AlertDialog.this, "Too Bad!! cuz its awesome :)", Toast.LENGTH_SHORT).show();
                }
            });
            alert.create().show();
    }

}