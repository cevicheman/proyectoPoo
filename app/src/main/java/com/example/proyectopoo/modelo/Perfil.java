package com.example.proyectopoo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
               
    private String nombre;          
    private String relacion;        
    private String email;
    
    public Perfil(String nombre, String relacion, String email) {
        this.nombre = nombre;
        this.relacion = relacion;
        this.email = email;
        
    }
// Getters y setters 
    public String getNombre() {
        return nombre;
    }

    public String getRelacion() {
        return relacion;
    }

    public String getEmail() {
        return email;
    }
// metodo toString
    @Override
    public String toString() {
        return "Perfil [nombre=" + nombre + ", relacion=" + relacion + ", email=" + email + "]";

}
}
