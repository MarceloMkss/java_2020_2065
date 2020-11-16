package com.ipartek.apps.cartas;

public class Principal {

	public static void main(String[] args) {

		BarajaNaipes bn = new BarajaNaipes();
		bn.crear();
		bn.mostrar();
		bn.barajar();

		BarajaPoker bp = new BarajaPoker();
		bp.crear();
		bp.mostrar();
		bp.barajar();

		// crear baraja de naipes españoles

		// ordenar por palo y mostrar

		// ordenar por numero y mostrar

		// barajar y mostrar

		// REPERTIR LO MISMO pero con la de POKER

	}

}
