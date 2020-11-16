package com.ipartek.pojo;

public class TelevisionPlana extends Television {// hereda de la clase Television

	private String tipoPantalla;

	/*
	 * public TelevisionPlana() { super(); this.tipoPantalla = "led";
	 * this.tipoPantalla = "plana";
	 * 
	 * }
	 */

	public TelevisionPlana() {
		super();

	}

	public TelevisionPlana(String nombre, int precio, int pulgadas, String tipoPantalla) {
		super(nombre, precio, pulgadas);
		this.tipoPantalla = tipoPantalla;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	@Override
	public String toString() {
		return "TelevisionPlana [tipoPantalla=" + tipoPantalla + ", getPulgadas()=" + getPulgadas() + ", getNombre()="
				+ getNombre() + ", getPrecio()=" + getPrecio() + "]";
	}

}
