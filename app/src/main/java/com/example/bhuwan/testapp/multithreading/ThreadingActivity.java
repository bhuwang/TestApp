package com.example.bhuwan.testapp.multithreading;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.bhuwan.testapp.R;

public class ThreadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threading);
    }

    public void calculateBigData(View view) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // perform calculation
                performLongCalcuation();

                // update text
                updateMsgHandler.sendEmptyMessage(0);
            }
        };
        // start a new child thread.
        new Thread(r).start();
    }

    Handler updateMsgHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            updateText();
        }
    };

    public void updateText() {
        TextView threadDisplayText = (TextView) findViewById(R.id.threadDisplayText);
        threadDisplayText.setText("Nice ! Calculation done !!");
    }

    public void performLongCalcuation() {
        long futureTime = System.currentTimeMillis() + 10000;
        while (System.currentTimeMillis() < futureTime) {
            synchronized (this) {
                try {
                    wait(futureTime - System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
