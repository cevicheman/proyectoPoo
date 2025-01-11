package com.example.proyectopoo.modelo;

import java.time.LocalDate;

import java.time.LocalDate;

public class ActividadFisica {
    private LocalDate fecha;
    private String actividad;
    private int duracion;
    private String horario;

    public ActividadFisica(LocalDate fecha, String actividad, int duracion, String horario) {
        this.fecha = fecha;
        this.actividad = actividad;
        this.duracion = duracion;
        this.horario = horario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getActividad() {
        return actividad;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Actividad: " + actividad + ", Duración: " + duracion + " minutos, Horario: " + horario;
    }
}


