package com.ipartek.ejercicios.interfaces.app.interfaces;

public interface IVehiculo {

	int VEL_MAX_COCHE = 150;
	int VEL_MAX_BICI = 50;
	int VEL_MAX_PATINETE = 80;

	/**
	 * arrancar: pondrá el atributo estaArrancado a true.<br>
	 * Debe estar apagado para poder arrancarse
	 * 
	 * @author Marcelo Kleibson
	 * @param
	 */

	void arrancar();

	/**
	 * Acelerar: incrementara la velocidad actual con el valor que se le pasa por
	 * parámetro sin sobrepasar el limite máximo de velocidad. Solo acelerara si el
	 * patinete esta encendido
	 * 
	 * @param int incrementoVel
	 */
	void Acelerar(int incrementoVel);

	/**
	 * Frenar: decrementara la velocidad actual con el valor que se le pasa por
	 * parámetro sin llegar a bajar de 0. Solo frenara si el patinete esta encendido
	 * 
	 * @author Marcelo Kleibson
	 * @param int decrementoVel
	 */

	void Frenar(int decrementoVel);

	/**
	 * Apagar: pondrá el atributo estaArrancado a false, solo si la velocidadActual
	 * es 0
	 * 
	 * @Exception no se puede apagar si esta acelerada
	 */
	void Apagar() throws Exception;

}
