package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdGrpComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida=findViewById(R.id.rdGrpComida);
        //asignar el listener
        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override // Rdgrp que genera el evento, ID del radiobuton seleccionado
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //toast indicando cual radiobuton fue seleccionado
                RadioButton rdBtnSel;
                rdBtnSel=findViewById(i);
                Toast.makeText(getApplicationContext(),rdBtnSel.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}