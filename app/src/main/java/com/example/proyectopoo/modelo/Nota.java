package com.example.proyectopoo.modelo;
import java.time.LocalDateTime;

public class Nota {
    private LocalDateTime fechaHora;
    private String descripcion;

    public Nota(String descripcion) {
        this.fechaHora = LocalDateTime.now();  // Fecha y hora actual
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Fecha: " + fechaHora + ", Descripción: " + descripcion;
    }
}

