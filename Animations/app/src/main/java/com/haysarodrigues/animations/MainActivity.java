package com.haysarodrigues.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        ImageView bubblegum = (ImageView) findViewById(R.id.bubblegum);

        bubblegum.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(2000);

        //bubblegum.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);//faz diminuir, descer pra trás

        // bubblegum.animate().rotation(1800f).setDuration(2000); // faz rodar

        //ImageView marceline = (ImageView) findViewById(R.id.marceline); //

        // marceline.animate().alpha(1f).setDuration(2000); // faz aparecer/faz desaparecer

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bubblegum = (ImageView) findViewById(R.id.bubblegum);

        bubblegum.setTranslationX(-1000f);
        bubblegum.setTranslationY(-1000f);


        /*

        ImageView bubblegum = (ImageView) findViewById(R.id.bubblegum);
        bubblegum.setTranslationX(-1000f);

        */
    }


}
