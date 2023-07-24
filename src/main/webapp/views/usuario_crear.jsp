<%--
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
  <title>Crear Usuario</title>
</head>
<body>
<h1>Crear Usuario</h1>
<form action="UsuarioServlet" method="post">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required>
  <br>
  <label for="edad">Edad:</label>
  <input type="number" id="edad" name="edad" required>
  <br>
  <label for="correo">Correo Electrónico:</label>
  <input type="email" id="correo" name="correo" required>
  <br>
  <label for="nombreUsuario">Nombre de Usuario:</label>
  <input type="text" id="nombreUsuario" name="nombreUsuario" required>
  <br>
  <label for="contraseña">Contraseña:</label>
  <input type="password" id="contraseña" name="contraseña" required>
  <br>
  <input type="submit" value="Crear Usuario">
</form>
</body>
</html>
