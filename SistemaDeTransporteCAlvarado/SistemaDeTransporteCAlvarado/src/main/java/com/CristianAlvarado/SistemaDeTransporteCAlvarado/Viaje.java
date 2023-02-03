package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

//el viaje es un servicio a una persona
public class Viaje {
    private int numero;
    private Pasajero pasajero;
    private String estado;
    private Ruta ruta;
    private int valor;
    //El estado del servicio puede ser iniciado y terminado, o vendido y terminado, o iniciado, en curso, terminado. Cancelado, retrazado, sin novedad.
    public Viaje(int numero, Pasajero pasajero, String estado, Ruta ruta,int valor){
        this.numero=numero;
        this.pasajero=pasajero;
        this.estado=estado;
        this.ruta=ruta;
        this.valor=valor;
    }
    public int darNumero(){
        return numero;
    }
    public Pasajero darPasajero(){
        return pasajero;
    }
    public String darEstado(){
        return estado;
    }
    public Ruta darRuta(){
        return ruta;
    }
    public int darValor(){
        return valor;
    }

}
