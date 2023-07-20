<%@ page import="com.example.trabajom5tg1.models.Capacitacion" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: heckomher
  Date: 17-07-2023
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Capacitaciones</title>
    <link href="https//cdn.datatables.net/1.13.5/css/jquery.dataTables.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>

<body>

    <%@include file="/views/layout/header.jsp" %>

    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>

    <div class="container">

        <h1>Lista de Capacitaciones</h1>

        <table id="capacitacion" class="table table-striped" style="width:100%">
            <thead>
            <tr>
                <th>N° Capacit.</th>
                <th>RUT Cliente</th>
                <th>Día de la semana</th>
                <th>Hora</th>
                <th>Duración</th>
                <th>Lugar</th>
                <th>Cant. Asistentes</th>
            </tr>
            </thead>
            <tbody>

                <%

                    List<Capacitacion> capacitaciones = (ArrayList<Capacitacion>)session.getAttribute("listaCapacitacion");

                    for(Capacitacion cap : capacitaciones)
                    {
                %>
                    <tr>
                        <td><%= cap.getNumCapacitacion()  %></td>
                        <td><%= cap.getRutCliente()%></td>
                        <td><%= cap.getDiaSemana()%></td>
                        <td><%= cap.getHora()%></td>
                        <td><%= cap.getDuracion()%></td>
                        <td><%= cap.getLugar()%></td>
                        <td><%= cap.getCantAsistentes()%></td>

                    </tr>

                <%
                    }

                %>

            </tbody>
        </table>


    </div>

        <%@include file="/views/layout/footer.jsp" %>
        <!-- importa Bootstrap -->
        <script
                src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
                integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
                integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
                crossorigin="anonymous"></script>
        <!-- Importa jquery-->
        <script
                src="https://code.jquery.com/jquery-3.7.0.min.js"
                integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
                crossorigin="anonymous"></script>
        <!-- Importa dataTables-->
        <script src="https://cdn.datatables.net/1.13.5/js/jquery.dataTables.min.js"></script>
</body>
</html>
