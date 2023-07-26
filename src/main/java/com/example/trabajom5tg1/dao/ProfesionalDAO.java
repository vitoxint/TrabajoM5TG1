package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;
import com.example.trabajom5tg1.idao.ProfesionalIDAO;
import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Profesional;
import com.example.trabajom5tg1.models.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
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
    public Profesional editar( Usuario usuario ){
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;

        String sql = "SELECT IdProfesionales , titulo , fecha_ingreso  from Profesionales where username = '"+usuario.getNombreUsuario()+"' limit 1 ;";

        Profesional us = new Profesional();

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while(rs.next()){

                us = new Profesional();

                us.setId( usuario.getId() );
                us.setNombre( usuario.getNombre());
                us.setNombreUsuario( usuario.getNombreUsuario());
                us.setTipoUsuario( usuario.getTipoUsuario());
                us.setContrasena(usuario.getContrasena());

                us.setTitulo(rs.getString(2));
                us.setFechaIngreso(rs.getString(3));

            }

            rs.close();
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase ProfesionalDAO en el método editar");
            e.printStackTrace();
            return null;
        }

        return us;
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

