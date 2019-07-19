package com.example.taller2;

public class Pelicula {
    private String id;
    private String nombre;
    private double duracion;
    private String genero;
    private String clasificacion;

    public Pelicula() {
    }

    public Pelicula(String id, String nombre, double duracion, String genero, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void guardar(){
        Datos.agregar(this);
    }

    public void eliminar(){
        Datos.eliminar(this);
    }

    public void editar(){
        Datos.editar(this);
    }
}
