package com.ipartek.ejercicios.abstracta;

public class Linea extends ObjetoGrafico {

	int longitud;

	/**
	 * Implementamos el metodo que el padre a declarado abstract
	 */

	void dibujar() {
		System.out.println("dibujamos un alinea de longitud " + longitud);
	}

}
