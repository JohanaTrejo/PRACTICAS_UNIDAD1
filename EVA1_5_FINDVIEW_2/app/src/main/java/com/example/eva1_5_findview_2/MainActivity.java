package com.example.eva1_5_findview_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgVmMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVmMostrar=findViewById(R.id.imgVwMostrar);
        imgVmMostrar.setImageResource(R.drawable.flore);
    }
}