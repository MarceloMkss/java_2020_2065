package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
 * la letra de la posici�n indicada.<br>
 * Ll�melo pasando como par�metro un String sin inicializar.<br>
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de
 * producirse una excepci�n por un paso de par�metros a null, no acabe con la
 * ejecuci�n del programa.<br>
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que el
 * tama�o del string, capturara el error y nos solicitara meter un numero
 * valido, indic�ndonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto �La lluvia en Sevilla
 * no es una maravilla�).<br>
 * 
 * @author Marcelo Kleibson
 * @version 1.0
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char letra;
		int num;

		System.out.println("Escriba un nombre: ");
		letra = entrada.next().charAt(0);

		System.out.println("Escriba un numero: ");
		num = entrada.nextInt();

		for (int i = 0; i < args.length; i++) {

		}
		System.out.println("la letra es: " + letra);
		entrada.close();

	}

}
