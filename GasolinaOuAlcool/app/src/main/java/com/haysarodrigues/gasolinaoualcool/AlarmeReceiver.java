package com.haysarodrigues.gasolinaoualcool;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Haysa on 05/08/17.
 */

public class AlarmeReceiver extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Alarme disparado!", Toast.LENGTH_SHORT).show();

    }
}
