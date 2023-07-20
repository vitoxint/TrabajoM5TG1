<%--
  Created by IntelliJ IDEA.
  User: heckomher
  Date: 17-07-2023
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>

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
<div class="container">
    <h1 class="mb-4" >Inicio de sesión</h1>
    <form action="iniciar-sesion" method="post">
    <div class="input-group mb-3">
        <label class="input-group-text" for="username" id="username_label">Usuario</label>
        <input type="text" class="form-control" aria-describedby="username_label" name="username" id="username">

    </div>
    <div class="input-group mb-3">
        <label class="input-group-text" id="password_label" for="password">Contraseña</label>
        <input class="form-control" aria-describedby="password_label" type="password" name="password" id="password">
    </div>
        ${ error }
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
