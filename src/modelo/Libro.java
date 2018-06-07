package modelo;

import java.time.LocalDate;

public class Libro {
	private int id;
	private int tema;
	private String titulo;
	private float precio;
	private String portada;
	private LocalDate fecha;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(int id, int tema, String titulo, float precio, String portada, LocalDate fecha) {
		super();
		this.id = id;
		this.tema = tema;
		this.titulo = titulo;
		this.precio = precio;
		this.portada = portada;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTema() {
		return tema;
	}
	public void setTema(int tema) {
		this.tema = tema;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
}
