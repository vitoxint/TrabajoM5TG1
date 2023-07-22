package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.conexion.Conexion;
import com.example.trabajom5tg1.idao.CapacitacionDAO;
import com.example.trabajom5tg1.models.Capacitacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CapacitacionDAOImp implements CapacitacionDAO {

    @Override
    public boolean registrar(Capacitacion capacitacion) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO Capacitaciones (" +
                " nombre, detalle , rut_cliente , dia_semana , hora , lugar , duracion ,cant_asistentes) " +
                "values ('"
                +capacitacion.getNombre()+"','"
                +capacitacion.getDetalle()+"','"
                +capacitacion.getRutCliente()+"','"
                +capacitacion.getDiaSemana()+"','"
                +capacitacion.getHora()+"','"
                +capacitacion.getLugar()+"','"
                +capacitacion.getDuracion()+"','"
                +capacitacion.getCantAsistentes()+

                "')";

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase CapacitacionDAOImpl en el método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Capacitacion> listarCapacitaciones() {
        Statement stm = null;
        Connection con = null;
        ResultSet rs = null;

        String sql = "SELECT * from Capacitaciones ORDER BY id";

        List<Capacitacion> lista = new ArrayList<Capacitacion>();

        try{
            con = Conexion.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while(rs.next()){

                Capacitacion cap = new Capacitacion();

                cap.setNumCapacitacion(rs.getInt(1));
                cap.setNombre(rs.getString(2));
                cap.setDetalle(rs.getString(3));
                cap.setRutCliente(rs.getString(4));
                cap.setDiaSemana(rs.getString(5));
                cap.setHora(rs.getString(6));
                cap.setLugar(rs.getString(7));
                cap.setDuracion(rs.getString(8));
                cap.setCantAsistentes(rs.getInt(9));


                lista.add(cap);

            }

            rs.close();
            stm.close();
            con.close();

        }catch (SQLException e) {
            System.out.println("Error : clase CapacitacionDAOImpl en el método listar");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public boolean eliminar(Capacitacion capacitacion) {
        return false;
    }

    @Override
    public boolean modificar(Capacitacion capacitacion) {
        return false;
    }
}
