package com.ipartek.ejercicios.interfaces.app.interfaces;

public class Principal {

	public static void main(String[] args) {

		// creo un patinete
		Patinete p = new Patinete();
		p.setEstaArrancado(true);
		p.setVelocidadActual(100);
		p.setVelocidadActual(100 - 10);

		System.out.println(p);

	}

}
