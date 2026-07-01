package org.example.service;

import org.example.clases.Dueño;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DueñoService {
    private final Map<Integer, Dueño> dueñoLista = new HashMap<>();

    public DueñoService() {
        // Datos iniciales de prueba que tenías originalmente
        dueñoLista.put(1, new Dueño(1, "Dilan", "3004665648", "Carrera 123"));
        dueñoLista.put(2, new Dueño(2, "Javier", "3003445654", "Carrera 456"));
    }

    public Map<Integer, Dueño> getDueñoLista() {
        return dueñoLista;
    }

    public void listarDueños() {
        System.out.println("\n=== Lista de Dueños Registrados ===");
        if (dueñoLista.isEmpty()) {
            System.out.println("No hay dueños registrados.");
            return;
        }
        for (Map.Entry<Integer, Dueño> entry : dueñoLista.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Nombre: " + entry.getValue().getNombre() + " | Teléfono: " + entry.getValue().getTelefono());
        }
    }

    public void registrarDueño(Scanner s) {
        System.out.println("\n=== Registrar Nuevo Dueño ===");
        System.out.print("ID del Dueño: ");
        int id = s.nextInt();

        // Limpiar el buffer del scanner antes de leer strings con espacios
        s.nextLine();

        System.out.print("Nombre completo: ");
        String nombre = s.nextLine();
        System.out.print("Teléfono: ");
        String telefono = s.next();
        s.nextLine(); // Limpiar buffer
        System.out.print("Dirección: ");
        String direccion = s.nextLine();

        if (dueñoLista.containsKey(id)) {
            System.out.println("Error: Ya existe un dueño con ese ID.");
            return;
        }

        Dueño nuevoDueño = new Dueño(id, nombre, telefono, direccion);
        dueñoLista.put(id, nuevoDueño);
        System.out.println("¡Dueño registrado exitosamente!");
    }
}
