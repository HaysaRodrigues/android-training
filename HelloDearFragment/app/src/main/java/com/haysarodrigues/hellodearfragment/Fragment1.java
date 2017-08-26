package com.haysarodrigues.hellodearfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Haysa on 03/08/17.
 */

public class Fragment1 extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // o fragment é livre para ter qualquer lógica aqui nesse metodo

        return view;



    }

    public void manoEuToPassada(){

        Toast.makeText(getContext(), "MNO EU TO PASSADA", Toast.LENGTH_LONG).show();
    }
}
