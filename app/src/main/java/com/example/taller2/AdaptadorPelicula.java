package com.example.taller2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorPelicula extends RecyclerView.Adapter<AdaptadorPelicula.PeliculaViewHolder> {
    @NonNull
    @Override
    public AdaptadorPelicula.PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPelicula.PeliculaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PeliculaViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView nombre;
        private TextView genero;
        private TextView clasificacion;
        private View v;

        public PeliculaViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        /*public PeliculaViewHolder(View itemView) {
            super(itemView);
            v = itemView;
            foto = v.findViewById(R.id.foto);
            nombre = v.findViewById(R.id.lblNombre);
            genero = v.findViewById(R.id.lblApellido);
            clasificacion = v.findViewById(R.id.lblApellido);
        }*/
    }
}
