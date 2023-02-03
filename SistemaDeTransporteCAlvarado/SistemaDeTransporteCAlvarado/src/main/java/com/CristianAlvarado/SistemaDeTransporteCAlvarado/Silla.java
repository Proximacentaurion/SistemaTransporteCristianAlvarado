package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

public class Silla {
    private int numero;
    private String estado;
    private String tipo;
    private String ubicacion;

    public Silla (int numero, String estado, String tipo, String ubicacion){
        this.numero=numero;
        this.estado=estado;
        this.tipo=tipo;
        this.ubicacion=ubicacion;
    }

    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
