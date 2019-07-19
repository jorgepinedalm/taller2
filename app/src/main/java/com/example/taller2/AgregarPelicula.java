package com.example.taller2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class AgregarPelicula extends AppCompatActivity {
    private ArrayList<Integer> fotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_pelicula);

        fotos.add(R.drawable.portada1);
        fotos.add(R.drawable.portada2);
        fotos.add(R.drawable.portada3);

    }

    public int fotoAleatoria(){
        int fotoSeleccionada ;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(this.fotos.size());
        return fotos.get(fotoSeleccionada);
    }
}
