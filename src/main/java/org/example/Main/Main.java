package org.example.Main;


import org.example.clases.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dueño dueño1 = new Dueño(1,"Dilan", "3004665648", "Carrera 123");
        List<Mascota> lstMascotas = new ArrayList<>();
        List<Cita> lstCita = new ArrayList<>();
        Veterinario veterinario1 = new Veterinario(1, "Carlos Torres", "Especialidad en gatos", "321456789");

        lstMascotas.add(new Perro(1, "Dilan", 5, 18.5, true, "Firulais"));
        lstMascotas.add(new Perro(2, "Rocky", 3, 22.0, false, "Salchipapa"));
        lstMascotas.add(new Perro(3, "Max", 7, 25.5, true, "Hamburguesa"));

        lstMascotas.add(new Gato(4, "Michi", 2, 4.2, "Negro", true));
        lstMascotas.add(new Gato(5, "Pelusa", 1, 3.8, "Blanco", false));
        lstMascotas.add(new Gato(6, "Tom", 6, 5.1, "Gris", true));
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
                    System.out.println("¿Que animal desea registrar?");
                    System.out.println("1. Perro ");
                    System.out.println("2. Gato ");
                    int opcionAnimal = s.nextInt();

                    switch (opcionAnimal){
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
                            boolean esVerdadero = false;

                            if (vacunadoPerro == 1 || vacunadoPerro == 2){
                                switch (vacunadoPerro){
                                    case 1:
                                        esVerdadero = true;
                                        break;
                                    case 2:
                                        esVerdadero = false;
                                }
                            } else  {
                                System.out.println("Error: Numero invalido, solo puede usar 1 para si y 2 para no");
                            }
                            Perro p = new Perro(idPerro,nombrePerro,edadPerro,pesoPerro,esVerdadero, dueño1.getNombre());
                            lstMascotas.add(p);
                            System.out.println("Perro registrado exitosamente");
                            System.out.println(p.toString());
                            break;
                        case 2:
                            System.out.println("\n=== Registrar Gato ===");
                            System.out.println("\n1. Id Gato");
                            int idGato = s.nextInt();
                            System.out.println("\n2. Nombre del gato");
                            String nombreGato = s.next();
                            System.out.println("\n3. Edad del gato");
                            int edadGato = s.nextInt();
                            System.out.println("\n4. Peso del gato");
                            double pesoGato = s.nextDouble();
                            System.out.println("\n5. Color del gato");
                            String colorGato = s.next();
                            System.out.println("\n6. Vacunado");
                            System.out.println("\n 1 = Si");
                            System.out.println("\n 2 = No");
                            int vacunadoGato = s.nextInt();
                            boolean esVerdaderoGato = false;

                            if (vacunadoGato == 1 || vacunadoGato == 2){
                                switch (vacunadoGato){
                                    case 1:
                                        esVerdaderoGato = true;
                                        break;
                                    case 2:
                                        esVerdaderoGato = false;
                                }
                            } else  {
                                System.out.println("Error: Numero invalido, solo puede usar 1 para si y 2 para no");
                            }
                            Gato g = new Gato(idGato,nombreGato,edadGato,pesoGato, colorGato,esVerdaderoGato);
                            lstMascotas.add(g);
                            System.out.println("Gato registrado exitosamente");
                            System.out.println(g.toString());
                    }

                    break;
                case 2:
                    System.out.println("\n2.Listar mascotas");

                    System.out.println("=== Lista de mascota registradas actualmente ===");

                    for (Mascota mascota : lstMascotas){

                        mascota.getId();
                        mascota.getNombre();
                        mascota.getEdad();
                        mascota.getPeso();

                        System.out.println(
                                "\nId: " + mascota.getId() +
                                "\nNombre: " + mascota.getNombre() +
                                "\nEdad:  " + mascota.getEdad() +
                                "\nPeso : " + mascota.getPeso());
                    }
                    break;
                case 3:
                    System.out.println("\n3. Buscar mascota por id");
                    System.out.println("=== ID DE LA MASCOTA === ");
                    //Id a buscar
                    int buscarIdMascota = s.nextInt();
                    int idEncontradas= 0;
                    String nombreMascota = null;
                    Boolean mascotaEncontrada = false;


                    //id de las mascotas en mi lista
                    List<Integer> lstIdEncontradas = new ArrayList<>();
                    for (Mascota mascota : lstMascotas){
                        idEncontradas = mascota.getId();
                        nombreMascota = mascota.getNombre();
                        if (idEncontradas == buscarIdMascota){
                            System.out.println("=== Mascota encontrada ===");
                            System.out.println("Id : " + idEncontradas);
                            System.out.println("Nombre : " + nombreMascota);
                            mascotaEncontrada=true;
                        }
                    }

                    if (!mascotaEncontrada){
                        System.out.println("Error: Mascota no econtrada");
                    }

                break;
                case 4:
                    boolean mascotaEncontradaCita = false;
                    System.out.println("\n4. Regitsrar cita");
                    System.out.println("\n=== Regitrar cita ===");
                    System.out.println("\n1. Id cita");
                    int idCita = s.nextInt();
                    System.out.println("\n2. Id de la mascota para la cita");
                    int idMascota = s.nextInt();
                    System.out.println("\n3. id del veterinario");
                    int idVeterinario = s.nextInt();
                    System.out.println("\n4. Fecha");
                    String fechaCita = s.next();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fecha = LocalDate.parse(fechaCita, formato);
                    System.out.println("\n5. Motivo");
                    String motivo = s.next();

                    for (Mascota mascota : lstMascotas){
                        idEncontradas = mascota.getId();
                        nombreMascota = mascota.getNombre();
                        if (idEncontradas == idMascota){
                            System.out.println("=== Mascota encontrada ===");
                            System.out.println("Id : " + idEncontradas);
                            System.out.println("Nombre : " + nombreMascota);
                            mascotaEncontradaCita=true;
                            Cita cita = new Cita(idCita, mascota, veterinario1, fecha, motivo);
                            lstCita.add(cita);
                            System.out.println(cita.toString());
                            break;
                        }
                    }
                    if (!mascotaEncontradaCita){
                        System.out.println("Error: Mascota no econtrada cita no registrada");
                    }




                    break;
                case 5:
                    System.out.println("\n5. Ver cita");
                    break;
                case 6:
                    System.out.println("\nGracias por usar este sistema de veteniaria");
            }
        }
    }
}