package com.ipartek.ejercicios.variablesYoperadores;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int a = 0, b = 0, resultado;
		String sel = null; // esta variable la usare en el switch que estara en null sin ningun valor
		Scanner teclado = new Scanner(System.in); // llamare teclado a la variable Scanner pues sera el teclado que
													// enviaremos los datos de entrada
		System.out.println("Selcione una opción \n ");
		System.out.println("+: suma" + "\n-: Resta" + "\n*: Multiplicacion" + "\n/: División");
		sel = teclado.next();

		switch (sel) { // se utiliza para agilizar la toma de decisiones múltiples, tenemos la
						// posibilidad de poner varios casos
		case "+": // Suma
			System.out.println("ha selecionado suma/ingrese los valores\n");
			System.out.println("\nIngrese el primero numero: ");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero: \n");
			b = teclado.nextInt();
			resultado = a + b;
			System.out.println(a + "+" + b + "=" + resultado);
			break;

		case "-": // Resta
			System.out.println("ha selecionado suma/ingrese los valores\n");
			System.out.println("\nIngrese el primero numero: ");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero: \n");
			b = teclado.nextInt();
			resultado = a - b;
			System.out.println(a + "-" + b + "=" + resultado);
			break;

		case "*": // Multiplicacion
			System.out.println("ha selecionado suma/ingrese los valores\n");
			System.out.println("\nIngrese el primero numero: ");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero: \n");
			b = teclado.nextInt();
			resultado = a * b;
			System.out.println(a + "*" + b + "=" + resultado);
			break;

		case "/": // Division
			System.out.println("ha selecionado suma/ingrese los valores\n");
			System.out.println("\nIngrese el primero numero: ");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero: \n");
			b = teclado.nextInt();
			resultado = a / b;
			System.out.println(a + "/" + b + "=" + resultado);
			break;

		default:
			System.out.println("esa opcion no existe");
			teclado.close();
			break;

		}

	}
}
