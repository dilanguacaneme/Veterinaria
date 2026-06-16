package org.example.clases;

public class Gato extends Mascota{
    private String color;
    private boolean vacunado;

    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau!");
    }
}
