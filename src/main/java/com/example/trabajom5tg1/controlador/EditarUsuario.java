package com.example.trabajom5tg1.controlador;

import com.example.trabajom5tg1.dao.AdministrativoDAO;
import com.example.trabajom5tg1.dao.ClienteDAO;
import com.example.trabajom5tg1.dao.ProfesionalDAO;
import com.example.trabajom5tg1.dao.UsuarioDAO;
import com.example.trabajom5tg1.models.Administrativo;
import com.example.trabajom5tg1.models.Cliente;
import com.example.trabajom5tg1.models.Profesional;
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
 * Servlet implementation class ListarUsuario
 */

@WebServlet(name="editarUsuario" , value="/editar-usuario")
public class EditarUsuario extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarUsuario() {
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
            request.setAttribute("seccion", "usuarios");

            int id;
            id = Integer.parseInt(request.getParameter("id"));

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            ClienteDAO clienteDAO = new ClienteDAO();
            ProfesionalDAO profesionalDAO = new ProfesionalDAO();
            AdministrativoDAO administrativoDAO = new AdministrativoDAO();

            Usuario usuario = usuarioDAO.editar(id);

            if( usuario.getTipoUsuario().equals("Cliente")){
                Cliente cliente = clienteDAO.editar(usuario);

                request.setAttribute("tipo" , cliente.getTipoUsuario());
                request.setAttribute("usuario", usuario);
                request.setAttribute("cliente", cliente);
                getServletContext().getRequestDispatcher("/views/usuario_editar.jsp").forward(request, response);
            }
            if( usuario.getTipoUsuario().equals("Profesional")){
                Profesional profesional = profesionalDAO.editar(usuario);

                request.setAttribute("tipo" , profesional.getTipoUsuario());
                request.setAttribute("usuario", usuario);
                request.setAttribute("profesional", profesional);
                getServletContext().getRequestDispatcher("/views/usuario_editar.jsp").forward(request, response);
            }
            if( usuario.getTipoUsuario().equals("Administrativo")){
               Administrativo administrativo = administrativoDAO.editar(usuario);

                request.setAttribute("tipo" , administrativo.getTipoUsuario());
                request.setAttribute("usuario", usuario);
                request.setAttribute("administrativo", administrativo);
                getServletContext().getRequestDispatcher("/views/usuario_editar.jsp").forward(request, response);
            }


            if( usuario != null ){
                request.setAttribute("usuario", usuario);
                getServletContext().getRequestDispatcher("/views/usuario_editar.jsp").forward(request, response);
            }
            response.sendRedirect("listar-usuario");

        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub


    }


}

