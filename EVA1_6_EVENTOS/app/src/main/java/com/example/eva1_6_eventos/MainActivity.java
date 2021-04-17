package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
 implements View.OnClickListener {
    Button btnListener, btnClaseAnonima, btnPorClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnPorClase = findViewById(R.id.btnPorClase);

        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "EVENTO POR CLASE ANONIMA", Toast.LENGTH_LONG).show();
            }
        });
        MiClaseOnClick objClick = new MiClaseOnClick();
        objClick.setContext(this);
        btnPorClase.setOnClickListener(objClick);
    }

    //USANDO LA PROPIEDAD android: onCLic DEL WIDGET
    // publicNOMBREDELMETODO(View arg){}
    public void miClic(View arg) {
        //MOSTRAR MENSAJE (TOAST)
        Toast.makeText(this, "EVENTO POR ONCLIC XML", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "EVENTO POR LISTENER ", Toast.LENGTH_LONG).show();

    }
}

