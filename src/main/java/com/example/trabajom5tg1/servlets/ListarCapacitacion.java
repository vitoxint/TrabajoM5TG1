package com.example.trabajom5tg1.servlets;

import com.example.trabajom5tg1.models.Capacitacion;
import com.example.trabajom5tg1.models.Contenedor;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import java.sql.*;

/**
 * Servlet implementation class ListarCapacitacion
 */

@WebServlet(name="listarCapacitacion" , value="/listar-capacitacion")
public class ListarCapacitacion extends HttpServlet{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        HttpSession session = request.getSession();
        Contenedor ct = new Contenedor();
        Capacitacion c1 = new Capacitacion(1,  "77.589.654-8", "Jueves", "20:00",  "Hotel Ché Ratón", "03:00", 80);
        Capacitacion c2 = new Capacitacion(2,  "87.659-897-9", "Martes", "16:00",  "GAM", "02:00", 70);

        ct.almacenarCapacitacion(c1);
        ct.almacenarCapacitacion(c2);

        session.setAttribute("lista" , ct.getListCapacitaciones());

        request.setAttribute("seccion","capacitacion" );
        request.setAttribute("lista" , ct.getListCapacitaciones( ) );
        getServletContext().getRequestDispatcher("/views/capacitacion_listar.jsp").forward(request , response);
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

        request.setAttribute("seccion","capacitacion" );
        request.setAttribute("respuesta", cap.mostrarDetalle() );
        RequestDispatcher rd = request.getRequestDispatcher("/views/capacitacion_crear.jsp" );
        rd.forward(request, response);



    }


}
