package com.example.proyectopoo.controlador;
import com.example.proyectopoo.modelo.*;
import java.util.*;

public class ControladorNota {
    private List<Nota> notas;

    public ControladorNota() {
        this.notas = new ArrayList<>();
    }

    // Agregar una nueva nota
    public String agregarNota(String descripcion) {
        Nota nuevaNota = new Nota(descripcion);
        notas.add(nuevaNota);
        return "Nota registrada exitosamente.";
    }

    // Listar todas las notas ordenadas desde la más reciente a la más antigua
    public List<Nota> obtenerListadoNotas() {
        notas.sort((n1, n2) -> n2.getFechaHora().compareTo(n1.getFechaHora()));  // Ordenar de más reciente a más antigua
        return notas;
    }
}

