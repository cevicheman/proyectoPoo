package com.example.proyectopoo.modelo;

public class CitaMedica {
    private String titulo;
    private Medico medico;
    private String fechaHora;

    public CitaMedica(String titulo, Medico medico, String fechaHora) {
        this.titulo = titulo;
        this.medico = medico;
        this.fechaHora = fechaHora;
    }

    public String getTitulo() {
        return titulo;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" +
               "Dr.: " + medico.getNombre() + "\n" +
               "Fecha y Hora: " + fechaHora;
    }
}
