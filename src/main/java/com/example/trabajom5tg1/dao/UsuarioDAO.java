package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;
import com.example.trabajom5tg1.idao.UsuarioIDAO;
import com.example.trabajom5tg1.models.Capacitacion;
import com.example.trabajom5tg1.models.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements UsuarioIDAO {
    private List<Usuario> usuarios;

    public UsuarioDAO() {
        this.usuarios = new ArrayList<>();
        // Agregar algunos usuarios de ejemplo (esto simularía la carga inicial desde la base de datos)
        //usuarios.add(new Usuario("Ejemplo1", 25, "ejemplo1@gmail.com", "ejemplo1user", "ejemplo1pass"));
        //usuarios.add(new Usuario("Ejemplo2", 30, "ejemplo2@gmail.com", "ejemplo2user", "ejemplo2pass"));
    }

    @Override
    public boolean registrar(Usuario usuario) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO Usuarios (" +
                "  nombre , nombreUsuario , tipo , password ) " +
                "values ('"
                +usuario.getNombre()+"','"
                +usuario.getNombreUsuario()+"','"
                +usuario.getTipoUsuario()+"','"
                +usuario.getContrasena()+

                "')";

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase UsuarioDAO en el método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;

        String sql = "SELECT * from Usuarios ORDER BY nombre";

        List<Usuario> lista = new ArrayList<Usuario>();

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while(rs.next()){

                Usuario us = new Usuario();

                us.setId(rs.getInt(1));
                us.setNombre(rs.getString(2));
                us.setTipoUsuario(rs.getString(3));
                us.setNombreUsuario(rs.getString(4));



                lista.add(us);

            }

            rs.close();
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase UsuarioDAO en el método listar");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Usuario editar( int id ){
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;

        String sql = "SELECT id , nombre , tipo , nombreUsuario , password from Usuarios where id = "+id+" limit 1 ;";

        Usuario us = new Usuario();

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while(rs.next()){

                us = new Usuario();

                us.setId(rs.getInt(1));
                us.setNombre(rs.getString(2));
                us.setTipoUsuario(rs.getString(3));
                us.setNombreUsuario(rs.getString(4));
                us.setContrasena(rs.getString(5));

            }


            rs.close();
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase UsuarioDAO en el método editar");
            e.printStackTrace();
            return null;
        }

        return us;
    }

    @Override
    public boolean eliminar(Usuario usuario) {
        return false;
    }

    @Override
    public boolean modificar(Usuario usuario) {
        return false;
    }


    // Método para guardar un nuevo usuario en la lista (simulando la inserción en la base de datos)
    /*public void insertarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }*/

    // Método para obtener un usuario por su nombre de usuario (simulando una búsqueda en la base de datos)
    public Usuario obtenerUsuarioPorNombre(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null; // Si no se encuentra el usuario, devolver null.
    }
}
