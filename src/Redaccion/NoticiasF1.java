package Redaccion;

public class NoticiasF1 extends Noticia{

	private String escuderia;
	private double precioInicial=100;
	private int puntuacionInicial = 4;

	
	
	public NoticiasF1(String titular, String escuderia ) {
		super(titular);
		this.escuderia=escuderia;
		
	}


	public String getEscuderia() {
		return escuderia;
	}


	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	@Override
	public double calcularPrecioNoticia() {
	    double precio = super.calcularPrecioNoticia(); 
	    if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
	        precio += 50;
	    }
	    
	    return precio;
	}
	@Override
	public int calculaPuntuacion() {
		int puntuacion = super.calculaPuntuacion();
		if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
	        puntuacion += 2;
	    }
		return puntuacion;
	}
}
