package com.example.bhuwan.testapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class CustomLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Custom Layout
        RelativeLayout myCustomLayout = new RelativeLayout(this);
        myCustomLayout.setBackgroundColor(Color.LTGRAY);

        // create text field
        EditText textUsername=new EditText(this);


        // create button
        Button nextButton = new Button(this);
        nextButton.setBackgroundColor(Color.DKGRAY);
        nextButton.setText("Next Activity");
        nextButton.setTextColor(Color.WHITE);
        nextButton.setWidth(50);

        // Set the ids
        textUsername.setId(1);
        nextButton.setId(2);

        RelativeLayout.LayoutParams buttonRules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonRules.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonRules.addRule(RelativeLayout.CENTER_VERTICAL);

        RelativeLayout.LayoutParams usernameRules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        usernameRules.addRule(RelativeLayout.ABOVE, nextButton.getId());
        usernameRules.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameRules.setMargins(0,0,0,20);

        // set width only accepts in px, we are converting DIP to px
        Float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, getResources().getDisplayMetrics());
        textUsername.setWidth(pixels.intValue());

        // add text to layout
        myCustomLayout.addView(textUsername, usernameRules);

        // add button to layout
        myCustomLayout.addView(nextButton, buttonRules);

        // set custom layout
        setContentView(myCustomLayout);
    }
}
