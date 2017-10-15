package com.haysarodrigues.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton(View view){

        EditText amount = (EditText) findViewById(R.id.editTextAmount);

        Double amountAsADouble = Double.parseDouble(amount.getText().toString());

        Double convertedResult = amountAsADouble * 3.11;

        Toast.makeText(MainActivity.this, "R$" + String.format("%.2f", convertedResult), Toast.LENGTH_LONG).show();

        Log.i("VITORY", amount.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
