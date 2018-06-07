package auxiliar;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import modelo.Jugador;
import modelo.Libro;
public class Practica {
private String[] temas = {"PROGRAMACION", "DISEÑO WEB", "SISTEMAS Y REDES","OFIMATICA"};
	
	public HashMap<String, ArrayList<Libro>>listadoLibros(String rutaFichero){
		HashMap<String, ArrayList<Libro>> resultado = new HashMap<String, ArrayList<Libro>>();
	
		try {
			// Abrir el fichero
			FileReader fr = new FileReader(rutaFichero);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea= br.readLine()) != null) {
				String[] campos= linea.split("#");
				//los convertimos cada uno para para que recogan string
				int id = Integer.parseInt(campos[0]);
				int tema = Integer.parseInt(campos[1]);
				String titulo = campos[2];
				float precio = Float.parseFloat(campos[3]);
				String portada= campos[4];
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate fecha = LocalDate.parse(campos[5], fmt);
				String clave = temas[tema-1];//forma de coger el array como clave para el hm listadoLibros.
				
				Libro libro = new Libro();  //objeto libro con las propiedades
				//creamos la variable para la clase libro para poder llamar los getters y setters de la clase
				libro.setId(id);
				libro.setTema(tema);
				libro.setTitulo(titulo);
				libro.setPrecio(precio);
				libro.setPortada(portada);
				
				
				if (resultado.get(clave) == null) {
					resultado.put(clave, new ArrayList<Libro>());
					resultado.get(clave).add(libro);
					
				}
			}
				fr.close();
				br.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("EOF");
		}
		return resultado;
	
	}
	
	public void listarLibros( HashMap<String, ArrayList<Libro>> libros) {
		Set<String> claves = libros.keySet();
		for (String clave : claves) {
			System.out.println("---------------------------- "+ clave + " -------------------------");
			ArrayList<Libro> listarLibros = libros.get(clave);
			for (Libro libro : listarLibros) {
				System.out.println(libro.getTitulo());
				System.out.println();
				
			}
				
		}
	}
  
  
  	//---------------------------Actividad 2 -------------------------
	//metodo para conectar con el localhost y la base de datos
	public Connection conexion(String dominio, String bd, String usr, String clave) {
		// forma de conectar con mysql desde xamp y con la base de datos creada
		// anteriormente.
		try {
			String url = "jdbc:mysql://" + dominio + "/" + bd;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url, usr, clave);
			// ruta necesaria para poder conectar con cualquier base de datos exterior con
			// la configuracion del driver manager.
			System.out.println("¡¡Has conectado con la  base de datos!!");
			
			return con;
		} catch (InstantiationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("¡¡NO has conectado con la base de datos!!");

		return null;
	}
	
	

	
	 public void insersionDatos() {
		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddMMyyyy");
		 Jugador[] listaJugadores1 = { new Jugador("123F", "BALE", LocalDate.parse("15081998", fmt), 182, 0, 15),
					new Jugador("124F", "INIESTA", LocalDate.parse("15081979", fmt), 183, 1, 7),
					new Jugador("125F", "BALE2", LocalDate.parse("15081996", fmt), 182, 0, 1),
					new Jugador("126F", "JOAQUIN3", LocalDate.parse("15081998", fmt), 182, 2, 5),
					new Jugador("127F", "INIESTA1", LocalDate.parse("15081969", fmt), 183, 1, 3),
					new Jugador("128F", "BALE4", LocalDate.parse("15081996", fmt), 182, 0, 5),
					new Jugador("129F", "INIESTA2", LocalDate.parse("15081999", fmt), 183, 1, 0),
					new Jugador("134F", "JOAQUIN5", LocalDate.parse("15081996", fmt), 182, 2, 2),
					new Jugador("423F", "BALE8", LocalDate.parse("15081998", fmt), 182, 0, 5),
					new Jugador("524F", "INIESTA5", LocalDate.parse("15081999", fmt), 183, 1, 4),
					new Jugador("625F", "JOAQUIN7", LocalDate.parse("15081996", fmt), 182, 2, 6),
					new Jugador("724F", "INIESTA", LocalDate.parse("15081999", fmt), 183, 1, 10),
					new Jugador("825F", "BALE2", LocalDate.parse("15081996", fmt), 182, 0, 15),
					new Jugador("923F", "JOAQUIN3", LocalDate.parse("15081998", fmt), 182, 2, 5),
					new Jugador("224F", "INIESTA9", LocalDate.parse("15081999", fmt), 183, 1, 2),
					new Jugador("325F", "BALE9", LocalDate.parse("15081996", fmt), 182, 0, 1),
					new Jugador("424F", "JOAQUIN2", LocalDate.parse("15081999", fmt), 183, 2, 0),
					new Jugador("625F", "JOAQUIN5", LocalDate.parse("15081996", fmt), 182, 2, 1),
					new Jugador("823F", "BALE6", LocalDate.parse("15081998", fmt), 182, 0, 7),
					new Jugador("724F", "INIESTA3", LocalDate.parse("15081999", fmt), 183, 1, 4),
					new Jugador("925F", "BALE7", LocalDate.parse("15081996", fmt), 182, 0, 5) };
		
		 //Jugador jugador = listaJugadores1[1];
		 try {
				Connection con = conexion("localhost", "jugadores", "root", "");
				Statement stmt = con.createStatement();
				for (Jugador jugador : listaJugadores1) { 
					//recorre desde lista jugadores el array jugador 
					String sql = "INSERT INTO jugadores (nif,nombre,fecha,altura,equipo,golesMarcados) values ('"
				+ jugador.getNif() +"','"+jugador.getNombre() +"','" +jugador.getFecha() + "'," + jugador.getAltura()
				+ "," + jugador.getEquipo() +"," + jugador.getGolesMarcados() +");";
					//metodo de insertar  
					System.out.println(sql);
					stmt.executeUpdate(sql);
				}
				
					/*String sql = "INSERT INTO jugadores (nif,nombre,fecha,altura,equipo,golesMarcados) values ('"
				+ jugador.getNif() +"','"+jugador.getNombre() +"','" +jugador.getFecha() + "'," + jugador.getAltura()
				+ "," + jugador.getEquipo() +"," + jugador.getGolesMarcados() +");";*/
					
					
			
				stmt.close();
				con.close();
		 
	 } catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

