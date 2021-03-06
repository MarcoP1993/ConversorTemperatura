package com.example.conversortemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_numero = null;
    TextView txt_kelvin = null;
    TextView txt_farenheit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero = findViewById(R.id.edt_temperatura);
        txt_kelvin = findViewById(R.id.txt_kelvin);
        txt_farenheit = findViewById(R.id.txt_farenheit);
    }


    public void convertir(View view) {
        String textoTemperatura = edt_numero.getText().toString();//siempre convertir a String4
        double temperatura = Double.valueOf(textoTemperatura);//convertir de String a double
        //_-------------------------------------------------
        double kelvin = temperatura + 273.0;
        double farenheit= temperatura * 9.0/5.0 + 32.0;
        //--------------------------------------------------
        txt_kelvin.setText(String.valueOf(kelvin) + "ºKelvin");
        txt_farenheit.setText(String.valueOf(farenheit) + "ºFarenheit");

    }
}