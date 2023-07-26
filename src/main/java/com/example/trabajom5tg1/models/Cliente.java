package com.example.trabajom5tg1.models;

    public class Cliente extends Usuario  {
        private String rut;
        private String nombres;
        private String apellidos;
        private String telefono;
        private String afp;
        private int sistemaSalud;
        private String direccion;
        private String comuna;
        private int edad;
        private int usuarioId;


        /**
         * Constructor del cliente con sus parámetros
         * @param nombre nombre del cliente
         * @param rut rut del cliente
         * @param nombres nombres del cliente
         * @param apellidos apellidos del cliente
         * @param telefono telefono del cliente
         * @param afp afp del cliente
         * @param sistemaSalud sistema de salud del cliente
         * @param direccion dirección del cliente
         * @param comuna comuna del cliente
         * @param edad edad del cliente
         */
        public Cliente(){

        }
        public Cliente(String nombre, String nombreUsuario, String contrasena , String tipoUsuario, String rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
            super(nombre, nombreUsuario, contrasena , tipoUsuario);
            this.rut = rut;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.telefono = telefono;
            this.afp = afp;
            this.sistemaSalud = sistemaSalud;
            this.direccion = direccion;
            this.comuna = comuna;
            this.edad = edad;
        }

        /**
         * Obtiene el rut del cliente menor a 99.999.999
         * @return retorna el rut del cliente
         */
        public String getRut() {
            return rut;
        }

        /**
         * Establece el RUT del cliente menor a 99.999.999
         * @param rut solicita el rut del cliente a asignar
         */
        public void setRut(String rut) {
            this.rut = rut;
        }
        /**
         * Obtiene los nombres del cliente obligatorio, mínimo 5 caracteres, máximo 30
         * @return retorna los nombres del cliente mínimo 5 caracteres, máximo 30
         */
        public String getNombres() {
            return nombres;
        }
        /**
         * Establece los nombres del cliente mínimo 5 caracteres, máximo 30
         * @param nombres solicita los nombres del cliente mínimo 5 caracteres, máximo 30
         */
        public void setNombres(String nombres) {
            this.nombres = nombres;
        }
        /**
         * Obtiene los apellidos del cliente obligatorio, mínimo 5 caracteres, máximo 30
         * @return retorna los apellidos del cliente mínimo 5 caracteres, máximo 30
         */
        public String getApellidos() {
            return apellidos;
        }
        /**
         * Establece los apellidos del cliente obligatorio, mínimo 5 caracteres, máximo 30
         * @param apellidos  solicita los apellidos del cliente mínimo 5 caracteres, máximo 30
         */
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }
        /**
         * Obtiene el Telefono del cliente obligatorio
         * @return retorna el Telefono del cliente
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Establece el número de Teléfono para cliente
         * @param telefono solicita el número de Teléfono a asignar en cliente
         */
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        /**
         * Obtiene la Afp del cliente, mínimo 4 caracteres, máximo 30
         * @return retorna la Afp del cliente, mínimo 4 caracteres, máximo 30
         */
        public String getAfp() {
            return afp;
        }
        /**
         * Establece la Afp del cliente , mínimo 4 caracteres, máximo 30
         * @param afp solicita la Afp del cliente, mínimo 4 caracteres, máximo 30
         */
        public void setAfp(String afp) {
            this.afp = afp;
        }
        /**
         * Obtiene el sistema de salud del cliente,1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos opciones
         * indicadas
         * @return retorna el sistema de salud del cliente, 1 (Fonasa) o 2 (Isapre)
         */
        public int getSistemaSalud() {
            return sistemaSalud;
        }
        /**
         * Establece el sistema de salud del cliente,1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos opciones
         * indicadas
         * @param sistemaSalud solicita el sistema de salud del cliente, dando como opciones: 1 (Fonasa) o 2 (Isapre)
         */
        public void setSistemaSalud(int sistemaSalud) {
            this.sistemaSalud = sistemaSalud;
        }
        /**
         * Obtiene la dirección del cliente , máximo 70 caracteres
         * @return retorna la dirección del cliente , máximo 70 caracteres
         */
        public String getDireccion() {
            return direccion;
        }
        /**
         * Establece la dirección del cliente , máximo 70 caracteres
         * @param direccion solicita la dirección a asignar para cliente, máximo 70 caracteres
         */
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
        /**
         * Obtiene la dirección del cliente, máximo 50 caracteres
         * @return retorna la comuna del cliente, máximo 50 caracteres
         */
        public String getComuna() {
            return comuna;
        }
        /**
         * Establece la comuna del cliente, máximo 50 caracteres
         * @param comuna solicita la comuna a asignar para cliente, máximo 50 caracteres
         */
        public void setComuna(String comuna) {
            this.comuna = comuna;
        }
        /**
         * Obtiene la edad del cliente, obligatorio, número mayor o igual a cero, y menor a 150
         * @return retorna la edad del cliente, número mayor o igual a cero, y menor a 150
         */
        public int getEdad() {
            return edad;
        }
        /**
         * Establece la edad del cliente, número mayor o igual a cero, y menor a 150
         * @param edad solicita la edad a asignar para cliente, número mayor o igual a cero, y menor a 150
         */
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getUsuarioId(){
            return this.usuarioId ;
        }

        /**
         * Devuelve en forma de cadena la información del cliente.
         * @return cadena que representa al cliente
         */
        @Override
        public String toString() {
            return super.toString() + "Modelos.Cliente{" +
                    "rut='" + rut + '\'' +
                    ", nombres='" + nombres + '\'' +
                    ", apellidos='" + apellidos + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", afp='" + afp + '\'' +
                    ", sistemaSalud=" + sistemaSalud +
                    ", direccion='" + direccion + '\'' +
                    ", comuna='" + comuna + '\'' +
                    ", edad=" + edad +
                    '}';
        }


        /**
         * Función que retorna los nombres y los apellidos del usuario en una linea de texto
         * @return nombres + apellidos del objeto
         */
        public String obtenerNombre(){
            return this.nombres + " " + this.getApellidos();
        }

        public void obtenerSistemaSalud(){
            System.out.println("Sistema de Salud: " + this.sistemaSalud);
        }

}
