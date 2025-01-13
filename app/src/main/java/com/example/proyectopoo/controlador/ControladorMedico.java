package com.example.proyectopoo.controlador;

import java.util.ArrayList;
import java.util.List;
import com.example.proyectopoo.modelo.*;

public class ControladorMedico {
    private List<Medico> medicos;

    public ControladorMedico() {
        this.medicos = new ArrayList<>();
    }

    public ArrayList<String> obtenerListadoMedicos() {
        ArrayList<String> listado = new ArrayList<>();
        for (Medico medico : medicos) {
            listado.add(medico.toString());
        }
        return listado;
    }

    public String agregarMedico(String nombre, String especialidad, String telefono, String email, String direccion) {
        Medico nuevoMedico = new Medico(nombre, especialidad, telefono, email, direccion);
        medicos.add(nuevoMedico);
        return "Médico agregado exitosamente.";
    }
    public ArrayList<String> obtenerMedicos() {
        ArrayList<String> lista = new ArrayList<>();
        for (Medico medico : medicos) {
            lista.add(medico.getNombre()); // Agregar el nombre de cada médico a la lista
        }
        return lista; // Devuelve la lista de médicos
    }

    public Medico obtenerMedicoPorIndice(int indice) {
        if (indice >= 0 && indice < medicos.size()) {
            return medicos.get(indice);
        }
        return null; // Handle invalid indices
    }
}

