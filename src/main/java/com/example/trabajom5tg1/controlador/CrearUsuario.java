package com.example.trabajom5tg1.controlador;

import com.example.trabajom5tg1.dao.*;
import com.example.trabajom5tg1.models.Administrativo;
import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Profesional;
import com.example.trabajom5tg1.models.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "crearUsuario", urlPatterns = {"/crear-usuario"})
public class CrearUsuario extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void init() {
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena  = request.getParameter("contrasena");
        String tipoUsuario =   request.getParameter("tipo");

        PrintWriter out = response.getWriter();

        switch( tipoUsuario ){
            case "Cliente" :
                String rut  = request.getParameter("rut");
                String nombres  = request.getParameter("nombres");
                String direccion  = request.getParameter("direccion");
                String apellidos  = request.getParameter("apellidos");
                int edad = Integer.parseInt(request.getParameter("edad"));
                String comuna  = request.getParameter("comuna");
                String telefono  = request.getParameter("telefono");
                String afp  = request.getParameter("afp");
                int sistemaSalud = Integer.parseInt(request.getParameter("sistemaSalud"));

                Cliente cliente = new Cliente( nombre, nombreUsuario, contrasena, tipoUsuario , rut, nombres,  apellidos, telefono,  afp,  sistemaSalud,  direccion,  comuna,  edad  );
                ClienteDAO clienteDAO = new ClienteDAO();
                if( usuarioDAO.registrar(cliente) && clienteDAO.registrar(cliente) ){

                    out.println("Usuario registrado");
                    response.sendRedirect("listar-usuario");
                }else{
                    out.println("Usuario no registrada");
                    response.sendRedirect("crear-usuario");

                }
                break;

            case "Profesional" :
                String titulo = request.getParameter("titulo");
                String fechaIngreso = request.getParameter("fechaIngreso");
                Profesional profesional = new Profesional( nombre, nombreUsuario, contrasena, tipoUsuario , titulo , fechaIngreso );
                ProfesionalDAO profesionalDAO = new ProfesionalDAO();
                if(usuarioDAO.registrar(profesional) && profesionalDAO.registrar(profesional)){
                    out.println("Usuario registrado");
                    response.sendRedirect("listar-usuario");
                }else{
                    out.println("Usuario no registrada");
                    response.sendRedirect("crear-usuario");

                }
                break;

            case "Administrativo" :

                String area = request.getParameter("area");
                String experienciaPrevia = request.getParameter("experienciaPrevia");
                Administrativo administrativo = new Administrativo( nombre, nombreUsuario, contrasena, tipoUsuario , area , experienciaPrevia );
                AdministrativoDAO administrativoDAO = new AdministrativoDAO();
                if(usuarioDAO.registrar(administrativo) && administrativoDAO.registrar(administrativo) ){
                    out.println("Usuario registrado");
                    response.sendRedirect("listar-usuario");
                }else{
                    out.println("Usuario no registrada");
                    response.sendRedirect("crear-usuario");

                }
                break;

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        if ( session.getAttribute("loggedIn") == null ) {

            response.sendRedirect("iniciar-sesion");

        }else {
            request.setAttribute("seccion", "usuarios");
            getServletContext().getRequestDispatcher("/views/usuario_crear.jsp").forward(request, response);
        }
        /*String nombreUsuario = request.getParameter("nombreUsuario");

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
        }*/
    }
}
