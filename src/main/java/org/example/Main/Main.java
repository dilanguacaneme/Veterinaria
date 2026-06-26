package org.example.Main;


import org.example.clases.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Map Dueño
        //Dueño
        Map<Integer, Dueño> dueñoLista = new HashMap<>();
        Dueño dueño1 = new Dueño(1,"Dilan", "3004665648", "Carrera 123");
        Dueño dueño2 = new Dueño(2,"Javier", "3003445654", "Carrera 456");
        dueñoLista.put(dueño1.getId(), dueño1);
        dueñoLista.put(dueño2.getId(), dueño2);
        for (Map.Entry <Integer, Dueño> entry : dueñoLista.entrySet()){

            entry.getKey();
            entry.getValue();

            System.out.println("\n Espcio : " + entry.getKey() +
                                "\n Espacio : " + entry.getValue());

        }

        //Veterinario
        Map<Integer, Veterinario> veterinariosLista = new HashMap<>();
        Veterinario veterinario1 = new Veterinario(1, "Carlos Torres", "Especialidad en gatos", "321456789");
        Veterinario veterinario2 = new Veterinario(2, "Vicente Fernandez", "Especialidad en mujeres", "3215321645");
        veterinariosLista.put(veterinario1.getId(), veterinario1);
        veterinariosLista.put(veterinario2.getId(), veterinario2);

        for (Map.Entry <Integer, Veterinario> veteniario : veterinariosLista.entrySet()){

            veteniario.getKey();
            veteniario.getValue();

            System.out.println("\n Espcio : " + veteniario.getKey() +
                    "\n Espacio : " + veteniario.getValue());

        }

        //Mascotas
