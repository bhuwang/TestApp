package com.example.bhuwan.testapp.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bhuwan.testapp.R;

public class UsIntentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us_intent);

        Bundle nepMessage = getIntent().getExtras();
        if (nepMessage != null) {
            TextView fromUsMessage = (TextView) findViewById(R.id.fromNepMessage);
            fromUsMessage.setText(nepMessage.getString("nepMessage").toString());
        }
    }

    public void onClick(View view) {
        Intent i = new Intent(this, NepalIntentActivity.class);

        EditText usMessage = (EditText) findViewById(R.id.usMessage);
        i.putExtra("usMessage", usMessage.getText().toString());

        startActivity(i);
    }
}
