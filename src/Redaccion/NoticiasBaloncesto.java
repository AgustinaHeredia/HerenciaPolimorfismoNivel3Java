package Redaccion;

public class NoticiasBaloncesto extends Noticia {

	private String competecionRef;
	private String club;
	private double precioInicial=250;
	private int puntuacionInicial = 4;
	
	public NoticiasBaloncesto(String titular, String competicionRef, String club ) {
		super(titular);
		this.competecionRef=competicionRef;
		this.club=club;
	}

	public String getCompetecionRef() {
		return competecionRef;
	}

	public void setCompetecionRef(String competecionRef) {
		this.competecionRef = competecionRef;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	@Override
	public double calcularPrecioNoticia() {
	    double precio = super.calcularPrecioNoticia(); 
	    if (competecionRef.equals("Euroliga")) {
	        precio += 75;
	    }
	    if (club.equals("Barça") || club.equals("Madrid")) {
	        precio += 75;
	    }
	    
	    return precio;
	}
	@Override
	public int calculaPuntuacion() {
		int puntuacion = super.calculaPuntuacion();
		if (competecionRef.equals("Euroliga")) {
	        puntuacion += 3;
	    }
		if (competecionRef.equals("ABC")) {
	        puntuacion += 2;
	    }
	    if (club.equals("Barça") || club.equals("Madrid")) {
	    	puntuacion += 1;
	    }
		return puntuacion;
	}
	
}
