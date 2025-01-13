package com.example.proyectopoo.controlador;
import java.util.*;
import com.example.proyectopoo.modelo.*;

public class ControladorPerfil {
    public  ArrayList<Perfil> l_perfil;
    private int perfilSeleccionado;
    public ControladorPerfil(){
        l_perfil=new ArrayList<>();
        
        Perfil p1= new Perfil("Gladys", null, null);
        Perfil p2= new Perfil("XYZ", null, null);
        l_perfil.add(p1);
        l_perfil.add(p2);

    }
    public List<String> obtenerPerfiles() {
        List<String> nombres = new ArrayList<>();
        for (Perfil perfil : l_perfil) {
            nombres.add(perfil.getNombre());
        }
        return nombres;
    }

    /*public MensajeUsuario agregarPerfil(String nombre, String relacion, String email){
        if (buscarPerfilPorNombre(nombre)==null){
            Perfil p= new Perfil(nombre, relacion, email);
            l_perfil.add(p);
            return null;
        }
        return new MensajeUsuario("Agregar Perfil", "El Perfil ya existe");
        
    }*/
    public Perfil buscarPerfilPorNombre(String nombre){
        for (Perfil p: l_perfil){
            if (p.getNombre().toUpperCase().equals(nombre.toUpperCase())){
                return p;
            }
        }
                return null;

    }
    public ArrayList<Perfil> getListaPerfil() {
        return l_perfil;
    }
    public boolean seleccionarPerfil(int indice) {
        if (indice >= 0 && indice < l_perfil.size()) {
            perfilSeleccionado = indice;
            return true; // Perfil seleccionado exitosamente
        }
        return false; // Si el índice no es válido
    }
}
 
    
    


