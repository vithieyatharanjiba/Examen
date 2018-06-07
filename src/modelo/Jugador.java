package modelo;

import java.time.LocalDate;

public class Jugador extends Persona implements Comparable {
	// private static final long serialVersionUID = 1L;
	private int equipo;
	private int golesMarcados;

	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jugador(String nif, String nombre, LocalDate fecha, int altura, int equipo, int goles) {
		super(nif, nombre, fecha, altura);
		this.equipo = equipo;
		this.golesMarcados = goles;

	}

	public int getEquipo() {
		return equipo;
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Jugador j = (Jugador) o;
		if (this.getEquipo() == j.getEquipo())
			return 0;
		else if (this.getEquipo() < j.getEquipo())
			return -1;
		else
			return 1;

	}
}
