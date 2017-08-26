package com.haysarodrigues.devapps22jul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String name = getIntent().getStringExtra("name");
        Toast.makeText(getApplicationContext(), "NAME: " + name, Toast.LENGTH_LONG).show();
    }
}
