package com.haysarodrigues.gasolinaoualcool;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Haysa on 05/08/17.
 */

public class PictureActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();

        Bitmap imageBitMap = (Bitmap) extras.get("data");

        mImageView = new ImageView(this);

        mImageView.setImageBitmap(imageBitMap);

        setContentView(mImageView);
    }
}