//        List<Mascota> lstMascotas = new ArrayList<>();
//        lstMascotas.add(new Perro(1, "Dilan", 5, 18.5, true, "Firulais"));
//        lstMascotas.add(new Perro(2, "Rocky", 3, 22.0, false, "Salchipapa"));
//        lstMascotas.add(new Perro(3, "Max", 7, 25.5, true, "Hamburguesa"));
//
//        lstMascotas.add(new Gato(4, "Michi", 2, 4.2, "Negro", true));
//        lstMascotas.add(new Gato(5, "Pelusa", 1, 3.8, "Blanco", false));
//        lstMascotas.add(new Gato(6, "Tom", 6, 5.1, "Gris", true));

        Map<Integer, Mascota> mapMascotas = new HashMap<>();
        Perro perro1 = new Perro(1, "Dilan", 5, 18.5, true, "Firulais");
        Perro perro2 = new Perro(2, "Rocky", 3, 22.0, false, "Salchipapa");
        Perro perro3 = new Perro(3, "Max", 7, 25.5, true, "Hamburguesa");

        Gato gato1 = new Gato(4, "Michi", 2, 4.2, "Negro", true);
        Gato gato2 = new Gato(5, "Pelusa", 1, 3.8, "Blanco", false);
        Gato gato3 = new Gato(6, "Tom", 6, 5.1, "Gris", true);

        mapMascotas.put(perro1.getId(), perro1);
        mapMascotas.put(perro2.getId(), perro2);
        mapMascotas.put(perro3.getId(), perro3);

        mapMascotas.put(gato1.getId(), gato1);
        mapMascotas.put(gato2.getId(), gato2);
        mapMascotas.put(gato3.getId(), gato3);



        //Citas
        Cita cita1 = new Cita(
                1,
                perro1,
                veterinario1,
                LocalDate.of(2026, 6, 23),
                "Vacunacion"
        );

        Cita cita2 = new Cita(
                2,
                perro2,
                veterinario1,
                LocalDate.of(2026, 6, 25),
                "Control general"
        );

        Cita cita3 = new Cita(
                3,
                perro3,
                veterinario1,
                LocalDate.of(2026, 7, 1),
                "Desparasitacion"
        );

        Cita cita4 = new Cita(
                4,
                gato1,
                veterinario1,
                LocalDate.of(2026, 7, 5),
                "Revision de peso"
        );

        Cita cita5 = new Cita(
                5,
                gato2,
                veterinario1,
                LocalDate.of(2026, 7, 10),
                "Control postoperatorio"
        );
        Map<Integer, Cita> mapaCitas = new HashMap<>();
        mapaCitas.put(cita1.getId(), cita1);
        mapaCitas.put(cita2.getId(), cita2);
        mapaCitas.put(cita3.getId(), cita3);
        mapaCitas.put(cita4.getId(), cita4);
        mapaCitas.put(cita5.getId(), cita5);




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
                            mapMascotas.put(p.getId(), p);
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
                            mapMascotas.put(g.getId(), g);
                            System.out.println("Gato registrado exitosamente");
                            System.out.println(g.toString());
                    }

                    break;
                case 2:
                    System.out.println("\n2.Listar mascotas");

                    System.out.println("=== Lista de mascota registradas actualmente ===");

                    for (Map.Entry<Integer, Mascota> mascota : mapMascotas.entrySet()){



                        System.out.println(
                                "\nId: " + mascota.getKey()+
                                "\nMascota: " + mascota.getValue());
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
                    for (Map.Entry<Integer, Mascota> mascota : mapMascotas.entrySet()){
                        idEncontradas = mascota.getKey();
                        if (idEncontradas == buscarIdMascota){
                            System.out.println("=== Mascota encontrada ===");
                            System.out.println("Id : " + idEncontradas);
                            System.out.println("Mascota : " + mascota.getValue());
                            mascotaEncontrada=true;
                        }
                    }

                    if (!mascotaEncontrada){
                        System.out.println("Error: Mascota no econtrada");
                    }

                break;
                case 4:
                    boolean mascotaEncontradaCita = false;
                    boolean veterianarioEncontradoCita = false;
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

                    int idEncontradasMascotas;
                    int idEncontradasVeterinario;


                    for (Map.Entry <Integer, Mascota> mascota : mapMascotas.entrySet()){
                        //Buscar la mascota en mi map con id que me pasaron
                        idEncontradasMascotas = mascota.getKey();
                        Mascota m = mascota.getValue();

                        if (idEncontradasMascotas == idMascota){
                            System.out.println("=== Mascota encontrada ===");
                            System.out.println(m);
                            mascotaEncontradaCita = true;
                            for (Map.Entry <Integer, Veterinario> veterinario : veterinariosLista.entrySet()){
                                idEncontradasVeterinario = veterinario.getKey();
                                Veterinario v = veterinario.getValue();

                                if (idEncontradasVeterinario == idVeterinario){
                                    System.out.println("=== Veterinario encontrado ===" + v);
                                    System.out.println(v);
                                    veterianarioEncontradoCita = true;
                                    Cita cita = new Cita(idCita, m, v, fecha, motivo);
                                    mapaCitas.put(cita.getId(), cita);
                                    System.out.println("Cita registrada correctamente.");

                                    }
                                }
                            }
                        }

                    if (!mascotaEncontradaCita) {
                        System.out.println("Error: Mascota no encontrada.");
                    }

                    if (!veterianarioEncontradoCita ) {
                        System.out.println("Error: Veterinario no encontrado.");
                    }



                    break;
                case 5:
                    System.out.println("\n5. Ver cita");
                    System.out.println("=== Citas hasta la fecha ===");
//                    for (Cita cita: lstCita){
//
//                        cita.getId();
//                        cita.getFecha();
//                        cita.getMascota();
//                        cita.getMotivo();
//                        cita.getVeterinario();
//
//                        System.out.println("============");
//                        System.out.println("\nCita numero " + cita.getId() +
//                                "\n Fecha :" + cita.getFecha() +
//                                "\n Mascota :" + cita.getMascota() +
//                                "\n Motivo :" + cita.getMotivo() +
//                                "\n Veterinario :" + cita.getVeterinario()
//                        );
//                    }

                    break;
                case 6:
                    System.out.println("\nGracias por usar este sistema de veteniaria");
            }
        }
    }
}