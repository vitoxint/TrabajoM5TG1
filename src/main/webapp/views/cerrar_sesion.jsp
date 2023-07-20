<%--
  Created by IntelliJ IDEA.
  User: Joaquin
  Date: 19/7/2023
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Cerrar Sesión</title>
</head>
<body>
<h1>¡Bienvenido! Haz clic en el botón para cerrar sesión.</h1>
<form id="logoutForm" action="cerrar-sesion" method="post">
    <input type="submit" value="Cerrar Sesión">
</form>

<script>
    document.getElementById("logoutForm").addEventListener("submit", function (event) {
        event.preventDefault(); // Evitar el envío del formulario por defecto
        // Enviar la solicitud POST usando JavaScript
        fetch(event.target.action, {
            method: "POST",
            credentials: "same-origin" // Para incluir las cookies de sesión en la solicitud
        }).then(function (response) {
            if (response.ok) {
                // Redirigir al usuario al inicio o a la página de login después de cerrar sesión
                window.location.href = "/inicio"; // Reemplaza "/inicio" con la URL deseada
            } else {
                console.error("Error al cerrar sesión.");
            }
        }).catch(function (error) {
            console.error("Error al cerrar sesión:", error);
        });
    });
</script>
</body>
</html>
