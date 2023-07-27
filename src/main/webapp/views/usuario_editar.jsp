<%@ page import="com.example.trabajom5tg1.models.Usuario" %>
<%@ page import="com.example.trabajom5tg1.models.Cliente" %>
<%@ page import="com.example.trabajom5tg1.models.Profesional" %>
<%@ page import="com.example.trabajom5tg1.models.Administrativo" %><%--
  Created by IntelliJ IDEA.
  User: Joaquin
  Date: 22/7/2023
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Editar Usuario</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

</head>
<body>

<%@include file="/views/layout/header.jsp" %>

<div class="container">

    <div class="container">

        <br/>
        <h4>Editar usuario</h4>
        <br/>

        <%

            Usuario usuario = (Usuario) request.getAttribute("usuario");


                    Cliente cliente = (Cliente) request.getAttribute("cliente");

                    Profesional profesional = (Profesional) request.getAttribute("profesional");

                    Administrativo administrativo = (Administrativo) request.getAttribute("administrativo");



        %>

        <form action="editar-usuario" id="formulario" class="needs-validation" method="post">
            <div class="row">
                <div class="mb-3 col-12 col-md-4">
                    <label for="nombre" class="form-label">Nombre</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" value="<%= usuario.getNombre() %>" required>
                </div>
            </div>
            <input type="number" hidden="true" name="id" value="<%= usuario.getId() %>"/>

            <div class="row">

                <div class="mb-3 col-12 col-md-4">
                    <label for="nombreUsuario" class="form-label">Nombre de Usuario (inicio sesión):</label>
                    <input type="text" class="form-control" id="nombreUsuario"  name="nombreUsuario" value="<%= usuario.getNombreUsuario() %>" readonly="readonly" required>
                </div>
            </div>
            <div class="row">
                <div class="mb-3 col-12 col-md-4">
                    <label for="contrasena" class="form-label">Contraseña:</label>
                    <input type="password" class="form-control" id="contrasena" name="contrasena" value="<%= usuario.getContrasena() %>" required>
                </div>
                <div class="mb-3 col-12 col-md-4">

                    <label for="tipo" class="form-label">Tipo de usuario:</label>
                    <!--<select class="form-control" id="tipo" name="tipo" readonly="readonly" required>
                        <option value="Cliente" <%if(usuario.getTipoUsuario().equals("Cliente")){%> selected <%}%>>Cliente</option>
                        <option value="Profesional" <%if(usuario.getTipoUsuario().equals("Profesional")){%> selected <%}%>>Profesional</option>
                        <option value="Administrativo" <%if(usuario.getTipoUsuario().equals("Administrativo")){%> selected <%}%>>Administrativo</option>
                    </select>-->
                    <input type="text" class="form-control" id="tipo" name="tipo" value="<%= usuario.getTipoUsuario() %>" readonly="readonly" required>
                </div>
            </div>

            <% if( usuario.getTipoUsuario().equals("Cliente")){ %>
            <div id="form-cliente" style="display:block">
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="rut" class="form-label">RUT Cliente</label>
                        <input type="text" class="form-control" id="rut" value="<%= cliente.getRut() %>" name="rut" >
                        <div class="invalid-feedback">Ingrese un RUT válido con formato 12.345.678-9</div>
                    </div>
                    <div class="mb-3 col-12 col-md-4">
                        <label for="edad" class="form-label">Edad</label>
                        <input type="number" class="form-control" id="edad" value="<%= cliente.getEdad() %>"  name="edad">

                    </div>
                </div>
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="nombres" class="form-label">Nombres</label>
                        <input type="text" class="form-control" id="nombres" value="<%= cliente.getNombres() %>"  name="nombres">
                    </div>
                    <div class="mb-3 col-12 col-md-4">
                        <label for="apellidos" class="form-label">Apellidos</label>
                        <input type="text" class="form-control" id="apellidos" value="<%= cliente.getApellidos() %>"  name="apellidos">
                    </div>
                </div>
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="direccion" class="form-label">Dirección</label>
                        <input type="text" class="form-control" id="direccion" value="<%= cliente.getApellidos() %>"  name="direccion">
                    </div>
                    <div class="mb-3 col-12 col-md-4">
                        <label for="comuna" class="form-label">Comuna</label>
                        <input type="text" class="form-control" id="comuna" value="<%= cliente.getComuna() %>"  name="comuna">
                    </div>
                </div>
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="telefono" class="form-label">Teléfono</label>
                        <input type="text" class="form-control" id="telefono" value="<%= cliente.getTelefono() %>"  name="telefono">
                    </div>
                </div>
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="afp" class="form-label">AFP</label>
                        <input type="text" class="form-control" id="afp" value="<%= cliente.getAfp() %>"  name="afp">
                    </div>
                    <div class="mb-3 col-12 col-md-4">
                        <label for="sistemaSalud" class="form-label">Sistema salud</label>
                        <select class="form-control" id="sistemaSalud"  name="sistemaSalud">
                            <option value="1" <%if(cliente.getSistemaSalud() == 1){%> selected <%}%>>FONASA</option>
                            <option value="2" <%if(cliente.getSistemaSalud() == 2){%> selected <%}%>>ISAPRE</option>

                        </select>
                    </div>
                </div>
            </div>

            <% } %>

            <% if( usuario.getTipoUsuario().equals("Profesional")){ %>
            <div id="form-profesional" style="display:block">
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="titulo" class="form-label">Título</label>
                        <input type="text" class="form-control" id="titulo" value="<%= profesional.getTitulo() %>" name="titulo">
                    </div>
                </div>
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="fechaIngreso" class="form-label">Fecha Ingreso</label>
                        <input type="date" class="form-control" id="fechaIngreso" value="<%= profesional.getFechaIngreso() %>"  name="fechaIngreso">
                    </div>
                </div>
            </div>
            <% } %>

            <% if( usuario.getTipoUsuario().equals("Administrativo")){ %>
            <div id="form-administrativo" style="display:block">
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="area" class="form-label">Área</label>
                        <input type="text" class="form-control" id="area" value="<%= administrativo.getArea() %>"  name="area">
                    </div>
                </div>
                <div class="row">
                    <div class="mb-3 col-12 col-md-4">
                        <label for="experienciaPrevia" class="form-label">Experiencia Previa</label>
                        <input type="text" class="form-control" id="experienciaPrevia" value="<%= administrativo.getExperienciaPrevia() %>"  name="experienciaPrevia">
                    </div>
                </div>
            </div>
            <% } %>

            <button type="submit" id="submit" class="btn btn-primary btn-sm">Actualizar</button>
        </form>

        <br/>

        <p> ${ respuesta } </p>

        <br/><br/><br/>

    </div>






</div>

<%@include file="/views/layout/footer.jsp" %>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
        crossorigin="anonymous"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.js"></script>
<!--<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/validaRUT.js"></script>-->

</body>

</html>


