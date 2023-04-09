package com.example.mad1_application;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video_View extends AppCompatActivity {

    private VideoView videoView1;
    String videoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        videoView1=findViewById(R.id.videoview1);

        videoPath="android.resource://"+getPackageName()+"/"+R.raw.lk;
        Uri uri= Uri.parse(videoPath);

        videoView1.setVideoURI(uri);

        MediaController mediaController= new MediaController(this);
        videoView1.setMediaController(mediaController);
        mediaController.setAnchorView(videoView1);
    }
}