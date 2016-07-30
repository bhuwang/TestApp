package com.example.bhuwan.testapp.broadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.bhuwan.testapp.R;

public class SendBroadCastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_broad_cast);
    }

    public void sendOutBrodcast(View view){
        System.out.println("dddddddddddddddddddddddddddddddddddddddddddd");
        Intent i = new Intent();
        i.putExtra("KeyName","code1id");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}
