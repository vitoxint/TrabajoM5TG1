package com.example.trabajom5tg1.models;

public class Usuario {

    // Atributos
    private int id;
    private String nombre;
    private String nombreUsuario;
    private String contrasena;
    private String tipoUsuario;


    public Usuario() {
    }

    public Usuario(String nombre, String nombreUsuario, String contrasena, String tipoUsuario) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void infoUsuario(){
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Tipo de Usuario: " + this.tipoUsuario);
    System.out.println("Nombre de Usuario: " + this.nombreUsuario);

    }
    public boolean verificacion(String contrasenaIngresada) {
        return contrasena.equals(contrasenaIngresada);
    }
}

