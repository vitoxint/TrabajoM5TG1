package com.example.trabajom5tg1.dao;

import com.example.trabajom5tg1.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private List<Usuario> usuarios;

    public UsuarioDAO() {
        usuarios = new ArrayList<>();
        // Agregar algunos usuarios de ejemplo (esto simularía la carga inicial desde la base de datos)
        usuarios.add(new Usuario("Ejemplo1", 25, "ejemplo1@gmail.com", "ejemplo1user", "ejemplo1pass"));
        usuarios.add(new Usuario("Ejemplo2", 30, "ejemplo2@gmail.com", "ejemplo2user", "ejemplo2pass"));
    }

    // Método para guardar un nuevo usuario en la lista (simulando la inserción en la base de datos)
    public void insertarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

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
