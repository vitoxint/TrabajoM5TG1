package com.example.trabajom5tg1.models;



public class Capacitacion {
    private int numCapacitacion;
    private String rutCliente;
    private String diaSemana;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int numCapacitacion, String rutCliente, String diaSemana, String hora, String lugar, String duracion, int cantAsistentes) {
        this.numCapacitacion = numCapacitacion;
        this.rutCliente = rutCliente;
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }

    public int getNumCapacitacion() {
        return this.numCapacitacion;
    }

    public void setNumCapacitacion(int numCapacitacion) {
        this.numCapacitacion = numCapacitacion;
    }

    public String getRutCliente() {
        return this.rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaSemana() {
        return this.diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantAsistentes() {
        return this.cantAsistentes;
    }

    public void setCantAsistentes(int cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }

    public String mostrarDetalle() {
        return "La capacitaci\u00f3n ser\u00e1 en " + this.lugar + " a las " + this.hora + " del d\u00eda " + this.diaSemana + ", y durar\u00e1 " + this.duracion + " minutos";
    }

    public String toString() {
        return "Capacitaci\u00f3n: N\u00famero de capacitaci\u00f3n=" + this.numCapacitacion + ", RUT Cliente= " + this.rutCliente + '\'' + ", D\u00eda de la Semana= " + this.diaSemana + '\'' + ", M\u00e1ximo Asistentes= " + this.cantAsistentes + "\n" + this.mostrarDetalle();
    }
}


