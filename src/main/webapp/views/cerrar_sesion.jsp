<%--
  Created by IntelliJ IDEA.
  User: Joaquin
  Date: 19/7/2023
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cerrar Sesión</title>
    <!-- Enlaces a estilos CSS y otros recursos -->
</head>
<body>
<!-- Contenido de la página -->
<div class="container">
    <header>
        <nav class="navbar navbar-expand-lg bg-dark" data-bs-theme="dark">
            <!-- El código de la barra de navegación (header) que ya tienes -->
        </nav>
    </header>
</div>
<div class="container mt-4">
    <h1>Cerrar Sesión</h1>
    <p>¿Está seguro de que desea cerrar la sesión?</p>
    <form action="${pageContext.request.contextPath}/cerrar-sesion" method="post">
        <button type="submit" class="btn btn-primary">Cerrar Sesión</button>
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
</body>
</html>
