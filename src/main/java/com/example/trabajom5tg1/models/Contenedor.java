package com.example.trabajom5tg1.models;

//import Interfaces.Asesoria;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase representa un contenedor que almacena usuarios y capacitaciones.
 * @author A. Vera, H. Komori, J De la Huerta, V. Rivas
 * @version 1.0
 */
public class Contenedor{

   // public List<Asesoria> usuarios ;
    public List<Capacitacion> capacitaciones ;

    /**
     * Constructor de la clase Contenedor.
     * Inicia las listas de usuarios y capacitaciones como listas vacías.
     */
    public Contenedor(){
       // this.usuarios = new ArrayList<Asesoria>();
        this.capacitaciones = new ArrayList<Capacitacion>();

    }

    /**
     * Agrega un usuario de tipo cliente a la lista de usuarios.
     * @param a el objeto Interfaces. Asesoria que se va a agregar a la lista de usuarios.
     */
    //public void almacenarCliente( Cliente a ){
    //  this.usuarios.add( a );
    //}

    /**
     * Agrega un usuario de tipo profesional a la lista de usuarios.
     * @param a el objeto Interfaces. Asesoria que se va a agregar a la lista de usuarios.
     */
    //public void almacenarProfesional( Profesional a ){
    //    this.usuarios.add( a );
    //}



    /**
     * Agrega un usuario de tipo administrativo a la lista de usuarios.
     * @param a el objeto Interfaces.Asesoria que se va a agregar a la lista de usuarios.
     */
    //public void almacenarAdministrativo( Administrativo a ){
    //    this.usuarios.add( a );
    //}

    /**
     * método que almacena la el objeto de tipo capacitación recibida a la lista capacitaciones de ésta clase
     * @param c objeto de clase Capacitación
     */
    public void almacenarCapacitacion( Capacitacion c ){
        this.capacitaciones.add(c);
    }

    /**
     * método que lista todos los objetos de la clase Usuario o Asesoría almacenados en la lista usuarios de ésta clase
     */
    //public void listarUsuarios( ){
     //   for (Asesoria l:this.usuarios
     //        ) {
     //       System.out.println(l.toString());
    //
     //   }
    //}

    /**
     * método que lista todos los objetos de la clase Capacitacion almacenados en la lista capacitaciones de ésta clase
     */
    public void listarCapacitaciones( ){
        for (Capacitacion l:this.capacitaciones
        ) {
            System.out.println(l.toString());
        }
    }

    public List<Capacitacion> getListCapacitaciones( ){

        return this.capacitaciones;

    }


    /**
     * método que recibe un número de posición y elimina el objeto de la posición index de la lista capacitaciones
     * que contienen objetos de la clase Usuario que implementa la interfaz Asesoria
     * @param index
     */
    //public void eliminarUsuario( int index ) {

    //    this.usuarios.remove( index );
    //    System.out.println("Se ha eliminado el usuario");

    //}



    /**
     * Este método no retorna nada, pero muestra en pantalla todos los usuarios segregados por tipo.
     * @param tipo entero, tipo de Usuario, 1: Cliente, 2: Profesional 3: Administrativo.
     */
    /* public void listarUsuariosTipo( int tipo ){
        for (Asesoria l:this.usuarios
        ) {
            switch (tipo) {
                case 1 -> {
                    if (l instanceof Cliente) {
                        System.out.println(l);
                    }
                }
                case 2->{
                    if (l instanceof Profesional) {
                        System.out.println(l);
                    }
                }
                case 3 -> {
                    if (l instanceof Administrativo) {
                        System.out.println(l);
                    }
                }
                default -> {
                    System.out.println("Se ha ingresado una opción no válida.6");
                }
            }


        }
    }*/

}


