package com.example.eva1_13_cuadros_de_dialogo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    ///eventos click
    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo de Android")
                .setMessage("Hola mundo")
                .setPositiveButton("ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"Boton OK",Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"Boton NO",Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"Boton CANCEL",Toast.LENGTH_SHORT).show();
                            }
                        })
                .show();
    }
    public void onClickCDCustom(View v) {
        Dialog dlgMiCuadroDialogo = new Dialog(this);
        //asignar layout
        dlgMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
        //vincular los widgets
        TextView txtVwTitulo;
        EditText edtTxtDatos;
        Button btnAccion;
        txtVwTitulo = dlgMiCuadroDialogo.findViewById(R.id.edtTxtDatos);
        edtTxtDatos = dlgMiCuadroDialogo.findViewById(R.id.edtTxtDatos);
        btnAccion = dlgMiCuadroDialogo.findViewById(R.id.btnAccion);
        txtVwTitulo.setText("ESTE ES UN CUADRO DE DIALOGO PERSONALIZADO");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), edtTxtDatos.getText().toString(), Toast.LENGTH_SHORT).show();

                    }
                }

        );
        dlgMiCuadroDialogo.show();


    }
}