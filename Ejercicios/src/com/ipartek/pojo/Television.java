package com.ipartek.pojo;

public class Television extends Electrodomestico { // hereda de la classe Electrodomestico

	// Atributos
	int pulgadas;

	// Construtor

	public Television() {
		super();

	}

	public Television(String nombre, int precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;

	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ "]";
	}

}
