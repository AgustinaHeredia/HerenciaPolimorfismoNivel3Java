package Redaccion;

import java.util.ArrayList;

public class Redactor {

	private String nombre;
	private String dni;
	private double sueldo = 1500.0;
	private static ArrayList<Noticia> noticias;
	
	public Redactor (String nombre, String dni) {
		this.nombre = nombre;
        this.dni = dni;
        this.noticias = new ArrayList<Noticia>();

    }
	public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public ArrayList<Noticia> getNoticias() {
    	return noticias;
    }
    
    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }
    
    public void eliminarNoticia(Noticia noticia) {
        noticias.remove(noticia);
    }
    public Noticia buscarNoticiaPorTitular(String titular) {
	    for (Noticia noticia : noticias) {
	        if (noticia.getTitular().equals(titular)) {
	            return noticia;
	        }
	    }
	    return null; 
	}
}
