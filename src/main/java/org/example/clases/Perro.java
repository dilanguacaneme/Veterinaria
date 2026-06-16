package org.example.clases;

public class Perro extends Mascota{
    private String raza;
    private boolean vacunado;

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau!");
    }
}
