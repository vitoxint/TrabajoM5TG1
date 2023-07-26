package com.example.trabajom5tg1.idao;

import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Usuario;

import java.util.List;

public interface ClienteIDAO {
    public boolean registrar(Cliente usuario);
    public List<Usuario> listarUsuarios();
    public boolean eliminar(Usuario usuario);
    public boolean modificar(Usuario usuario);
    public Cliente editar( Usuario usuario );
}
