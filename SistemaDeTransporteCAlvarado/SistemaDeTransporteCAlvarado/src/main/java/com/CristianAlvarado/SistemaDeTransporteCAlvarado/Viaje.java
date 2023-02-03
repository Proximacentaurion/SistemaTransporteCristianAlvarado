package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

//el viaje es un servicio a una persona
public class Viaje {
    private int numero;
    private Pasajero pasajero;
    private String estado;
    private Ruta ruta;
    private int valor;
    private Bus bus;
    private Silla silla;
    //El estado del servicio puede ser iniciado y terminado, o vendido y terminado, o iniciado, en curso, terminado. Cancelado, retrazado, sin novedad.
    public Viaje(int numero, Pasajero pasajero, String estado, Ruta ruta,int valor,Bus bus, Silla silla){
        this.numero=numero;
        this.pasajero=pasajero;
        this.estado=estado;
        this.ruta=ruta;
        this.valor=valor;
        this.bus=bus;
        this.silla=silla;
    }

    public int getNumero() {
        return numero;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public String getEstado() {
        return estado;
    }
    public Ruta getRuta() {
        return ruta;
    }
    public int getValor() {
        return valor;
    }
    public Bus getBus() {
        return bus;
    }
    public Silla getSilla() {
        return silla;
    }
}
