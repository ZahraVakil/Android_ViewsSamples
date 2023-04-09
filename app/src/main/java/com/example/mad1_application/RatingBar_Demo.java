package com.example.mad1_application;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class RatingBar_Demo extends AppCompatActivity {

    private TextView tvRating;
    private RatingBar rbRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        tvRating= findViewById(R.id.tvRating);
        rbRating= findViewById(R.id.rbRating);

        rbRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvRating.setText("Rate" + rating);
            }
        });


    }
}