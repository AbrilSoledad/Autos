package ar.edu.unlam.dominio;

public class Auto {

	private int antiguedad;
	private static int precio = 100000; // precio base

	public Auto(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	// se hace un descuento del 10% segun la antiguedad

	public int obtenerPrecioSegunAntiguedad() {

		return precio - precio * antiguedad * 10 / 100;
	}

	public int getPrecio() {
		return precio;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public static void setPrecio(int precio) {
		Auto.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto [antiguedad=" + antiguedad + "]";
	}

}
