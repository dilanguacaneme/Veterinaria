package org.example.clases;

public class Gato extends Mascota{
    private String color;
    private boolean vacunado;

    public Gato(int id, String nombre, int edad, double peso, String color, boolean vacunado) {
        super(id, nombre, edad, peso);
        this.color = color;
        this.vacunado = vacunado;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau!");
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nGato{" +
                "color='" + color + '\'' +
                ", vacunado=" + vacunado +
                '}';
    }
}
