package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaDeTransporte {
    private ArrayList<Conexion> conexiones;
    private ArrayList<Bus> buses;
    private ArrayList<Ruta> rutas;
    private ArrayList<Pasajero> pasajeros;
    private ArrayList<Viaje> viajes;

    public SistemaDeTransporte (){

        conexiones=new ArrayList<Conexion>();
        buses=new ArrayList<Bus>();
        rutas=new ArrayList<Ruta>();
        pasajeros=new ArrayList<Pasajero>();
        viajes=new ArrayList<Viaje>();
    }

    public void agregarConexion(int numero, String origen, String destino){
        Conexion nuevaConexion=new Conexion(numero,origen,destino);
        conexiones.add(nuevaConexion);
    }
    public void agregarBus(int numero, int capacidad, String tipo){
        Bus nuevoBus=new Bus(numero,capacidad,tipo);
        buses.add(nuevoBus);
    }
    public void agregarRuta(int numero, Conexion conexion, int tiempoRecorrido, int horaSalida, int horaLlegada){
        Ruta nuevaRuta=new Ruta(numero,conexion,tiempoRecorrido,horaSalida,horaLlegada);
        rutas.add(nuevaRuta);
    }
    public void agregarPasajero(String nombre, int cedula){
        Pasajero nuevoPasajero=new Pasajero(nombre,cedula);
    }
    /**
     * Se crea un nuevo viaje y se agrega a la lista de viajes
     */
    public void agregarViaje(int numero, Pasajero pasajero, String estado, Ruta ruta,int valor,Bus bus, Silla silla) {
        Viaje nuevoViaje=new Viaje(numero,pasajero,estado,ruta,valor,bus,silla);
    }

    public void venderViaje(){


    }
    public void generarTicket(){

    }
}
