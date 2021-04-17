package com.example.eva1_12_clima;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
public class ClimaAdaptador extends ArrayAdapter<Clima> {
     private Context context;
     private int layout;
     private Clima[] cCuidades;


    public ClimaAdaptador(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        this.context= context;
        this.layout=resource;
        this.cCuidades = objects;

    }
//
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //fila no exista
        if (convertView==null){
            convertView=((Activity)context).getLayoutInflater().inflate(layout,parent,false);

            //primera vez
        }/*else


        }*/
        ImageView imgVwClima;
        TextView txtVwCd,txtVwTemp,txtVwDesc;
        //Vincularlas
        imgVwClima=convertView.findViewById(R.id.imgVwClima);
        txtVwCd=convertView.findViewById(R.id.txtVwCd);
        txtVwTemp=convertView.findViewById(R.id.txtVwTemp);
        txtVwDesc=convertView.findViewById(R.id.txtVwDesc);
        //llenar widgets
        imgVwClima.setImageResource(cCuidades[position].getImagen());
        txtVwCd.setText((cCuidades[position].getCiudad()));
        txtVwTemp.setText(cCuidades[position].getTemp()+" ° c");
        txtVwDesc.setText(cCuidades[position].getDesc());

        return convertView;

    }
}
