package ar.edu.unlam.dominio;

public class Coche {

	private String color;
	private int distanciaRecorrida;

	public void avanza() {
		this.distanciaRecorrida++;
	}

	public int decirDistanciaRecorrida() {
		return this.distanciaRecorrida;
	}

	public String decirColor() {
		return color;
	}

	public Coche(String color) {
		distanciaRecorrida = 0;
		this.color = color;
	}

	/*
	 * public void pintarAuto(String color) { this.color = "amarillo"; }
	 */

}
