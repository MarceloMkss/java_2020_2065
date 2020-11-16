package com.ipartek.ejercicios.excepciones;

/**
 * 
 * Calcula la letra del DNI <br>
 * <ul>
 * <li>@param método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada</li>
 * <li>@return letra y posicion de la letra</li>
 * <li>@throws Exception si no pasamos como parametros 8 numeros</li>
 * <li>@author Marcelo</li>
 * 
 * </ul>
 */

public class MetodoEjercicio3 {

	static final char LETRAS[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };

	static public String recibirArgumentos(String numeros) throws Exception {

		char letra;

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		try {
			int posicion = Integer.parseInt(numeros) % 23;
			letra = LETRAS[posicion];

		} catch (Exception e) {
			throw new Exception("No es un numero correcto " + numeros);
		}

		return numeros + letra;

	}
}
