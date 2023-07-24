package com.example.trabajom5tg1.controlador;

import com.example.trabajom5tg1.dao.CapacitacionDAOImp;
import com.example.trabajom5tg1.dao.UsuarioDAO;
import com.example.trabajom5tg1.models.Capacitacion;
import com.example.trabajom5tg1.models.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ListarCapacitacion
 */

@WebServlet(name="listarUsuario" , value="/listar-usuario")
public class ListarUsuario extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        HttpSession session = request.getSession();

        if ( session.getAttribute("loggedIn") == null ) {

            response.sendRedirect("iniciar-sesion");

        }else {

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            PrintWriter out = response.getWriter();


            List<Usuario> listado = usuarioDAO.listarUsuarios();
            if(!listado.isEmpty()){
                out.println("Usuarios listados");
                request.setAttribute("listaUsuario",listado);

            }else{
                request.setAttribute("listaUsuario",new ArrayList<Usuario>());
            }

            request.setAttribute("seccion", "usuarios");

            getServletContext().getRequestDispatcher("/views/usuario_listar.jsp").forward(request, response);

        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub


    }


}

