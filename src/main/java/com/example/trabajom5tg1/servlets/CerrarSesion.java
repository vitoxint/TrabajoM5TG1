package com.example.trabajom5tg1.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "CerrarSesionServlet", value = "/cerrar-sesion")
public class CerrarSesion extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String contextPath = request.getServletContext().getContextPath();
        request.getSession().invalidate(); // Invalidar la sesión actual
        response.sendRedirect(contextPath + "/inicio"); // Redirigir al inicio
    }}