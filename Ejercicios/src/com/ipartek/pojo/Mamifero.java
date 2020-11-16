package com.ipartek.pojo;


public class Mamifero {

	// Atributos

	private int patas;
	private String nombre;

	// Construtor
	public Mamifero(String nombre) {
		super();
		this.nombre = nombre;
		this.patas = 0;

	}

	// geters y seters

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// sobreescribimos el padre
	@Override
	public String toString() {
		return "Mamifero [nombre=" + nombre + ", patas=" + patas + "]";
	}

	
}
