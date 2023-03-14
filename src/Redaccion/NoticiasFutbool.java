package Redaccion;

public class NoticiasFutbool extends Noticia {
	
	private String competecionRef;
	private String club;
	private String jugador;
	private double precioInicial=300;
	private int puntuacionInicial = 5;
	
	public NoticiasFutbool(String titular, String competicionRef, String club, String jugador ) {
		super(titular);
		this.competecionRef=competicionRef;
		this.club=club;
		this.jugador=jugador;
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

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	
	@Override
	public double calcularPrecioNoticia() {
	    double precio = super.calcularPrecioNoticia(); 
	    if (competecionRef.equals("Liga de Campeones")) {
	        precio += 100;
	    }
	    if (club.equals("Barça") || club.equals("Madrid")) {
	        precio += 100;
	    }
	    if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
	        precio += 50;
	    }
	    return precio;
	}
	@Override
	public int calculaPuntuacion() {
		int puntuacion = super.calculaPuntuacion();
		if (competecionRef.equals("Liga de Campeones")) {
	        puntuacion += 3;
	    }
		if (competecionRef.equals("Liga")) {
	        puntuacion += 2;
	    }
	    if (club.equals("Barça") || club.equals("Madrid")) {
	    	puntuacion += 1;
	    }
	    if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
	    	puntuacion += 1;
	    }
		return puntuacion;
	}
	
}
