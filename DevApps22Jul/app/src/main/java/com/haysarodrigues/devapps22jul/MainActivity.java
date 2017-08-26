package com.haysarodrigues.devapps22jul;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // ler sobre densidade das telas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btnTela2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), SecondActivity.class);
                it.putExtra("name", "DevApps");
                startActivity(it);

            }
        });

        /*
         posso fazer o cast ou não? pq?

         */

        /**
         * Sobre as intenções:
         * intent (intenções) na documentação do android tem os exemplos, geo, tel, abrir browser...
         * buscar na documentação do android
         */

        findViewById(R.id.btnMaps).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Rua da hora, 220 - Recife - PE"));
                startActivity(it);
            }
        });


        findViewById(R.id.btnCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:99544997"));

                // esse if verifica se existe a aplicação chamada na intenção (Intent)
                // boas práticas p/ previnir quando não exista a aplicação chamada

                if (it.resolveActivity(getPackageManager()) != null){
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), "Não existe aplicação", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
