package com.ipartek.pojo;

public class Jugador {

	// atributos
	private String nombre;
	private int dorsal;

	// constructor por defecto
	public Jugador() {
		super();
		this.nombre = "";
		this.dorsal = 0;
	}

	public Jugador(String nombre, int dorsal) {
		this();
		this.nombre = nombre;
		this.dorsal = dorsal;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

}
