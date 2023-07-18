package com.example.trabajom5tg1.servlets;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public class IniciarSesion {
    @WebServlet(name = "IniciarSesion", value = "/iniciar-sesion")
    public class HelloServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");
        }
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("admin") && password.equals("1234")){
                request.getSession().setAttribute("user", username);
                response.sendRedirect("/inicio");
            } else {
                request.setAttribute("error", "Usuario y/o clave equivocada");
                response.sendRedirect("/iniciar-sesion");
            }

        }
    }



}
