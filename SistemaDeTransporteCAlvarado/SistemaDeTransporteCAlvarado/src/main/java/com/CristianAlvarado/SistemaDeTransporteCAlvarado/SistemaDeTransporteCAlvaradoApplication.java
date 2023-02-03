package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.CristianAlvarado.SistemaDeTransporteCAlvarado.Bus;
import com.CristianAlvarado.SistemaDeTransporteCAlvarado.Conexion;
import com.CristianAlvarado.SistemaDeTransporteCAlvarado.Pasajero;
import com.CristianAlvarado.SistemaDeTransporteCAlvarado.Ruta;
import com.CristianAlvarado.SistemaDeTransporteCAlvarado.Silla;
import com.CristianAlvarado.SistemaDeTransporteCAlvarado.SistemaDeTransporte;
import com.CristianAlvarado.SistemaDeTransporteCAlvarado.Ticket;
import com.CristianAlvarado.SistemaDeTransporteCAlvarado.Viaje;

import java.util.List;
import java.util.ArrayList;
@SpringBootApplication
public class SistemaDeTransporteCAlvaradoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SistemaDeTransporteCAlvaradoApplication.class, args);

		//@Autowired
		//public SistemaDeTransporte sistemaDeTransporte;
		SistemaDeTransporte sistemaDeTransporte = new SistemaDeTransporte();
		System.out.println("Aplicación para el control y gestión de los viajes y horarios");

		sistemaDeTransporte.agregarConexion(1, "Medellín", "Cúcuta");
		sistemaDeTransporte.agregarConexion(2, "Medellín", "Bogotá");
		sistemaDeTransporte.agregarConexion(3, "Medellín", "Cali");

		sistemaDeTransporte.agregarBus(1335, 45, "diamante");
		sistemaDeTransporte.agregarBus(0355, 36, "platino");

		Bus bus1 = sistemaDeTransporte.getBus(0);
		Bus bus2 = sistemaDeTransporte.getBus(1);

		Conexion conexion1 = sistemaDeTransporte.getConexion(0);
		Conexion conexion2 = sistemaDeTransporte.getConexion(1);
		Conexion conexion3 = sistemaDeTransporte.getConexion(2);

		sistemaDeTransporte.agregarRuta(1, conexion2, 12, 8, 20);
		sistemaDeTransporte.agregarRuta(2, conexion2, 12, 10, 22);
		sistemaDeTransporte.agregarRuta(3, conexion2, 12, 12, 24);

		Ruta ruta1 = sistemaDeTransporte.getRuta(1);

		sistemaDeTransporte.agregarPasajero("Juan Laverde", 129230923);
		Pasajero pasajero1 = sistemaDeTransporte.getPasajero(0);

		Silla silla1=new Silla(6,"vacía","Poltrona","pasillo");

		sistemaDeTransporte.agregarViaje(1,pasajero1,"vendido",ruta1,35000,bus1,silla1);
	}
}
