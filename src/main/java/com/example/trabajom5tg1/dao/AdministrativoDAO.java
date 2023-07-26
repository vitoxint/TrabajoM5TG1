package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;
import com.example.trabajom5tg1.idao.AdministrativoIDAO;
import com.example.trabajom5tg1.models.Administrativo;
import com.example.trabajom5tg1.models.Profesional;
import com.example.trabajom5tg1.models.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class AdministrativoDAO  implements AdministrativoIDAO {

    @Override
    public boolean registrar(Administrativo usuario) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO Administrativos (" +
                "  username , area , experiencia_previa  ) " +
                "values ('"

                +usuario.getNombreUsuario()+"','"
                +usuario.getArea()+"','"
                +usuario.getExperienciaPrevia()+

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
    public Administrativo editar(Usuario usuario ){
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;

        String sql = "SELECT id , area , experiencia_previa , username  from Administrativos where username = '"+usuario.getNombreUsuario()+"' limit 1 ;";

        Administrativo us = new Administrativo();

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while(rs.next()){

                us = new Administrativo();

                us.setId( usuario.getId() );
                us.setNombre( usuario.getNombre());
                us.setNombreUsuario( usuario.getNombreUsuario());
                us.setTipoUsuario( usuario.getTipoUsuario());
                us.setContrasena(usuario.getContrasena());

                us.setArea(rs.getString(2));
                us.setExperienciaPrevia(rs.getString(3));

            }

            rs.close();
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase AdministrativoDAO en el método editar");
            e.printStackTrace();
            return null;
        }

        return us;
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

