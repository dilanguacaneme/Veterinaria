package org.example.clases;

import java.time.LocalDate;

public class Cita {
    private int id;
    private Mascota mascota;
    private Veterinario veterinario;
    private LocalDate fecha;
    private String motivo;
    private String estado;

    public Cita() {
    }

    public Cita(int id, Mascota mascota, Veterinario veterinario, LocalDate fecha, String motivo, String estado) {
        this.id = id;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.motivo = motivo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
