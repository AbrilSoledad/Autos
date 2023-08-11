package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Coche;

public class CarreraDeCoches {

	public static void main(String[] args) {

		/*
		 * creo 2 autos (empiezan en 0) auto1 avanza 1 -- 1 auto1 avanza 1 -- 2 auto2
		 * avanza 1 -- 1 el ganador es el que recorrio mayor distancia 1 auto gana
		 */

		Coche coche1 = new Coche("rojo");

		Coche coche2 = new Coche("blanco");

		// aca avanzaron 1
		coche1.avanza();
		coche2.avanza();

		coche1.avanza();
		coche1.avanza();
		coche1.avanza();
		coche1.avanza();
		coche1.avanza();
		coche1.avanza();
		coche2.avanza();
		coche2.avanza();
		coche2.avanza();

		System.out.println("El coche1 es de color " + coche1.decirColor());
		System.out.println("El coche2 es de color " + coche2.decirColor());

		/*
		 * coche1.pintarAuto("amarillo"); System.out.println("El coche1 es de color " +
		 * coche1.decirColor());
		 */

		System.out.println("El coche1 avanzo " + coche1.decirDistanciaRecorrida());
		System.out.println("El coche2 avanzo " + coche2.decirDistanciaRecorrida());

		if (coche1.decirDistanciaRecorrida() > coche2.decirDistanciaRecorrida()) {
			System.out.println("gano el coche de color " + coche1.decirColor());
		} else {
			System.out.println("gano el coche de color" + coche2.decirColor());
		}

	}
}
