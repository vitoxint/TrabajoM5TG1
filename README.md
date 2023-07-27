### El siguiente archivo proporciona una descripción general de la página web utilizando JSP, Servlets, Conexiones a base de datos y Bootstrap 5.3.

### El proyecto se ha desarrollado utilizando el IDE IntelliJ y se han implementado comentarios para facilitar su comprensión y mantenimiento.

### Se ha creado una base de datos en SQL mediante un servidor remoto en la nube para el almacenamiento y registro de los datos solicitados por la página.

# **DESCRIPCIÓN DEL PROYECTO:**

El objetivo de esta página web es proporcionar un portal con diversas funcionalidades,
accesos y diferentes roles de usuario aplicando lo aprendido en el Módulo 5 y anteriores.

## **A continuación se describen las funcionalidades:**

### 1.- Login o Acceso de usuarios: 

Los usuarios puede iniciar sesión utilizando un nombre de usuario y contraseña.
Se admite el acceso para tres roles de usuario: Administativo, Cliente y Profesional.

### 2.- Página de Inicio del portal:

Una vez autenticado el usuario puede acceder a la página de inicio de portal.
La página de inicio ofrece diferentes opciones y enlaces dependiendo del rol de usuario.

### 3.- Formulario de Contacto:

Solo el usuario de tipo Cliente tiene acceso al formulario de Contacto para realizar consultas.
El formulario permite registrar datos de contacto.

### 4.- Formulario de Creación de Capacitaciones:

Solo el cliente tiene acceso al formulario para Crear Capacitación.
Se proporciona un listado de capacitaciones registradas.

### 5.- Formulario de Creación y Edición de Usuarios.

Solo el usuario de tipo Administrativo tiene acceso al formulario para crear y editar usuarios en el sistema.
Se ofrece un listado de los usuarios registrados.

### 6.- Formulario de Registro de Visitas a Clientes:

Solo el usuario de tipo Profesional puede acceder a un formulario para agregar y listar las visitas realizadas a cada cliente.
El formulario permite registrar las visitas realizadas a los clientes.

### 7.- Formulario de Creación y Edición de Pagos:

Solo el usuario de tipo Administrativo tiene acceso a un formulario para crear y editar pagos.
Se ofrece un listado de los pagos realizados.

### 8.- Formulario de Registro y Edición de Asistencia a Capacitaciones:

Solo el usuario Cliente puede acceder al formulario para registrar y editar los asistentes a una capacitación.
Se proporciona un listado de asistentes de acuerdo a la capacitación.

### 9.- Formulario de registro y Edición de Accidentes:

Solo el usuario Cliente tiene acceso al formulario para registrar y editar accidentes ocurridos.
Se proporciona un listado de los accidentes registrador junto con sus detalles.

# ////////////////////////////////////////////////////////////////////////

### ** SE DEBE CONTAR CON UN NAVEGADOR ACTUALIZADO PARA ACCEDER A LA PÁGINA Y SUS FUNCIONALIDADES**

### ** SE RECOMIENDA UTILIZAR INTELLIJ COMO IDE PARA FACILITAR LA EDICIÓN Y EJECUCIÓN DEL PROYECTO**

### ** PARA EFECTOS DEMOSTRATIVOS, SE HA CREADO UN USUARIO DE CADA TIPO PARA FACILITAR EL ACCESO A LAS FUNCIONALIDADES DE LA PÁGINA**

### ** LOS USUARIOS CREADOS SON LOS SIGUIENTES:**
### ** USUARIO ADMINISTRATIVO: admin 1234**
### ** USUARIO CLIENTE: danymun 123456**
### ** USUARIO PROFESIONAL: juanito 12345**

### ** CON FECHA 26-07-2023 SE ENCUENTRA VIGENTE UN SERVIDOR REMOTO CON LA BASE DE DATOS PARA EL ALMACENAMIENTO DE LOS DATOS DE PRUEBA**

# ////////////////////////////////////////////////////////////////////////

# **INSTRUCCIONES**

#### 1.- Clonar o descargar el proyecto desde el repositorio de GitHub.

#### 2.- Abrir el proyecto en IntelliJ y asegurarse de tener instalado un servidor web local para probar la aplicación, en este caso utilizamos Tomcat en su versión 10.1.8.

#### 3.- Ejecutar el servidor local y acceder al proyecto desde el navegador utilizando la URL proporcionada por el servidor.

#### 4.- En la página de inicio del portal, se mostrarán las opciones y enlaces correspondientes según el rol de usuario con el que se haya iniciado sesión.

#### 5.- Navegar y probar las diferentes funcionalidades de la página y asegurarse de probar las restricciones de acceso según los privilegios de cada usuario.

#### 6.- Aunque el proyecto se encuentra conectado a un servidor remoto en la nube, se recomienda descargar el archivo prevencion_riesgos.sql y ejecutarlo en un servidor de base de datos local para evitar problemas de conexión.

#### 8.- Una vez creada la base de datos, se debe modificar el archivo Connexion.java ubicado en la carpeta src/main/java/com/example/trabajom5tg1/conexion/ y modificar los datos de conexión a la base de datos de acuerdo a los datos de conexión de su servidor local.

# ////////////////////////////////////////////////////////////////////////

# **AUTORES:**

### Victor Rivas.

### Héctor Komori.

### Alan Vera.

### Joaquín De la Huerta.

# ////////////////////////////////////////////////////////////////////////

# _¡Gracias por utilizar nuestra página web! Si tienes alguna pregunta o problema,no dudes en contactarnos.¡Esperamos que disfrutes de la experiencia!_