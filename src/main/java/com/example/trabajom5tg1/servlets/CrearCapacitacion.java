package com.example.trabajom5tg1.servlets;

import com.example.trabajom5tg1.models.Contenedor;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        request.setAttribute("seccion","capacitacion" );
        getServletContext().getRequestDispatcher("/views/capacitacion_crear.jsp").forward(request , response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        int numCapacitacion = Integer.parseInt(request.getParameter("numCapacitacion")) ;
        String rutCliente = request.getParameter("rutCliente");
        String diaSemana = request.getParameter("diaSemana");
        String hora = request.getParameter("hora");
        String lugar = request.getParameter("lugar");
        String duracion = request.getParameter("duracion");
        int cantAsistentes = Integer.parseInt(request.getParameter("cantAsistentes"));


        Capacitacion cap = new Capacitacion( numCapacitacion,  rutCliente,  diaSemana,  hora,  lugar,  duracion,  cantAsistentes );

        HttpSession session = request.getSession();
        List<Capacitacion> capacitaciones = (ArrayList<Capacitacion>)session.getAttribute("listaCapacitacion");
        Contenedor ct = new Contenedor();

        for (Capacitacion c : capacitaciones
             ) {
            ct.almacenarCapacitacion(c);
        }
        ct.almacenarCapacitacion( cap );

        session.setAttribute("listaCapacitacion" , ct.getListCapacitaciones());
        response.sendRedirect("listar-capacitacion");

        //request.setAttribute("seccion","capacitacion" );
        //request.setAttribute("respuesta", cap.mostrarDetalle() );

        //RequestDispatcher rd = request.getRequestDispatcher("/views/capacitacion_crear.jsp" );
        //rd.forward(request, response);



    }

}
