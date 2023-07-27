package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public static boolean validarUsuario(String usuario, String contrasena){
        boolean validarUsuario = false;
        PreparedStatement ps = null;
        Connection con = null;

        String sql = "SELECT * FROM Usuarios WHERE nombreUsuario = ? AND password = ?";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            ResultSet rs = ps.executeQuery();
            validarUsuario = rs.next(); // Verificar si se encontró algún resultado
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: Clase LoginDAO, método validarUsuario");
            e.printStackTrace();
        }
        return validarUsuario;
    }

    public static String tipoUsuario(String usuario) {
        String tipoUsuario = "";
        PreparedStatement ps = null;
        Connection con = null;

        String sql = "SELECT tipo FROM Usuarios WHERE nombreUsuario = ?";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoUsuario = rs.getString("tipo");
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: Clase LoginDAO, método tipoUsuario");
            e.printStackTrace();
        }
        return tipoUsuario;
    }
}