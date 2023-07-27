package com.example.trabajom5tg1.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ContactoServlet
 */
@WebServlet(name="contactoServlet" , value="/contacto-servlet")
public class ContactoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession();

        if ( session.getAttribute("loggedIn") == null ) {

            response.sendRedirect("iniciar-sesion");
        }else{
            request.setAttribute("seccion","contacto" );
            getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request , response);
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String nombre = request.getParameter("nombre");
        request.setAttribute("respuesta", "<div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\" id=\"envio_exitoso\" style=\"display: none;\">\n" +
                        "      <p id=\"message\">" + nombre + " tu formulario ya ha sido enviado , nos contactaremos a la brevedad" +   "</p>\n" +
                        "      <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\n" +
                        "    </div>" );
        //response.getWriter().write(");
        PrintWriter out = response.getWriter();
        out.println("Información del contacto :" );
        out.println("Nombre : " + nombre  );
        out.println("Correo :" + request.getParameter("email") );
        out.println("Detalle : " + request.getParameter("detalle") );


        RequestDispatcher rd = request.getRequestDispatcher("/views/contacto.jsp" );
        rd.forward(request, response);
    }

}
