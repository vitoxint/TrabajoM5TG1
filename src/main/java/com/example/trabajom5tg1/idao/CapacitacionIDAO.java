package com.example.trabajom5tg1.idao;

import com.example.trabajom5tg1.models.Capacitacion;

import java.util.List;

public interface CapacitacionIDAO {

    public boolean registrar(Capacitacion capacitacion);
    public List<Capacitacion> listarCapacitaciones();
    public boolean eliminar(Capacitacion capacitacion);
    public boolean modificar(Capacitacion capacitacion);

}
