package com.ipartek;

import com.ipartek.ejercicios.excepciones.Utilidades;
import com.ipartek.pojo.Serie;

public class ProbarInterfaz {

	public static void main(String[] args) throws Exception {

		Utilidades util = new Utilidades(); // Acedemos a la clase Utilidades le damos un nombre "util"
		boolean isError = true;

		// TODO mirar porque falla.........

		/*
		 * do { try { String nombre = util.pedirNombre();
		 * System.out.println("tu nombre es: " + nombre); isError = false;
		 * 
		 * } catch (Exception e) { System.out.println(e.getMessage()); }
		 * 
		 * } while (!isError);
		 * 
		 * System.out.println("el programa  termina....");
		 */

		Serie s = util.pedirDatosPorConsola();
		System.out.println("Tu serie es: " + s);

		// pedir nombre
		System.out.println("El programa termina......");

	}// main

}
