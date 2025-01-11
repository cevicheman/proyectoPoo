package com.example.proyectopoo.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private String nombre;
    private int cantidad;
    private String presentacion;
    private String frecuencia;
    private int dosis;
    private int umbral;

    private List<String> historialTomas;  // Historial de las tomas
    private List<String> historialRecargas;

    public Medicamento(String nombre, int cantidad, String presentacion, String frecuencia, int dosis) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.presentacion = presentacion;
        this.frecuencia = frecuencia;
        this.dosis = dosis;
        this.historialTomas = new ArrayList<>();
        this.historialRecargas = new ArrayList<>();
        this.umbral = 0; // Umbral inicial por defecto
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public int getDosis() {
        return dosis;
    }
    public List<String> getHistorialRecargas() {
        return historialRecargas;
    }
    public boolean verificarUmbral() {
        return this.cantidad <= this.umbral;
    }
    public void recargar(int cantidad) {
        this.cantidad += cantidad;
        this.historialRecargas.add("Recargado con " + cantidad + " unidades. Total: " + this.cantidad);
    }
    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    // Método para registrar una toma del medicamento
    public void registrarToma(String fechaHora) {
        if (cantidad >= dosis) {
            cantidad -= dosis;  // Reduce la cantidad disponible
            historialTomas.add(fechaHora + ": " + dosis + " unidades tomadas.");
        } else {
            throw new IllegalStateException("No hay suficiente cantidad para registrar la toma.");
        }
    }

    // Método para obtener el historial de tomas
    public List<String> obtenerHistorialTomas() {
        return historialTomas;
    }

    // Sobreescribimos el método toString para mostrar información sobre el medicamento
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Presentación: " + presentacion +
                ", Frecuencia: " + frecuencia + " días, Dosis: " + dosis;
    }
}


