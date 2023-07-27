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

    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
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

        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena  = request.getParameter("contrasena");
        String tipoUsuario =   request.getParameter("tipo");


        PrintWriter out = response.getWriter();
        out.println("Tipo" + tipoUsuario);

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
                cliente.setId(id);
                ClienteDAO clienteDAO = new ClienteDAO();
                if( /*usuarioDAO.modificar(cliente) &&*/ clienteDAO.modificar(cliente) ){

                    out.println("Usuario actualizado");
                    response.sendRedirect("listar-usuario");
                }else{
                    out.println("Usuario no actualizado");
                    response.sendRedirect("crear-usuario");

                }
                break;

            case "Profesional" :
                String titulo = request.getParameter("titulo");
                String fechaIngreso = request.getParameter("fechaIngreso");
                Profesional profesional = new Profesional( nombre, nombreUsuario, contrasena, tipoUsuario , titulo , fechaIngreso );
                ProfesionalDAO profesionalDAO = new ProfesionalDAO();
                if( profesionalDAO.modificar(profesional)){
                    out.println("Usuario actualizado");
                    response.sendRedirect("listar-usuario");
                }else{
                    out.println("Usuario no actualizado");
                    response.sendRedirect("crear-usuario");

                }
                break;

            case "Administrativo" :

                String area = request.getParameter("area");
                String experienciaPrevia = request.getParameter("experienciaPrevia");
                Administrativo administrativo = new Administrativo( nombre, nombreUsuario, contrasena, tipoUsuario , area , experienciaPrevia );
                AdministrativoDAO administrativoDAO = new AdministrativoDAO();
                if( administrativoDAO.modificar(administrativo) ){
                    out.println("Usuario actualizado");
                    response.sendRedirect("listar-usuario");
                }else{
                    out.println("Usuario no actualizado");
                    response.sendRedirect("crear-usuario");

                }
                break;

        }


    }


}

