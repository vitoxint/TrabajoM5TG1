package com.example.trabajom5tg1.idao;
import com.example.trabajom5tg1.models.Capacitacion;
import com.example.trabajom5tg1.models.Usuario;

import java.util.List;

public interface UsuarioIDAO {
    public boolean registrar(Usuario usuario);
    public List<Usuario> listarUsuarios();
    public boolean eliminar(Usuario usuario);
    public boolean modificar(Usuario usuario);


}
