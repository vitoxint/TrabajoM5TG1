<%--
  Created by IntelliJ IDEA.
  User: heckomher
  Date: 17-07-2023
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Iniciar Sesión</title>
    <link href="https//cdn.datatables.net/1.13.5/css/jquery.dataTables.min.css">

</head>
<body>
<div class="container">
    <h1>Inicio de sesión</h1>
    <form action="login.do" method="post">
    <div class="form-group">
        <label for="username">Usuario</label>
        <input type="text" name="username" id="username">
    </div>
    <div class="form-group">
        <label for="password">Contraseña</label>
        <input type="password" name="password" id="password">
    </div>
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
<!-- Importa jquery-->
</body>
</html>
