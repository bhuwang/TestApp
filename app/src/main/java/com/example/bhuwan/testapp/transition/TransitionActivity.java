package com.example.bhuwan.testapp.transition;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.bhuwan.testapp.R;

public class TransitionActivity extends AppCompatActivity {

    ViewGroup transLayout;
    boolean onTop  = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        transLayout = (ViewGroup) findViewById(R.id.transLayout);

        transLayout.setOnClickListener(new RelativeLayout.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(onTop) {
                    moveButtonBelow();
                    onTop = false;
                }else{
                    moveButtonOnTop();
                    onTop = true;
                }
            }
        });
    }

    @SuppressLint("NewApi")
    private void moveButtonOnTop() {
        View transButton = (View) findViewById(R.id.transButton);
        TransitionManager.beginDelayedTransition(transLayout);

        // change the position
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        transButton.setLayoutParams(params);

        // change the size
        ViewGroup.LayoutParams sizeParams = transButton.getLayoutParams();
        sizeParams.width=600;
        sizeParams.height=150;
        transButton.setLayoutParams(sizeParams);
    }

    @SuppressLint("NewApi")
    private void moveButtonBelow() {
        View transButton = (View) findViewById(R.id.transButton);
        TransitionManager.beginDelayedTransition(transLayout);

        // change the position
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        transButton.setLayoutParams(params);

        // change the size
        ViewGroup.LayoutParams sizeParams = transButton.getLayoutParams();
        sizeParams.width=750;
        sizeParams.height=250;
        transButton.setLayoutParams(sizeParams);
    }
}
