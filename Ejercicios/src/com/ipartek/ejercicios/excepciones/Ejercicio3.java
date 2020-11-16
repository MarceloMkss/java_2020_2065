package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada.<br>
 * Llámelo pasando como parámetro un String sin inicializar.<br>
 * Dicha llamada se encontrara dentro de un bloque try catch, que en caso de
 * producirse una excepción por un paso de parámetros a null, no acabe con la
 * ejecución del programa.<br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla
 * no es una maravilla”).<br>
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
