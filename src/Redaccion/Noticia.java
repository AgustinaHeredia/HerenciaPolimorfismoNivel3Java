package Redaccion;

public class Noticia {
	
	protected String titular;
	protected String texto= " ";
	protected int puntuacion;
	protected double precio;
	
	public Noticia (String titular) {
		this.titular=titular;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getPuntacion() {
		return puntuacion;
	}

	public void setPuntacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double calcularPrecioNoticia() {
		double precioInicial = precio;
	    return precioInicial;
	}
	public int calculaPuntuacion() {
		int puntuacionInicial = puntuacion;
		return puntuacionInicial;
	}
	@Override
	public String toString() {
		return "El titular de la noticia es"+ titular;
	}
	
}
