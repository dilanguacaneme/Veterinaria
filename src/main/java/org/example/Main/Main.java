package org.example.Main;


import org.example.clases.Mascota;
import org.example.clases.Perro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Mascota> lstMascotas = new ArrayList<>();
        int opcion = 0;

        Scanner s = new Scanner(System.in);
        while (opcion != 6 ){
            System.out.println("\n=== VETERINARIA ===");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Listar mascotas");
            System.out.println("3. Buscar mascota por ID");
            System.out.println("4. Registrar cita");
            System.out.println("5. Ver citas");
            System.out.println("6. Salir");

            System.out.print("\nSeleccione una opcion: ");
            opcion = s.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\n=== Registrar Perro ===");
                    System.out.println("\n1. Id Perro");
                    int idPerro = s.nextInt();
                    System.out.println("\n2. Nombre del perro");
                    String nombrePerro = s.next();
                    System.out.println("\n3. Edad del perro");
                    int edadPerro = s.nextInt();
                    System.out.println("\n4. Peso del perro");
                    double pesoPerro = s.nextDouble();
                    System.out.println("\n5. Raza");
                    String razaPerro = s.next();
                    System.out.println("\n6. Vacunado");
                    System.out.println("\n 1 = Si");
                    System.out.println("\n 2 = No");
                    int vacunadoPerro = s.nextInt();


                    Perro p = new Perro(idPerro,nombrePerro,edadPerro,pesoPerro,razaPerro);

                    lstMascotas.add(p);
                    System.out.println(lstMascotas);
                    break;
                case 2:
                    System.out.println("\nSoy la opcion dos");
                    break;
                case 3:
                    System.out.println("\nSoy la opcion tres");
                    break;
                case 4:
                    System.out.println("\nSoy la opcion cuatro");
                    break;
                case 5:
                    System.out.println("\nSoy la opcion cinco");
                    break;
                case 6:
                    System.out.println("\nGracias por usar este sistema de veteniaria");
            }
        }
    }
}