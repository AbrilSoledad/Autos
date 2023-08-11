package ar.edu.unlam.dominio;

public class Autos {

	private static int ANO_ACTUAL = 2023;
	private static int cantidadCoches = 2;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private int precio;
	private double velocidadMaxima;
	private double aceleracion;
	private double velocidadActual;

	

	public Autos(String marca, String modelo, int kilometros, int precio, double velocidadMaxima, double aceleracion) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosActuales = kilometros;
		this.precio = precio;
		this.velocidadMaxima = velocidadMaxima;
		this.aceleracion = aceleracion;
		this.velocidadActual = 0;
	}



	public int calcularAntiguedad() {
		int antiguedad = ANO_ACTUAL - anioDeFabricacion;
		return antiguedad;
	}

	public int getAnioDeFabricacion() {
		return anioDeFabricacion;
	}

	public void setAnioDeFabricacion(int anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}

	public static int getCantidadCoches() {
		return cantidadCoches;
	}

	public static void setCantidadCoches(int cantidadCoches) {
		Autos.cantidadCoches = cantidadCoches;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKilometrosActuales() {
		return kilometrosActuales;
	}

	public void setKilometrosActuales(int kilometrosActuales) {
		this.kilometrosActuales = kilometrosActuales;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getANO_ACTUAL() {
		return ANO_ACTUAL;
	}
	
	
	public void alcanzarVelocidadMaxima() {
        double tiempo = 0;
        double velocidadEnMetrosxSegundo = velocidadMaxima * 1000 / 3600; // Conversión de km/h a m/s

        while (velocidadActual < velocidadEnMetrosxSegundo) {
            velocidadActual += aceleracion;
            tiempo++;
        }

        System.out.println("Tiempo necesario para alcanzar la velocidad maxima: " + tiempo + " segundos");
    }

}
