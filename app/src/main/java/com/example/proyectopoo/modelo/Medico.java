package com.example.proyectopoo.modelo;

import java.util.ArrayList;

public class Medico {
    private String nombre;
    private String especialidad;
    private String telefono;
    private String email;
    private String direccion;

    public Medico(String nombre, String especialidad, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
            "\nEspecialidad: " + especialidad +
            "\nTeléfono: " + telefono +
            "\nEmail: " + email +
            "\nDirección: " + direccion;
    }
}
