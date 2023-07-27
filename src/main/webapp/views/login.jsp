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
<div class="container">
    <h1 class="mb-4">Iniciar Sesión</h1>
    <form action="login" method="post">
        <div class="input-group mb-3">
            <label class="input-group-text" for="usuario" id="username_label">Usuario</label>
            <input type="text" class="form-control" aria-describedby="username_label" id="usuario" name="usuario">
        </div>
        <div class="input-group mb-3">
            <label class="input-group-text" for="contrasena" id="password_label">Contraseña</label>
            <input type="password" class="form-control" aria-describedby="password_label" id="contrasena" name="contrasena">
        </div>
        ${error}
        <button type="submit" class="btn btn-primary">Iniciar Sesión</button>
    </form>
</div>
<!-- importa Bootstrap -->
<script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
        crossorigin="anonymous"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/alertaErrorLogin.js"></script>

</body>
</html>
