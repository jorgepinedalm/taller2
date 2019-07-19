package com.example.taller2;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Datos {
    private static String db = "Peliculas";

    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private static ArrayList<Pelicula> peliculas = new ArrayList<>();

    public static void agregar(Pelicula p) {
        databaseReference.child(db).child(p.getId()).setValue(p);
    }

    public static void editar(Pelicula p){
        databaseReference.child(db).child(p.getId()).setValue(p);
    }

    public static void eliminar(Pelicula p){
        databaseReference.child(db).child(p.getId()).removeValue();
    }

    public static String getId(){
        return databaseReference.push().getKey();
    }

    public static void setPersonas(ArrayList<Pelicula> peliculas){
        Datos.peliculas = peliculas;
    }

    public static ArrayList<Pelicula> obtener(){
        return Datos.peliculas;
    }
}
