package com.example.trabajom5tg1.controlador;

import com.example.trabajom5tg1.dao.CapacitacionDAOImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.example.trabajom5tg1.models.Capacitacion;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CrearCapacitacion
 */

@WebServlet(name="crearCapacitacion" , value="/crear-capacitacion")
public class CrearCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
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
            request.setAttribute("seccion", "capacitacion");
            getServletContext().getRequestDispatcher("/views/capacitacion_crear.jsp").forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        String nombre = request.getParameter("nombre") ;
        String detalle = request.getParameter("detalle") ;
        String rutCliente = request.getParameter("rutCliente");
        String diaSemana = request.getParameter("diaSemana");
        String hora = request.getParameter("hora");
        String lugar = request.getParameter("lugar");
        String duracion = request.getParameter("duracion");
        int cantAsistentes = Integer.parseInt(request.getParameter("cantAsistentes"));


        Capacitacion cap = new Capacitacion( nombre , detalle,  rutCliente,  diaSemana,  hora,  lugar,  duracion,  cantAsistentes );


        /*HttpSession session = request.getSession();
        List<Capacitacion> capacitaciones = (ArrayList<Capacitacion>)session.getAttribute("listaCapacitacion");
        Contenedor ct = new Contenedor();

        for (Capacitacion c : capacitaciones
             ) {
            ct.almacenarCapacitacion(c);
        }
        ct.almacenarCapacitacion( cap );

        session.setAttribute("listaCapacitacion" , ct.getListCapacitaciones());*/

        CapacitacionDAOImp capacitacionDao = new CapacitacionDAOImp();

        PrintWriter out = response.getWriter();

        if(capacitacionDao.registrar(cap)){

            out.println("Capacitación registrada");
            response.sendRedirect("listar-capacitacion");
        }else{
            out.println("Capacitación no registrada");
            response.sendRedirect("crear-capacitacion");

        }



        //request.setAttribute("seccion","capacitacion" );
        //request.setAttribute("respuesta", cap.mostrarDetalle() );

        //RequestDispatcher rd = request.getRequestDispatcher("/views/capacitacion_crear.jsp" );
        //rd.forward(request, response);



    }

}
