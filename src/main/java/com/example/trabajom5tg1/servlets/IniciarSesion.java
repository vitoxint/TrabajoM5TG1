package com.example.trabajom5tg1.servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "IniciarSesion", value = "/iniciar-sesion")
public class IniciarSesion extends HttpServlet {

    public IniciarSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("seccion","login" );
        getServletContext().getRequestDispatcher("/views/iniciar_sesion.jsp").forward(request , response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("1234")) {
            request.getSession().setAttribute("user", username);
            request.getSession().setAttribute("loggedIn", true); // Bandera para indicar que el usuario ha iniciado sesión
            response.sendRedirect(request.getContextPath() + "/contacto-servlet");

        } else {

    //request.setAttribute("error", "Usuario y/o clave equivocada");
            request.setAttribute("error", "<div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\" id=\"error\" style=\"display: none;\">\n" +
                    "      <p id=\"message\">" + username + " tu usuario y/o contraseña son incorrectas , intente nuevamente. " +   "</p>\n" +
                    "      <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n" +
                    "    </div>" );
            response.sendRedirect("/iniciar-sesion");
        }

    }
}




