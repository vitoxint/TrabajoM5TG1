package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.idao.CapacitacionDAO;
import com.example.trabajom5tg1.models.Capacitacion;

import java.util.List;

public class CapacitacionDAOImp implements CapacitacionDAO {

    @Override
    public boolean registrar(Capacitacion capacitacion) {
        return false;
    }

    @Override
    public List<Capacitacion> listarCapacitaciones() {
        return null;
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
