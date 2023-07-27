package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;
import com.example.trabajom5tg1.idao.ClienteIDAO;
import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
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
    public Cliente editar( Usuario usuario ){
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;

        String sql = "SELECT IdCliente , username , rut , edad , nombres ,apellidos ,direccion , comuna ,telefono , afp , salud  from Clientes where username = '"+usuario.getNombreUsuario()+"' limit 1 ;";

        Cliente us = new Cliente();

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while(rs.next()){

                us = new Cliente();

                us.setId( usuario.getId() );
                us.setNombre( usuario.getNombre());
                us.setNombreUsuario( usuario.getNombreUsuario());
                us.setTipoUsuario( usuario.getTipoUsuario());
                us.setContrasena(usuario.getContrasena());

                us.setRut(rs.getString(3));
                us.setEdad(rs.getInt(4));
                us.setNombres(rs.getString(5));
                us.setApellidos(rs.getString(6));
                us.setDireccion(rs.getString(7));
                us.setComuna(rs.getString(8));
                us.setTelefono(rs.getString(9));
                us.setAfp(rs.getString(10));
                us.setSistemaSalud(rs.getInt(11));

            }


            rs.close();
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase ClienteDAO en el método editar");
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
    public boolean modificar(Cliente usuario){
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "UPDATE Usuarios " +
                "SET nombre = '" + usuario.getNombre() +"', "+
                "password = '" + usuario.getContrasena() +"' "+
                "where id = " + usuario.getId() + " ; ";

        String sql2 = "UPDATE Clientes SET " +

                "rut = '"+ usuario.getRut()+"', "+
                "edad = "+ usuario.getEdad()+", "+
                "nombres ='"+usuario.getNombres()+"', "+
                "apellidos ='" +usuario.getApellidos()+"', "+
                "direccion = '" +usuario.getDireccion()+"', "+
                "comuna ='" +usuario.getComuna()+"', "+
                "telefono = '"+usuario.getTelefono()+"', "+
                "afp= '" +usuario.getAfp()+ "', "+
                "salud = " + usuario.getSistemaSalud() +
                " where username = '"+ usuario.getNombreUsuario()+"';";

        System.out.println( usuario.getSistemaSalud() );

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql2);
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase UsuarioDAO en el método actualizar");
            e.printStackTrace();
        }
        return registrar;
    }
}
