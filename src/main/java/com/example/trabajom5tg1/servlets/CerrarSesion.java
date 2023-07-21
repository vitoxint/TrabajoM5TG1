package com.example.trabajom5tg1.servlets;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "CerrarSesionServlet", value = "/cerrar-sesion")
public class CerrarSesion extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Verificar si el usuario "admin" está autenticado y, si es así, cerrar la sesión
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("loggedIn") != null ) {
            session.invalidate(); // Invalidar la sesión
        }
        response.sendRedirect( "inicio"); // Redirigir al inicio o a la página de login
    }
}



