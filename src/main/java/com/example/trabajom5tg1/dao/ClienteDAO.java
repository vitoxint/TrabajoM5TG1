package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;
import com.example.trabajom5tg1.idao.ClienteIDAO;
import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClienteDAO implements ClienteIDAO {


    @Override
    public boolean registrar(Cliente usuario) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO Clientes (" +
                "  username , rut , edad , nombres , apellidos ,direccion , comuna ,telefono ,afp ,salud  ) " +
                "values ('"

                +usuario.getNombreUsuario()+"','"
                +usuario.getRut()+"','"
                +usuario.getEdad()+"','"
                +usuario.getNombres()+"','"
                +usuario.getApellidos()+"','"
                +usuario.getDireccion()+"','"
                +usuario.getComuna()+"','"
                +usuario.getTelefono()+"','"
                +usuario.getAfp()+"','"
                +usuario.getSistemaSalud()+

                "')";

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : claseAdministrativoDAO en el método registrar");
            e.printStackTrace();
        }
        return registrar;
    }


    @Override
    public List<Usuario> listarUsuarios() {
        return null;
    }

    @Override
    public boolean eliminar(Usuario usuario) {
        return false;
    }

    @Override
    public boolean modificar(Usuario usuario) {
        return false;
    }
}
