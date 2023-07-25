package com.example.trabajom5tg1.idao;

import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Profesional;
import com.example.trabajom5tg1.models.Usuario;

import java.util.List;

public interface ProfesionalIDAO {

    public boolean registrar(Profesional usuario);
    public List<Usuario> listarUsuarios();
    public boolean eliminar(Usuario usuario);
    public boolean modificar(Usuario usuario);
}
