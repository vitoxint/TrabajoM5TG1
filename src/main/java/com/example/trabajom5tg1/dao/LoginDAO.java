package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;

import java.sql.Connection;
import java.sql.Statement;

public class LoginDAO {
    public static boolean validarUsuario(String usuario, String contrasena){
        boolean validarUsuario = false;
        Statement stm = null;
        Connection con = null;

        String sql = "SELECT * FROM Usuarios WHERE nombreUsuario = '"+usuario+"' AND password = '"+contrasena+"'";
        String tipoUsuario = "SELECT tipo FROM usuario WHERE nombreUsuario = '"+usuario+"' AND password = '"+contrasena+"'";
        try {
        con = Conexion.conectar();
        stm = con.createStatement();
        stm.executeQuery(sql);
        validarUsuario = true;
        stm.close();
        con.close();
    } catch (Exception e) {
        System.out.println("Error: Clase LoginDAO, método validarUsuario");
        e.printStackTrace();
    }
    return validarUsuario;
    }
public static String tipoUsuario(String usuario){
        String tipoUsuario = "";
        Statement stm = null;
        Connection con = null;

        String sql = "SELECT tipo FROM Usuarios WHERE nombreUsuario = '"+usuario+"'";
        try {
        con = Conexion.conectar();
        stm = con.createStatement();
        stm.executeQuery(sql);
        tipoUsuario = stm.executeQuery(sql).toString();
        stm.close();
        con.close();
    } catch (Exception e) {
        System.out.println("Error: Clase LoginDAO, método validarUsuario");
        e.printStackTrace();
    }
    return tipoUsuario;
    }
}
