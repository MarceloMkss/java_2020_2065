package com.ipartek.ejercicios.interfaces;

public class Acumulador implements IModificacion {

	/**
	 * 
	 */

	private int valor;

	public Acumulador(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Acumulador [valor=" + valor + "]";
	}

	@Override
	public void incremento(int a) {

		this.valor += a;

	}

}
