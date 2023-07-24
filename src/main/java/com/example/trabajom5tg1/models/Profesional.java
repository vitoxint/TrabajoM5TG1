package com.example.trabajom5tg1.models;

public class Profesional extends Usuario {

    private String titulo;
    private String fechaIngreso;
    private int usuarioId;

    public Profesional(String nombre, String nombreUsuario, String contrasena , String tipoUsuario, String titulo, String fechaIngreso) {
        super( nombre,  nombreUsuario,  contrasena , tipoUsuario);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    /**
     * Devuelve en forma de cadena
     *
     * @return retorna cadena que representa al profesional
     */
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                "} " + super.toString();
    }
}
