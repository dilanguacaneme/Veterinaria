package org.example.service;

import org.example.clases.Gato;
import org.example.clases.Mascota;
import org.example.clases.Perro;
import org.example.clases.Dueño;
import org.example.interfaces.IVacunable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MascotaService {
    private final Map<Integer, Mascota> mapMascotas = new HashMap<>();

    public MascotaService() {
        // Quemamos datos iniciales de prueba como tenías en tu Main
        mapMascotas.put(1, new Perro(1, "Firulais", 5, 18.5, true, "Dilan"));
        mapMascotas.put(2, new Perro(2, "Salchipapa", 3, 22.0, false, "Rocky"));
        mapMascotas.put(3, new Perro(3, "Hamburguesa", 7, 25.5, true, "Max"));
        mapMascotas.put(4, new Gato(4, "Michi", 2, 4.2, "Negro", true));
        mapMascotas.put(5, new Gato(5, "Pelusa", 1, 3.8, "Blanco", false));
        mapMascotas.put(6, new Gato(6, "Tom", 6, 5.1, "Gris", true));
    }

    public Map<Integer, Mascota> getMapMascotas() {
        return mapMascotas;
    }

    public void registrarMascota(Scanner s, Map<Integer, Dueño> mapaDueños) {
        System.out.println("¿Que animal desea registrar?");
        System.out.println("1. Perro ");
        System.out.println("2. Gato ");
        int opcionAnimal = s.nextInt();

        System.out.print("Ingrese el ID del dueño de esta mascota: ");
        int idDueño = s.nextInt();

        // Buscamos si el dueño existe en el mapa
        Dueño dueñoAsociado = mapaDueños.get(idDueño);
        if (dueñoAsociado == null) {
            System.out.println("Error: El ID de dueño no existe. Primero registre al dueño.");
            return;
        }

        switch (opcionAnimal) {
            case 1:
                System.out.println("\n=== Registrar Perro ===");
                System.out.print("Id Perro: ");
                int idPerro = s.nextInt();
                if (mapMascotas.containsKey(idPerro)) {
                    System.out.println("Error: Ya existe un perro con ese ID.");
                    return;
                }
                System.out.print("Nombre del perro: ");
                String nombrePerro = s.next();
                System.out.print("Edad del perro: ");
                int edadPerro = s.nextInt();
                System.out.print("Peso del perro: ");
                double pesoPerro = s.nextDouble();

                System.out.println("Vacunado? (1 = Si / 2 = No): ");
                int vacunadoPerro = s.nextInt();
                boolean esVerdadero = (vacunadoPerro == 1);

                Perro p = new Perro(idPerro, nombrePerro, edadPerro, pesoPerro, esVerdadero, dueñoAsociado.getNombre());
                mapMascotas.put(p.getId(), p);
                System.out.println("Perro registrado exitosamente.\n" + p);
                break;

            case 2:
                System.out.println("\n=== Registrar Gato ===");
                System.out.print("Id Gato: ");
                int idGato = s.nextInt();
                if (mapMascotas.containsKey(idGato)) {
                    System.out.println("Error: Ya existe un gato con ese ID.");
                    return;
                }
                System.out.print("Nombre del gato: ");
                String nombreGato = s.next();
                System.out.print("Edad del gato: ");
                int edadGato = s.nextInt();
                System.out.print("Peso del gato: ");
                double pesoGato = s.nextDouble();
                System.out.print("Color del gato: ");
                String colorGato = s.next();

                System.out.println("Vacunado? (1 = Si / 2 = No): ");
                int vacunadoGato = s.nextInt();
                boolean esVerdaderoGato = (vacunadoGato == 1);

                Gato g = new Gato(idGato, nombreGato, edadGato, pesoGato, colorGato, esVerdaderoGato);
                mapMascotas.put(g.getId(), g);
                System.out.println("Gato registrado exitosamente.\n" + g);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public void listarMascotas() {
        System.out.println("\n=== Lista de mascotas registradas actualmente ===");
        for (Map.Entry<Integer, Mascota> entry : mapMascotas.entrySet()) {
            System.out.println("Id: " + entry.getKey() + " | Mascota: " + entry.getValue());
        }
    }

    public void buscarMascotaPorId(Scanner s) {
        System.out.println("\n=== Buscar mascota por ID ===");
        System.out.print("Ingrese el ID: ");
        int buscarId = s.nextInt();

        Mascota mascota = mapMascotas.get(buscarId); // Usar .get() es mucho más eficiente que un bucle for en un Map

        if (mascota != null) {
            System.out.println("=== Mascota encontrada ===");
            System.out.println("Id : " + buscarId);
            System.out.println("Mascota : " + mascota);
        } else {
            System.out.println("Error: Mascota no encontrada.");
        }
    }

    public void vacunarMascota (Scanner s){
        System.out.println("\n=== Vacunar mascota ===");
        System.out.println("\n=== Id de la mascota que desea vacunar ===");
        int mascotaAVacunar = s.nextInt();

        Mascota  mascota = mapMascotas.get(mascotaAVacunar);

        if (mascota != null) {
            System.out.println("=== Mascota encontrada ===");
            System.out.println("Id : " + mascotaAVacunar);
            System.out.println("Mascota : " + mascota);
            if (mascota instanceof IVacunable vacunable){

                System.out.println("Estado : " + vacunable.estaVacunado());
                System.out.println("Desea vacunarlo?");
                System.out.println("1. Si");
                System.out.println("2. No");
                int opcionVacuna = s.nextInt();

                switch (opcionVacuna){
                    case 1:
                        if (vacunable.estaVacunado()){
                            System.out.println("Las mascota ya se encuentra vacunada, no se puede vacunar de nuevo");
                        } else  {
                            vacunable.vacunar();
                            System.out.println("Mascota vacunada correctamente");
                            System.out.println("Estado : " + vacunable.estaVacunado());
                        }
                        break;
                    case 2:
                        System.out.println("Mascota no vacunada");
                        System.out.println("Estado : " + vacunable.estaVacunado());
                        break;
                }

            }

        } else {
            System.out.println("Error: Mascota no encontrada.");
        }
    }
}
