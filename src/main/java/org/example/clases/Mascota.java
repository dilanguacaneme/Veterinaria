package org.example.clases;

public abstract class Mascota {
    private int id;
    private String nombre;
    private int edad;
    private double peso;
    private Dueño dueño;

    public Mascota(int id, String nombre, int edad, double peso, Dueño dueño) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.dueño = dueño;
    }

    public Mascota(int id, String nombre, int edad, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Mascota() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodos
    public abstract void hacerSonido();
}
