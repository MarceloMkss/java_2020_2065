package com.ipartek;

import javax.swing.JOptionPane;

/* La sentencia if
 * 
 * if (condition) { // si es verdadero "True" entra en if
		
	} else { // si es falso "False" entra en else

	}
 */

public class Condicionales {

	public static void main(String[] args) {
		int numero;
		int dato = 5;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

		if (numero == dato) {
			JOptionPane.showMessageDialog(null, "El numero es 5");
		} else {
			JOptionPane.showMessageDialog(null, "El numero es distinto de 5");

		}

	}// Main

}
