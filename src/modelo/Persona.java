package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Persona implements Serializable {

	//private static final long serialVersionUID = 1L;
	private String nif;
	private String nombre;
	private LocalDate fecha;
	private int altura;

	private static int contador = 0;

	public Persona() { // constructor sin parámetros

		this.nif = "44882229Y";
		this.nombre = "Anonimo";
		this.fecha = LocalDate.now();
		this.altura = 180;

		contador++;
	}

	public Persona(String nif, String nombre,  LocalDate fecha, int altura) {
		this.nif = nif;
		this.nombre = nombre;
		this.fecha = fecha;
		this.altura = altura;
		contador++;

	}

	@Override

	public String toString() {

		return "persona numero : " + contador + ",  nif : " + this.nif + ", nombre : " + this.nombre + ", sexo : "
				+ ", fecha : " + this.fecha + ", altura : " + this.altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void soyEstatico() {

	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
