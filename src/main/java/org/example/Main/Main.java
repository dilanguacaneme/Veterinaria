package org.example.main;

import org.example.service.CitaService;
import org.example.service.MascotaService;
import org.example.service.DueñoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciamos los tres servicios necesarios
        MascotaService mascotaService = new MascotaService();
        CitaService citaService = new CitaService();
        DueñoService dueñoService = new DueñoService();

        Scanner s = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9) {
            System.out.println("\n=== VETERINARIA ===");
            System.out.println("1. Registrar dueño");
            System.out.println("2. Listar dueños");
            System.out.println("3. Registrar mascota");
            System.out.println("4. Listar mascotas");
            System.out.println("5. Buscar mascota por ID");
            System.out.println("6. Registrar cita");
            System.out.println("7. Ver citas");
            System.out.println("8. Vacunar mascota");
            System.out.println("9. Salir");

            System.out.print("\nSeleccione una opcion: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    dueñoService.registrarDueño(s);
                    break;
                case 2:
                    dueñoService.listarDueños();
                    break;
                case 3:
                    // Enviamos el mapa de dueños para validar que el dueño exista al crear la mascota
                    mascotaService.registrarMascota(s, dueñoService.getDueñoLista());
                    break;
                case 4:
                    mascotaService.listarMascotas();
                    break;
                case 5:
                    mascotaService.buscarMascotaPorId(s);
                    break;
                case 6:
                    citaService.registrarCita(s, mascotaService.getMapMascotas());
                    break;
                case 7:
                    citaService.verCitas();
                    break;
                case 8:
                    mascotaService.vacunarMascota(s);
                    break;
                case 9:
                    System.out.println("\nGracias por usar este sistema de veterinaria.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        s.close();
    }
}