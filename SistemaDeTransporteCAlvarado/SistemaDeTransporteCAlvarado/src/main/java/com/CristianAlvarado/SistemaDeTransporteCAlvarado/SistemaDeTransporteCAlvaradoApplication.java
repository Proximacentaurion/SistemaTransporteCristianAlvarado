package com.CristianAlvarado.SistemaDeTransporteCAlvarado;

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

		SistemaDeTransporte sistemaDeTransporte = new SistemaDeTransporte();
		System.out.println("Aplicación para el control y gestión de los viajes y horarios");

		sistemaDeTransporte.agregarConexion(1, "Medellín", "Cúcuta");
		sistemaDeTransporte.agregarConexion(2, "Medellín", "Bogotá");
		sistemaDeTransporte.agregarConexion(3, "Medellín", "Cali");
	}
}
