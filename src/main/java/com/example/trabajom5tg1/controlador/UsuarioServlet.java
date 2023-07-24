package com.example.trabajom5tg1.controlador;

import com.example.trabajom5tg1.dao.UsuarioDAO;
import com.example.trabajom5tg1.models.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void init() {
    }




    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String correo = request.getParameter("correo");
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena = request.getParameter("contraseña");

        Usuario usuario = new Usuario(nombre, edad, correo, nombreUsuario, contrasena);

        usuarioDAO.insertarUsuario(usuario);

        response.sendRedirect("registro_exitoso.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreUsuario = request.getParameter("nombreUsuario");

        Usuario usuario = usuarioDAO.obtenerUsuarioPorNombre(nombreUsuario);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (usuario != null) {
            out.println("<html><body>");
            out.println("<h1>Información del usuario:</h1>");
            out.println("<p>Nombre: " + usuario.getNombre() + "</p>");
            out.println("<p>Edad: " + usuario.getEdad() + "</p>");
            out.println("<p>Correo electrónico: " + usuario.getCorreoElectronico() + "</p>");
            out.println("<p>Nombre de usuario: " + usuario.getNombreUsuario() + "</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h1>Usuario no encontrado</h1>");
            out.println("</body></html>");
        }
    }
}
