package com.example.bhuwan.testapp.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bhuwan.testapp.R;
import com.example.bhuwan.testapp.service.FileDownloaderService;

public class NepalIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nepal_intent);

        Bundle usMessage = getIntent().getExtras();
        if (usMessage != null) {
            TextView fromUsMessage = (TextView) findViewById(R.id.fromUsMessage);
            fromUsMessage.setText(usMessage.getString("usMessage").toString());
        }

        // start the intent service
        startService(new Intent(this, FileDownloaderService.class));
    }

    public void onClick(View view) {
        Intent i = new Intent(this, UsIntentActivity.class);

        EditText nepMessage = (EditText) findViewById(R.id.nepMessage);
        i.putExtra("nepMessage", nepMessage.getText().toString());

        startActivity(i);
    }
}
