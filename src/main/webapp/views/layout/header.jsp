<jsp:useBean id="seccion" scope="request" type="java.lang.String"   />
<%--
  Created by IntelliJ IDEA.
  User: vitox
  Date: 13-07-2023
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="container">

    <header>
        <nav class="navbar navbar-expand-lg bg-dark" data-bs-theme="dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">GRUPO 3</a>

                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link  ${(seccion == 'inicio') ? 'active' : 'none'}" aria-current="page" href="inicio">Inicio</a>
                        </li>
                        <% if (session.getAttribute("privileges") != null && session.getAttribute("privileges").equals("Cliente")) { %>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle  ${(seccion == 'capacitacion') ? 'active' : 'none'}" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Capacitación
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="listar-capacitacion">Listado Capacitación</a></li>
                                <li><a class="dropdown-item" href="crear-capacitacion">Crear Capacitación</a></li>
                            </ul>
                        </li>
                        <% } %>
                        <%-- Mostrar el menú Admin Usuarios solo si el usuario está autenticado y es Administrativo --%>

                        <% if (session.getAttribute("privileges") != null && session.getAttribute("privileges").equals("Administrativo")) { %>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle  ${(seccion == 'usuarios') ? 'active' : 'none'}" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Admin Usuarios
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="listar-usuario">Listado Usuarios</a></li>
                                <li><a class="dropdown-item" href="crear-usuario">Crear Usuario</a></li>
                                <li><a class="dropdown-item" href="editar-usuario">Editar Usuario</a></li>
                            </ul>
                        </li>
                        <% } %>

                        <% if (session.getAttribute("privileges") != null && session.getAttribute("privileges").equals("Administrativo")) { %>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle  ${(seccion == 'usuarios') ? 'active' : 'none'}" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Admin Pagos
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="crear-pagos">Crear Pago</a></li>
                                <li><a class="dropdown-item" href="listar-pagos">Listado Pagos</a></li>
                                <li><a class="dropdown-item" href="reporte-pagos">Reporte Pagos</a></li>
                            </ul>
                        </li>
                        <% } %>

                        <% if (session.getAttribute("privileges") != null && session.getAttribute("privileges").equals("Cliente")) { %>
                        <li class="nav-item">
                            <a class="nav-link ${(seccion == 'contacto') ? 'active' : 'none'}" href="contacto-servlet">Contacto</a>
                        </li>
                    </ul>
                    <% } %>

                    <% if (session.getAttribute("privileges") != null && session.getAttribute("privileges").equals("Profesional")) { %>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle  ${(seccion == 'usuarios') ? 'active' : 'none'}" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Asesorías
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="listar-asesorias">Crear Asesorías</a></li>
                            <li><a class="dropdown-item" href="crear-asesorias">Listado Asesorías</a></li>
                            <li><a class="dropdown-item" href="reporte-aseorias">Reportes</a></li>
                        </ul>
                    </li>
                    <% } %>

                    <% if (session.getAttribute("privileges") != null && session.getAttribute("privileges").equals("Profesional")) { %>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle  ${(seccion == 'usuarios') ? 'active' : 'none'}" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Visitas
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="crear-visitas">Crear Visitas</a></li>
                            <li><a class="dropdown-item" href="listar-visitas">Listado Visitas</a></li>
                            <li><a class="dropdown-item" href="reporte-visitas">Reporte Visitas</a></li>
                        </ul>
                    </li>
                    <% } %>

                    <ul class="navbar-nav ms-auto">
                        <!-- Resto de enlaces -->
                        <% if (session.getAttribute("loggedIn") != null && (Boolean) session.getAttribute("loggedIn")) { %>
                        <li class="nav-item">
                            <!--<a class="nav-link" methods="post"  href="${pageContext.request.contextPath}/cerrar-sesion">Cerrar Sesión</a>-->
                            <form id="GFG" action="${pageContext.request.contextPath}/cerrar-sesion" method="POST">
                                <button class="btn btn-danger btn-sm" type="submit">Salir</button>
                            </form>
                        </li>
                        <% } else { %>
                        <li class="nav-item">
                            <a class="nav-link ${(seccion == 'login') ? 'active' : 'none'}" href="iniciar-sesion">Iniciar Sesión</a>
                        </li>
                        <% } %>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
</div>
