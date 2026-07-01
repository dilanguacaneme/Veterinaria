package org.example.service;

import org.example.clases.Cita;
import org.example.clases.Mascota;
import org.example.clases.Veterinario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CitaService {
    private final Map<Integer, Veterinario> veterinariosLista = new HashMap<>();
    private final Map<Integer, Cita> mapaCitas = new HashMap<>();
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public CitaService() {
        // Datos iniciales de veterinarios
        veterinariosLista.put(1, new Veterinario(1, "Carlos Torres", "Especialidad en gatos", "321456789"));
        veterinariosLista.put(2, new Veterinario(2, "Vicente Fernandez", "Especialidad en mujeres", "3215321645"));
    }

    public void registrarCita(Scanner s, Map<Integer, Mascota> mapMascotas) {
        System.out.println("\n=== Registrar Cita ===");
        System.out.print("Id cita: ");
        int idCita = s.nextInt();
        System.out.print("Id de la mascota para la cita: ");
        int idMascota = s.nextInt();
        System.out.print("Id del veterinario: ");
        int idVeterinario = s.nextInt();
        System.out.print("Fecha (dd/MM/yyyy): ");
        String fechaCita = s.next();
        System.out.print("Motivo: ");
        String motivo = s.next();

        // Validamos usando la ventaja de los mapas (.get) en vez de anidar bucles for
        Mascota mascota = mapMascotas.get(idMascota);
        Veterinario veterinario = veterinariosLista.get(idVeterinario);

        if (mascota == null) {
            System.out.println("Error: Mascota no encontrada.");
            return;
        }

        if (veterinario == null) {
            System.out.println("Error: Veterinario no encontrado.");
            return;
        }

        try {
            LocalDate fecha = LocalDate.parse(fechaCita, formato);
            Cita cita = new Cita(idCita, mascota, veterinario, fecha, motivo);
            mapaCitas.put(cita.getId(), cita);
            System.out.println("=== Cita registrada correctamente ===");
            System.out.println(cita);
        } catch (Exception e) {
            System.out.println("Error en el formato de la fecha. Recuerda usar dd/MM/yyyy");
        }
    }

    public void verCitas() {
        System.out.println("\n=== Citas hasta la fecha ===");
        if (mapaCitas.isEmpty()) {
            System.out.println("No hay citas registradas.");
            return;
        }
        for (Cita cita : mapaCitas.values()) {
            System.out.println("==================");
            System.out.println("Cita Número: " + cita.getId());
            System.out.println("Fecha: " + cita.getFecha());
            System.out.println("Mascota: " + cita.getMascota().getNombre());
            System.out.println("Veterinario: " + cita.getVeterinario().getNombre());
            System.out.println("Motivo: " + cita.getMotivo());
        }
    }
}
