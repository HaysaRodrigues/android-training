package com.haysarodrigues.gasolinaoualcool;

import android.Manifest;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_PICK_IMAGE_CAPTURE = 1;
    private static final int REQUEST_CAMERA_PERMISSION = 2;
    private Intent mIntent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // estudar expressão ternária java



    public void convertButton(View view){

        EditText gasolina = (EditText) findViewById(R.id.editTextGasolina);

        EditText alcool = (EditText) findViewById(R.id.editTextAlcool);



        Double amountAsADoubleGasolina = Double.parseDouble(gasolina.getText().toString());

        Double amountAsADoubleAlcool = Double.parseDouble(alcool.getText().toString());


        if(amountAsADoubleAlcool <= (amountAsADoubleGasolina * 0.7)){
            Toast.makeText(MainActivity.this, "Melhor alcool", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(MainActivity.this, "Melhor gasolina", Toast.LENGTH_LONG).show();

        }


    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public void takePicture(View view){

        int hasCamera = checkSelfPermission(Manifest.permission.CAMERA);

        if (hasCamera != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);

        } else {

            mIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(mIntent, REQUEST_PICK_IMAGE_CAPTURE);

        }

    }

    //

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_PICK_IMAGE_CAPTURE && resultCode == RESULT_OK){
            Intent intent = new Intent(this, PictureActivity.class);
            intent.putExtras(data.getExtras());
            startActivity(intent);


        }
    }

// Não obrigatório? mas necessário?

//    @Override
//        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//
//        switch (requestCode){
//
//            case REQUEST_CAMERA_PERMISSION:
//                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                    mIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                    startActivityForResult(mIntent, REQUEST_PICK_IMAGE_CAPTURE);
//
//                } else {
//
//                    Toast.makeText(MainActivity.this, "Não tem permissão", Toast.LENGTH_SHORT).show();
//
//                }
//
//                break;
//        }
//    }




    /**
     * ALARME
     *
     * Diferencas RTC / RTC WAKEUP
     */

    public void setAlarm(View view){

        AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pit = PendingIntent.getBroadcast(this, 0, intent, 0);
        am.setRepeating(AlarmManager.RTC, System.currentTimeMillis(), 1000 * 60 * 10, pit);



    }

}

