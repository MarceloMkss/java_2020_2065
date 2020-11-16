package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.IFunciones;

import com.ipartek.pojo.Serie;

/**
 * Calcula la letra del DNI.<br>
 * 
 * <ul>
 * <li>@param numeros String son los 8 numeros del DNI.</li>
 * <li>@return dni completo con los numeros + letra.</li>
 * <li>@throws Exception si no pasamos como parametros 8 numeros.</li>
 * </ul>
 */

public class Utilidades implements IFunciones {

	static final char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	/**
	 * Calcula la letra del DNI
	 * 
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */

	static public String calcularLetraDni(String numeros) throws Exception {

		char letra;

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		try {
			int posicion = Integer.parseInt(numeros) % 23;
			letra = LETRAS_DNI[posicion];

		} catch (Exception e) {
			throw new Exception("No es un numero correcto " + numeros);
		}

		return numeros + letra;

	}

	@Override
	public String pedirNombre() throws Exception {

		String resul = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Intriduzca tu nombre: ");
		resul = entrada.nextLine();
		entrada.close();

		if (resul.length() <= 1) {

			throw new Exception("El nombre es muy corto");
		}

		for (int i = 0; i < resul.length(); i++) {
			char letra = resul.charAt(i); // nos trae todo los carcteres de la palavra escrita por medio del
			boolean isNumber = Character.isDigit(letra); // variable isNumber recibe
			throw new Exception("el nombre no puede contener numeros"); // charAt(i).
		}
		return resul;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {

		switch (tipoLoteria) {

		case LOTERIA_BONOLOTO:
			System.out.println("01 04 05 16 23 43 15 00");
			break;

		case LOTERIA_EUROMILLON:
			System.out.println("6 - 15 - 37 - 42 Estrellas: 3 - 4");
			break;

		case LOTERIA_QUINIELA:
			System.out.println("2 - 2 - X - 1 - 1 - 2 - 1 - X - 1 - 1 - 2 - 2 Pleno al 15: X");
			break;

		default:
			throw new Exception("No existe ese tipo de loteria");
		}

	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {

		if (dineroEntregado < precioProducto) {
			throw new Exception("Dinero insuficiente"); /*
														 * lanzamos una excepcion caso el dineroEntregado sea menor que
														 * el precioProducto. ej: dineroEntregado=50, precioProducto =
														 * 100.. nos faltaria 50.
														 */
		}

		return dineroEntregado - precioProducto;

	}

	@Override
	public Serie pedirDatosPorConsola() {

		Serie serie = new Serie("");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nombre:");
		serie.setNombre(entrada.nextLine());

		System.out.println("Duración en minutos:");
		serie.setDuracion(Integer.parseInt(entrada.nextLine()));

		System.out.println("Número de temporadas:");
		serie.setNumTemporadas(Integer.parseInt(entrada.nextLine()));

		System.out.println("Plataforma en la que esta disponble:");
		serie.setPlataforma(entrada.nextLine());

		entrada.close();
		return serie;

	}

}
