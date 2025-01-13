package com.example.proyectopoo.controlador;
import java.time.LocalDate;
import java.util.ArrayList;
import com.example.proyectopoo.modelo.*;
import java.util.*;

public class ControladorActividadFisica {
    private ArrayList<ActividadFisica> actividades;

    public ControladorActividadFisica() {
        this.actividades = new ArrayList<>();
    }

    // Agregar una nueva actividad
    public String agregarActividad(LocalDate fecha, String actividad, int duracion, String horario) {
        // Validar fecha (no puede ser futura)
        if (fecha.isAfter(LocalDate.now())) {
            return "Error: La fecha no puede ser futura.";
        }

        ActividadFisica nuevaActividad = new ActividadFisica(fecha, actividad, duracion, horario);
        actividades.add(nuevaActividad);
        return "Actividad registrada exitosamente.";
    }

    // Listar todas las actividades ordenadas desde la más reciente a la más antigua
    public ArrayList<ActividadFisica> obtenerListadoActividades() {
        actividades.sort((a1, a2) -> a2.getFecha().compareTo(a1.getFecha())); // Ordenar de más reciente a más antigua
        return actividades;
    }
}