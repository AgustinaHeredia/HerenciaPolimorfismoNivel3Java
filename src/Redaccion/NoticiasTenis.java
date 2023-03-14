package Redaccion;

public class NoticiasTenis extends Noticia {

	private String competecionRef;
	private String tenista;
	private double precioInicial=150;
	private int puntuacionInicial = 4;
	
	public NoticiasTenis(String titular, String competicionRef, String tenista ) {
		super(titular);
		this.competecionRef=competicionRef;
		this.tenista=tenista;
	}

	public String getCompetecionRef() {
		return competecionRef;
	}

	public void setCompetecionRef(String competecionRef) {
		this.competecionRef = competecionRef;
	}

	public String getTenista() {
		return tenista;
	}

	public void setTenista(String tenista) {
		this.tenista = tenista;
	}
	@Override
	public double calcularPrecioNoticia() {
	    double precio = super.calcularPrecioNoticia(); 
	    if (tenista.equals("Federer") || tenista.equals("Nadal")|| tenista.equals("Djokovic")) {
	        precio += 100;
	    }
	    return precio;
	}
	@Override
	public int calculaPuntuacion() {
		int puntuacion = super.calculaPuntuacion(); 
	    if (tenista.equals("Federer") || tenista.equals("Nadal")|| tenista.equals("Djokovic")) {
	        puntuacion += 3;
	    }
		return puntuacion;
	}
}
