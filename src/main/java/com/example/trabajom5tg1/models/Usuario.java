package com.example.trabajom5tg1.models;

public class Usuario {

    // Atributos
    private String nombre;
    private int edad;
    private String correoElectronico;
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombre, int edad, String correoElectronico, String nombreUsuario, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;


}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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
    System.out.println("Edad: " + this.edad);
    System.out.println("Correo Electronico: " + this.correoElectronico);
    System.out.println("Nombre de Usuario: " + this.nombreUsuario);

    }
    public boolean verificacion(String contrasenaIngresada) {
        return contrasena.equals(contrasenaIngresada);
    }
}

