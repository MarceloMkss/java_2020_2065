package com.ipartek.ejercicio.carro;

public interface IVehiculo {

	/**
	 * Pinta un menu com opciones para que el usuario elija una opcion para empezar
	 * a trabajar
	 * 
	 * @author Marcelo Kleibson
	 */
	void menu();

	/**
	 * Pedimos los datos al usuario, y lo guardamos en una lista de Coches..
	 * 
	 * @author Marcelo Kleibson
	 */

	void pedirDatos();

	/**
	 * mostramos los datos por pantalla
	 * 
	 * @author Marcelo Kleibson
	 */
	void mostrarDatos();

	void continuar();

}
