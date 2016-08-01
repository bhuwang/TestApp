package com.example.bhuwan.testapp.video;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.bhuwan.testapp.R;

public class VideoPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        VideoView videoView = (VideoView)findViewById(R.id.videoPlayView);
        videoView.setVideoPath("http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_1mb.mp4");

        // add play controls(play, pause, stop, etc)
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //start the video on start
        videoView.start();
    }
}
