package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

public class Conexion {
    private int numero;
    private String origen;
    private String destino;

    public Conexion(int numero, String origen, String destino){
        this.numero=numero;
        this.origen=origen;
        this.destino=destino;
    }

    public int getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
}
