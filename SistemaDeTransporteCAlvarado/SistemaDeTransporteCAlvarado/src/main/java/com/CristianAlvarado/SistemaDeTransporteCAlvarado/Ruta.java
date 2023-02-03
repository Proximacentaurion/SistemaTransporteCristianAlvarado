package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

public class Ruta {
    private int numero;
    private Conexion conexion;
    private int tiempoRecorrido;
    private int horaSalida;
    private int horaLlegada;
    public Ruta(int numero, Conexion conexion, int tiempoRecorrido, int horaSalida, int horaLlegada ){
        this.numero=numero;
        this.conexion=conexion;
        this.tiempoRecorrido=tiempoRecorrido;
        this.horaSalida=horaSalida;
        this.horaLlegada=horaLlegada;
    }

    public int getNumero() {
        return numero;
    }
    public Conexion getConexion() {
        return conexion;
    }
    public int getTiempoRecorrido() {
        return tiempoRecorrido;
    }
    public int getHoraSalida() {
        return horaSalida;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }
}
