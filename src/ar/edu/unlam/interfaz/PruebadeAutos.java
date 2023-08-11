package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Autos;

import java.util.Scanner;

public class PruebadeAutos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Autos auto1 = new Autos("Lamborghini", "murcielago", 30000, 100000, 200.0, 15.0);
		Autos auto2 = new Autos("Ferrari", "roma", 60000, 200000, 350.0, 40.0);

		System.out.println("La cantidad actual de autos es: " + Autos.getCantidadCoches());

		antiguedadAuto1(teclado, auto1);
		System.out.println("Marca: " + auto1.getMarca() + " y Modelo: " + auto1.getModelo());
		System.out.println("Km actuales " + auto1.getKilometrosActuales() + " y Precio: " + auto1.getPrecio());

		System.out.println("");

		antiguedadAuto2(teclado, auto2);
		System.out.println("Marca: " + auto2.getMarca() + " y Modelo: " + auto2.getModelo());
		System.out.println("Km actuales " + auto2.getKilometrosActuales() + " y Precio: " + auto2.getPrecio());

		auto1.alcanzarVelocidadMaxima();
		auto2.alcanzarVelocidadMaxima();

	}

	private static void antiguedadAuto2(Scanner teclado, Autos auto2) {
		int fabricacion;
		System.out.println("Inserte el anio de fabricacion del auto2: ");
		fabricacion = teclado.nextInt();
		auto2.setAnioDeFabricacion(fabricacion);
		System.out.println("El anio de fabricacion del primer auto es " + auto2.getAnioDeFabricacion());
		System.out.println("Su antiguedad es de " + auto2.calcularAntiguedad() + " anios");
	}

	private static void antiguedadAuto1(Scanner teclado, Autos auto1) {
		int fabricacion;
		System.out.println("Inserte el anio de fabricacion del auto1: ");
		fabricacion = teclado.nextInt();
		auto1.setAnioDeFabricacion(fabricacion);
		System.out.println("El anio de fabricacion del primer auto es " + auto1.getAnioDeFabricacion());
		System.out.println("Su antiguedad es de " + auto1.calcularAntiguedad() + " anios");
	}
}
