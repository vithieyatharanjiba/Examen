package principal;
import java.util.ArrayList;
import java.util.HashMap;

import auxiliar.Practica;
import modelo.Libro;
public class Principal {
public static void main(String[] args) {
		
		//String asignatura = new String();//
	Practica recuperacion = new Practica();
		
	
		
	HashMap<String, ArrayList<Libro>> ej1 = new Practica().listadoLibros("ficheros/libros.csv");
		
	//recuperacion.conexion("localhost", "jugadores", "root", "");
	
	recuperacion.insersionDatos();
	
	System.out.println("fin");	
	
	}
}
