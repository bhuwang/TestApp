package com.example.bhuwan.testapp.invertimage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.bhuwan.testapp.R;

public class InvertImageActivity extends AppCompatActivity {

    ImageView invertedImageView;
    Drawable originalImage;
    Bitmap bitmapImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invert_image);

        invertedImageView = (ImageView) findViewById(R.id.invertedImageView);
        originalImage = getResources().getDrawable(R.drawable.anuska);
        bitmapImage = ((BitmapDrawable) originalImage).getBitmap();
        Bitmap invertedImage = invertedImage(bitmapImage);
        invertedImageView.setImageBitmap(invertedImage);
    }

    private Bitmap invertedImage(Bitmap original) {
        Bitmap invertedImage = Bitmap.createBitmap(original.getWidth(), original.getHeight(), original.getConfig());

        int A, R, G, B;
        int pixelColor;
        int width = original.getWidth();
        int height = original.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                pixelColor = original.getPixel(x, y);
                A = Color.alpha(pixelColor);
                R = 255 - Color.red(pixelColor);
                G = 255 - Color.green(pixelColor);
                B = 255 - Color.blue(pixelColor);
                invertedImage.setPixel(x, y, Color.rgb(R, G, B));
            }
        }

        return invertedImage;
    }
}
