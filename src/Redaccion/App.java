package Redaccion;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Redactor> redactores = new ArrayList<Redactor>();
	
	public static void main(String[] args) {
		
		int seleccion=0;
		do {
			seleccion=pedirInt("Escribe el número de lo que desea realizar: "
					+ "\n1.- Introducir redactor."
					+ "\n2.- Eliminar redactor."
					+ "\n3.- Introducir noticia."
					+ "\n4.- Eliminar noticia."
					+ "\n5.- Mostrar todas las noticias por redactor."
					+ "\n6.- Calcular puntuación de la noticia."
					+ "\n7.- Calcular precio-noticia."
					+ "\n 0-salir del programa.");
			
			switch (seleccion){ 
			case 1:
				introducirRedactor(pedirString("Escribe el nombre del redactor"),pedirString("Introduce DNI del redactor: "));
				break;
			case 2:
				eliminarRedactor(pedirString("Escribe el nombre del redactor a eliminar"));
				break;
			case 3:
				crearNoticia(pedirInt("Escribe 1 - Si la noticia es de Futbol"
						+ "\n2 - Si la noticia es de baloncesto"
						+ "\n3 - Si la noticia es de Tenis"
						+ "\n4 - Si la noticia es de F1"
						+ "\n5 - Si la noticia es de Motociclismo"), buscarRedactorPorNombre(pedirString("Escribe el nombre del redactor")));
				break;
			case 4:
				Redactor redactor=buscarRedactorPorNombre(pedirString("Escribe el nombre del redactor"));
				String titular = pedirString("Escribe el nombre del titular a eliminar");
				redactor.eliminarNoticia(redactor.buscarNoticiaPorTitular(titular));
				break;
			case 5:
				Redactor redactor1=buscarRedactorPorNombre(pedirString("Escribe el nombre del redactor"));
				mostrarNoticias(redactor1.getNoticias());
				break;
			case 6:
				puntuacionNoticia(pedirString("Escribe el nombre del titular del que quieres calcular puntuación."),buscarRedactorPorNombre(pedirString("Escribe el nombre del redactor")));
				
				break;
			case 7:
				precioNoticia(pedirString("Escribe el nombre del titular del que quieres calcular puntuación."),buscarRedactorPorNombre(pedirString("Escribe el nombre del redactor")));
				break;
			case 0:
				System.out.println("Has elegido salir del programa. Hasta pronto.");
				break;
			default:
				System.out.println("El número ingresado no es correcto");
			}
		}while (seleccion !=0);
	}
	
	public static Redactor introducirRedactor(String nombre, String dni) {
		Redactor redactor = new Redactor(nombre,dni);
		redactores.add(redactor);
		return redactor;
	}
	public static void eliminarRedactor(String nombre) {
		String nombreBuscado = nombre;

		for (Redactor r : redactores) {
		    if (r.getNombre().equals(nombreBuscado)) {
		        
		        redactores.remove(r);
		        break; 
		    }
		}
	}
	public static Noticia crearNoticia(int tipoNoticia, Redactor redactor) {
		String titular = pedirString("Cual es el titular de la noticia?");
		if (tipoNoticia == 1) {
		    String competicionRef = pedirString("A qué competición hace referencia?");
		    String club = pedirString("De qué club trata la noticia?");
		    String jugador = pedirString("Cual es el jugador al que hace referencia?");
		    Noticia noticia = new NoticiasFutbool(titular, competicionRef, club, jugador);
		    redactor.agregarNoticia(noticia);
		    return noticia;
		} else if (tipoNoticia == 2) {
		    String competicionRef1 = pedirString("A qué competición hace referencia?");
		    String club1 = pedirString("De qué club trata la noticia?");
		    Noticia noticia = new NoticiasBaloncesto(titular, competicionRef1, club1);
		    redactor.agregarNoticia(noticia);
		    return noticia;
		} else if (tipoNoticia == 3) {
		    String competicionRef2 = pedirString("A qué competición hace referencia?");
		    String tenista = pedirString("De qué tenista trata la noticia?");
		    Noticia noticia = new NoticiasTenis(titular, competicionRef2, tenista);
		    redactor.agregarNoticia(noticia);
		    return noticia;
		} else if (tipoNoticia == 4) {
		    String escuderia = pedirString("A qué escudería hace referencia?");
		    Noticia noticia = new NoticiasF1(titular, escuderia);
		    redactor.agregarNoticia(noticia);
		    return noticia;
		} else if (tipoNoticia == 5) {
		    String equipo = pedirString("A qué equipo hace referencia?");
		    Noticia noticia = new NoticiasMotociclismo(titular, equipo);
		    redactor.agregarNoticia(noticia);
		    return noticia;
		} else {
		    System.out.println("Tipo de noticia inválido.");
		    return null;
		}
		
		
	}
	
	public static void puntuacionNoticia(String titular, Redactor redactor) {
		
		redactor.buscarNoticiaPorTitular(titular).calculaPuntuacion(); 
		
	}
	public static void precioNoticia(String titular, Redactor redactor) {
		redactor.buscarNoticiaPorTitular(titular).calcularPrecioNoticia(); 
	}
	
	static Redactor buscarRedactorPorNombre(String nombre) {
	    for (Redactor redactor : redactores) {
	        if (redactor.getNombre().equals(nombre)) {
	            return redactor;
	        }
	    }
	    return null; 
	}
	
	static void mostrarNoticias(ArrayList<Noticia> noticias) {
	    for (Noticia noticia : noticias) {
	       noticia.toString();
	    }
	}

	
	static int pedirInt(String texto) {
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
	static String pedirString(String texto) {
		System.out.println(texto);
		String nom = input.next();
		return nom;
	}
}
