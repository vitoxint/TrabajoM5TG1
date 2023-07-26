package com.example.trabajom5tg1.models;

public class Administrativo extends Usuario {

    private String area;
    private String experienciaPrevia;
    private int usuarioId;

    public Administrativo(){

    }
    public Administrativo(String nombre, String nombreUsuario, String contrasena , String tipoUsuario, String area, String experienciaPrevia) {
        super( nombre,  nombreUsuario,  contrasena , tipoUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     *
     * @return retornamos valor del campo área
     */
    public String getArea() {
        return this.area;
    }

    /**
     *
     * @param area asignamos valor al método Area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Obtiene la experiencia previa
     * @return Retorna la experiencia previa
     */
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    /**
     * Establece la experiencia previa
     * @param experienciaPrevia asignamos la experiencia previa a experienciaPrevia.
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    /**
     * Sobreescribe el método ´toString´ que viene por defecto.
     * @return texto con la información del usuario de tipo administrativo.
     */
    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                "} " + super.toString();
    }
    /**
     * Este método no retorna nada, pero imprime en pantalla los 2 parámetros propios de la la clase Administrativo.
     */


}
