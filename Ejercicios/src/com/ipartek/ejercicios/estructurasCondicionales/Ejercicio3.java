package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm. Una vez
 * introducida, se solicitará que escoja a que unidad se van a convertir,
 * introduciendo la opción por teclado
 * <ul>
 * <li>A: centimetros a metros</li>
 * <li>B: centimetros a pulgadas</li>
 * <li>C: centimetros a pies</li>
 * <li>D: centimetros a yardas</li>
 * </ul>
 * 
 * @author Marcelo Kleibson
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		int opc = 0; // variable opcion que recibirar la eleccion del usuario
		double centimetros;
		double metros;
		double pulgadas;
		double pies = 0.3048;
		double yardas;
		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("\n CONVERSION DE UNIDADES \n");
			System.out.println("1.- centimetros--A--metros");
			System.out.println("2.- centimetros--A--pulgadas");
			System.out.println("3.- centimetros--A--pies");
			System.out.println("4.- centimetros--A--yardas");
			System.out.println("5.- Salir \n");

			System.out.println("Ingrese el tipo de conversion: ");

			opc = Integer.parseInt(scan.nextLine());

			switch (opc) {

			case 1:
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("1.- conversion de centimetros A metros \n ");
				System.out.println("Ingrese sus centimetros \n ");
				centimetros = Integer.parseInt(scan.nextLine());
				metros = (centimetros / 100);
				System.out.println(
						"la conversion de :" + centimetros + " centimetros a metro es de :" + metros + " m \n");
				System.out.println("-------------------------------------------------------------------------------");

				break;

			case 2:
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("2.- conversion de centimetros A pulgadas");
				System.out.println("Ingrese sus centimetros");
				centimetros = Integer.parseInt(scan.nextLine());
				pulgadas = (centimetros * 0.39370);
				System.out.println(
						"la conversion de :" + centimetros + " centimetros a Pulgadas es de :" + pulgadas + " in");
				System.out.println("-------------------------------------------------------------------------------");

				break;

			case 3:
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("3.- conversion de centimetros A pies");
				System.out.println("Ingrese sus centimetros");
				centimetros = Integer.parseInt(scan.nextLine());
				pies = (centimetros * 0.03280840);
				System.out.println("la conversion de :" + centimetros + " centimetros a pies es de :" + pies + " ft");
				System.out.println("------------------------------------------------------------------------------");

				break;

			case 4:
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("4.- conversion de centimetros A yardas");
				System.out.println("Ingrese sus centimetros");
				centimetros = Integer.parseInt(scan.nextLine());
				yardas = (centimetros * 0.010936);
				System.out
						.println("la conversion de :" + centimetros + " centimetros a yardas es de :" + yardas + " yd");
				System.out.println("------------------------------------------------------------------------------");

				break;

			default:
				System.out.println(" no has ingresado un numero valido : ");
				scan.close();

				break;
			}

		} while (opc != 5);

	} // main

}
