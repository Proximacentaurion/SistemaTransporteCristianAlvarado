package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
@Service
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
        System.out.println("La conexión "+origen+"->"+destino+" ha sido creada.");
    }
    public void agregarBus(int numero, int capacidad, String tipo){
        Bus nuevoBus=new Bus(numero,capacidad,tipo);
        buses.add(nuevoBus);
        System.out.println("El bus tipo"+tipo+" con capacidad de "+capacidad+" pasajeros ha sido ingresado.");
    }
    public void agregarRuta(int numero, Conexion conexion, int tiempoRecorrido, int horaSalida, int horaLlegada){
        Ruta nuevaRuta=new Ruta(numero,conexion,tiempoRecorrido,horaSalida,horaLlegada);
        rutas.add(nuevaRuta);
        System.out.println("La ruta número "+numero+" de "+conexion.getOrigen()+" ha "+conexion.getDestino()+" con hora de salida "+horaSalida+":00 GMT ha sido creada");
    }
    public void agregarPasajero(String nombre, int cedula){
        Pasajero nuevoPasajero=new Pasajero(nombre,cedula);
        pasajeros.add(nuevoPasajero);
        System.out.println("El pasajero "+nombre+" ha sido creado.");
    }
    /**
     * Se crea un nuevo viaje y se agrega a la lista de viajes
     */
    public void agregarViaje(int numero, Pasajero pasajero, String estado, Ruta ruta,int valor,Bus bus, Silla silla) {
        Viaje nuevoViaje=new Viaje(numero,pasajero,estado,ruta,valor,bus,silla);
        viajes.add(nuevoViaje);
        System.out.println("El viaje número "+numero+" ha sido vendido por un valor de "+valor+" pesos\n"
        +"hora de salida "+ruta.getHoraSalida()+":00 GMT");
    }
    public Conexion getConexion(int numero){
        Conexion conexion=conexiones.get(numero);
        return conexion;
    }
    public Bus getBus(int numero){
        Bus bus=buses.get(numero);
        return bus;
    }
    public Ruta getRuta(int numero){
        Ruta ruta=rutas.get(numero);
        return ruta;
    }
    public Pasajero getPasajero(int numero){
        Pasajero pasajero=pasajeros.get(numero);
        return pasajero;
    }
    public ArrayList<Conexion> getConexiones() {
        return conexiones;
    }
    public void venderViaje(){
    }
    public void generarTicket(){

    }
}
