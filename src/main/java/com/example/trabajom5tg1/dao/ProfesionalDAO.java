package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;
import com.example.trabajom5tg1.idao.ProfesionalIDAO;
import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Profesional;
import com.example.trabajom5tg1.models.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProfesionalDAO implements ProfesionalIDAO {

    @Override
    public boolean registrar(Profesional usuario) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO Profesionales (" +
                "  username , titulo , fecha_ingreso  ) " +
                "values ('"

                +usuario.getNombreUsuario()+"','"
                +usuario.getTitulo()+"','"
                +usuario.getFechaIngreso()+

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
    public boolean modificar(Usuario usuario) {
        return false;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return null;
    }

    @Override
    public boolean eliminar(Usuario usuario) {
        return false;
    }
}
