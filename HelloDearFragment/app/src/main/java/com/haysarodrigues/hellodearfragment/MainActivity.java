package com.haysarodrigues.hellodearfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * UMA FORMA DE RECUPERAR UM FRAGMENT:
         */

//        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
//
//        Fragment1 frag1 = (Fragment1) fm.findFragmentById(R.id.frag1);
//        frag1.manoEuToPassada();


        /**
         * WAY 2 FORMA DE CHAMAR UM LAYOUT - Diretamente pela API
         */

        if (savedInstanceState == null){ // esse if checa se a activity está sendo criada

            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Fragment1 frag1 = new Fragment1();
            ft.add(R.id.layoutFrag, frag1, "Fragment1");// identificador de layout de onde o fragment deve ser inserido.
                                                        // A string é a TAG e o frag1 é a instancia do fragment
            ft.commit(); // esse metodo commit efetiva as alteracoes

        }

    }

}
