package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Auto;

public class AutoAntiguedad {

	public static void main(String[] args) {

		int antiguedad = 1;
		Auto autoUno = new Auto(antiguedad);

		int cuantoValeAutoUno = autoUno.obtenerPrecioSegunAntiguedad();

		System.out.println("El precio base del auto uno es " + autoUno.getPrecio());

		System.out.println("La antiguedad del auto uno es de " + autoUno.getAntiguedad() + " anio/s");

		System.out.println("El auto uno vale " + cuantoValeAutoUno);

		System.out.println("");

		Auto autoDos = new Auto(2);

		int cuantoValeAutoDos = autoDos.obtenerPrecioSegunAntiguedad();

		System.out.println("El precio base del auto dos es " + autoDos.getPrecio());

		System.out.println("La antiguedad del auto dos es de " + autoDos.getAntiguedad() + " anio/s");

		System.out.println("El auto dos vale: " + cuantoValeAutoDos);

		System.out.println(autoDos.toString());

		autoUno.toString();

	}
}
