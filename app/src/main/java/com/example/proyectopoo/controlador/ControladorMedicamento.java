package com.example.proyectopoo.controlador;

import java.util.ArrayList;
import java.util.List;

import com.example.proyectopoo.modelo.Medicamento;

public class ControladorMedicamento {
    private List<Medicamento> medicamentos;

    public ControladorMedicamento() {
        this.medicamentos = new ArrayList<>();  // Asegúrate de que la lista esté inicializada
    }

    public ArrayList<String> obtenerMedicamentos() {
        ArrayList<String> lista = new ArrayList<>();
        for (Medicamento medicamento : medicamentos) {
            lista.add(medicamento.toString());
        }
        return lista;
    }

    public String agregarMedicamento(String nombre, int cantidad, String presentacion, int frecuencia, int dosis) {
        Medicamento nuevo = new Medicamento(nombre, cantidad, presentacion, presentacion, dosis);
        medicamentos.add(nuevo);
        return "Medicamento agregado exitosamente.";
    }

    public String eliminarMedicamento(String nombre) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                medicamentos.remove(medicamento);
                return "Medicamento eliminado exitosamente.";
            }
        }
        return "Medicamento no encontrado.";
    }

    public String registrarToma(String nombre, String fechaHora) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                medicamento.registrarToma(fechaHora);
                return "Toma registrada exitosamente.";
            }
        }
        return "Medicamento no encontrado.";
    }
    public String recargarMedicamento(String nombre, int cantidad) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                medicamento.recargar(cantidad);
                return "Recarga realizada exitosamente.";
            }
        }
        return "Medicamento no encontrado.";
    }

    public String establecerUmbral(String nombre, int umbral) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equalsIgnoreCase(nombre)) {
                medicamento.setUmbral(umbral);
                return "Umbral establecido exitosamente.";
            }
        }
        return "Medicamento no encontrado.";
    }

    public List<String> verificarRecordatorios() {
        List<String> alertas = new ArrayList<>();
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.verificarUmbral()) {
                alertas.add("¡Recordatorio! El medicamento " + medicamento.getNombre() +
                            " está por debajo del umbral: " + medicamento.getCantidad() + " unidades.");
            }
        }
        return alertas;
    }
}