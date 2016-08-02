package com.example.bhuwan.testapp.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bhuwan.testapp.R;

public class SharedPreferencesDemo extends AppCompatActivity {

    EditText textUsername;
    EditText textPassword;
    TextView showPrefTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_demo);

        textUsername = (EditText) findViewById(R.id.textUsername);
        textPassword = (EditText) findViewById(R.id.textPassword);
        showPrefTextView = (TextView) findViewById(R.id.showPrefTextView);
    }

    public void displayPreferences(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "");
        String password = sharedPreferences.getString("password", "");

        showPrefTextView.setText(username + " -- " + password);
    }

    public void savePreferences(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", textUsername.getText().toString());
        editor.putString("password", textPassword.getText().toString());
        editor.apply();

        Toast.makeText(SharedPreferencesDemo.this, "Data Saved!", Toast.LENGTH_LONG).show();
    }
}
