package com.example.eva1_4_findview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FALTA CONECTAR LA VARIABLE CON EL WITGET
        txtVwMensaje=findViewById(R.id.txtVwMensaje);

        txtVwMensaje.setText("Hola mundo cruel!!");

    }
}