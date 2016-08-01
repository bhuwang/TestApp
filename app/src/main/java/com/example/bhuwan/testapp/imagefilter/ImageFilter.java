package com.example.bhuwan.testapp.imagefilter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.bhuwan.testapp.R;


public class ImageFilter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_filter);

        ImageView filterImageDisplay = (ImageView) findViewById(R.id.filterImageDisplay);

        Drawable[] layers = new Drawable[2];
        layers[0] = getResources().getDrawable(R.drawable.anuska);
        layers[1] = getResources().getDrawable(R.drawable.overlay);
        LayerDrawable layerDrawable = new LayerDrawable(layers);
        filterImageDisplay.setImageDrawable(layerDrawable);
    }

}
