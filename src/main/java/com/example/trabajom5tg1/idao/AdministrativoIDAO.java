package com.example.trabajom5tg1.idao;

import com.example.trabajom5tg1.models.Administrativo;
import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Usuario;

import java.util.List;

public interface AdministrativoIDAO {

    public boolean registrar(Administrativo usuario);
    public List<Usuario> listarUsuarios();
    public boolean eliminar(Usuario usuario);
    public boolean modificar(Administrativo usuario);
    public Administrativo editar( Usuario usuario );

}
