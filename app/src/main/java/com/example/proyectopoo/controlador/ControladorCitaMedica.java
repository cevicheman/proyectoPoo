package com.example.proyectopoo.controlador;
import com.example.proyectopoo.modelo.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControladorCitaMedica {
    private List<CitaMedica> citas;

    public ControladorCitaMedica() {
        this.citas = new ArrayList<>();
    }

    public List<String> obtenerCitas() {
        citas.sort(Comparator.comparing(CitaMedica::getFechaHora)); // Ordenar por fecha y hora
        List<String> lista = new ArrayList<>();
        for (CitaMedica cita : citas) {
            lista.add(cita.toString());
        }
        return lista;
    }

    public String agregarCita(String titulo, Medico medico, String fechaHora) {
        CitaMedica nuevaCita = new CitaMedica(titulo, medico, fechaHora);
        citas.add(nuevaCita);
        return "Cita agregada exitosamente.";
    }
}