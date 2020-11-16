package com.ipartek;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Entrada_salida_datos_JOptionPane {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int entero = 5;
		float flotante;
		double decimal;
		char letra;
		String cadena;

		// manera sacando ventanas emergentes por pantalla

		// JOptionPane.showInputDialog Permite ver una ventana emergente que pide los
		// datos

		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		letra = JOptionPane.showInputDialog("Digite uma letra : ").charAt(0);
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero : "));
		flotante = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero flotante : "));
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite otro numero decimal : "));

		// JOptionPane.showMessageDialog Permite ver una ventana emergente los datos
		// escritos anteriomente

		JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
		JOptionPane.showMessageDialog(null, "La letra es: " + letra);
		JOptionPane.showMessageDialog(null, "el entero es: " + entero);
		JOptionPane.showMessageDialog(null, "El flotante es: " + flotante);
		JOptionPane.showMessageDialog(null, "el decimal es: " + decimal);

		// manera 2 pedindo datos y sacando por consola2

		System.out.println("digite un entero");
		entero = entrada.nextInt();
		System.out.println("en numero es: " + entero);

		System.out.println("digite un decimal");
		decimal = entrada.nextFloat();
		System.out.println("en numero es: " + decimal);

		System.out.println("digite un entero");
		letra = entrada.next().charAt(5); // cogerá la primera letra de la palabra que escribas
		System.out.println("la letra es : " + letra);

		System.out.println("digite un cadena");
		cadena = entrada.nextLine();
		System.out.println("la cadena es : " + cadena);

		entrada.close();

	}

}
