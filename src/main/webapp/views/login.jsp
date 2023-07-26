<%--
  Created by IntelliJ IDEA.
  User: hecko
  Date: 25-07-2023
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Iniciar Sesión</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https//cdn.datatables.net/1.13.5/css/jquery.dataTables.min.css">

    <style>
        /* Personaliza el contenedor del formulario para centrarlo verticalmente */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            width: 400px;
        }
    </style>
</head>
<body>
    <form action="login" method="post">
        <input type="text" name="usuario" placeholder="username">
        <input type="password" name="contrasena" placeholder="password">
        <input type="submit" value="login">
    </form>

</body>
</html>
