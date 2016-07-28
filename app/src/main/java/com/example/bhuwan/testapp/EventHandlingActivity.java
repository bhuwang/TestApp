package com.example.bhuwan.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EventHandlingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling);

        Button changeMe = (Button) findViewById(R.id.changeMe);
        final TextView display = (TextView) findViewById(R.id.display);

        // setup listener for changeMe button
        changeMe.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if("Bhuwan Gautam".equals(display.getText())) {
                    display.setText("Pratiksha Wagle");
                }else{
                    display.setText("Bhuwan Gautam");
                }
            }
        });

        // setup on long click listener
        changeMe.setOnLongClickListener(new Button.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view) {
                display.setText("Key Pressed Long!!");
                return false;
            }
        });

    }
}
