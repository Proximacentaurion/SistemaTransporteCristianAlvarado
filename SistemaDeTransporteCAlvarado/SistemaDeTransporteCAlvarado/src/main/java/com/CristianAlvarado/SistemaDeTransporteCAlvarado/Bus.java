package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

public class Bus {
    private int numero;
    private int capacidad;
    private String tipo;

    public Bus(int numero, int capacidad, String tipo ){
        this.numero=numero;
        this.capacidad=capacidad;
        this.tipo=tipo;
    }
    public int darNumero(){
        return numero;
    }
    public int darCapacidad(){
        return capacidad;
    }
    public String darTipo(){
        return tipo;
    }

}
