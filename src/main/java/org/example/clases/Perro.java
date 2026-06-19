package org.example.clases;

public class Perro extends Mascota{
    private String raza;
    private boolean vacunado;

    public Perro(int id, String nombre, int edad, double peso, Dueño dueño, String raza, boolean vacunado) {
        super(id, nombre, edad, peso, dueño);
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public Perro(int id, String nombre, int edad, double peso, boolean vacunado, String raza) {
        super(id, nombre, edad, peso);
        this.vacunado = vacunado;
        this.raza = raza;
    }

    public Perro() {
    }

    public Perro(int idPerro, String nombrePerro, int edadPerro, double pesoPerro, String razaPerro) {
    }

    public Perro(int idPerro, String nombrePerro, int edadPerro, double pesoPerro, boolean esVerdadero) {
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau!");
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nPerro{" +
                "raza='" + raza + '\'' +
                ", vacunado=" + vacunado +
                '}';
    }
}
