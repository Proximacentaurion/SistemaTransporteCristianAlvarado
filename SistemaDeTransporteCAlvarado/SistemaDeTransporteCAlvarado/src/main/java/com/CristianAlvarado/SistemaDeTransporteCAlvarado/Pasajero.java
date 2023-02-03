package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

public class Pasajero {

    private String nombre;
    private int cedula;

    public Pasajero(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String darNombre() {
        return nombre;
    }
    public int darCedula() {
        return cedula;
    }
}