package com.example.eva1_14_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {
    private String[] aDatos;

    public MiAdaptador(String[] aDatos) {
        this.aDatos = aDatos;
    }

    //viewholder representa un item de la lista
    //eventos y metodos a cada widget
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txtVwfila;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtVwfila = itemView.findViewById(R.id.txtVwfila);
        }

        public TextView getTxtVwfila() {
            return txtVwfila;
        }
    }
//crear la pantalla y crear los objetos de viewholder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.texto_fila,parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTxtVwfila().setText(aDatos[position]);
    }

    @Override
    public int getItemCount() {
        return aDatos.length;
    }
}

