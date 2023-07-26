package com.example.trabajom5tg1.controlador;

import com.example.trabajom5tg1.dao.LoginDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("seccion","login" );
        getServletContext().getRequestDispatcher("/views/login.jsp").forward(request , response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        if(LoginDAO.validarUsuario(usuario, contrasena)){
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);
            sesion.setAttribute("loggedIn", true);
            sesion.setAttribute("privileges", LoginDAO.tipoUsuario(usuario));
            response.sendRedirect(request.getContextPath() + "/inicio");
        }else{
            request.setAttribute("error", "Usuario o contraseña incorrectos");
            doGet(request, response);
        }
    }
}