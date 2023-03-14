package Redaccion;

public class NoticiasMotociclismo extends Noticia{

	private String equipo;
	private double precioInicial=100;
	private int puntuacionInicial = 3;

	
	
	public NoticiasMotociclismo(String titular, String equipo ) {
		super(titular);
		this.equipo=equipo;
		
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	@Override
	public double calcularPrecioNoticia() {
	    double precio = super.calcularPrecioNoticia(); 
	    if (equipo.equals("Honda") || equipo.equals("Yamaha")) {
	        precio += 50;
	    }
	    
	    return precio;
	}
	@Override
	public int calculaPuntuacion() {
		int puntuacion = super.calculaPuntuacion();
		if (equipo.equals("Honda") || equipo.equals("Yamaha")) {
	        puntuacion += 3;
	    }
		return puntuacion;
	}
}
