package com.ipartek.apps.cartas;

import java.util.ArrayList;
import java.util.Random;

public class BarajaPoker extends Baraja {

	static final String PALOS_NOMBRES[] = { "picas", "corazones", "treboles", "diamantes" };
	static final String CARTAS_NOMBRES[] = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
			"diez", "sota", "caballo", "rey" };

	@Override
	void crear() {

		ArrayList<Carta> mazo = new ArrayList<Carta>();

		for (int i = 0; i < PALOS_NOMBRES.length; i++) {

			Palo p = new Palo((i + 1), PALOS_NOMBRES[i]);

			for (int j = 0; j < CARTAS_NOMBRES.length; j++) {

				Numero n = new Numero((j + 1), CARTAS_NOMBRES[j]);

				mazo.add(new Carta(p, n));

			} // for PALOS_NOMBRES

		} // for NUMEROS_CARTAS

		setMazo(mazo);

	}

	@Override
	void mostrar() {
		ArrayList<Carta> mazo = getMazo();

		for (Carta cartaPoker : mazo) {
			System.out.println(cartaPoker.getNumero());
			System.out.println(cartaPoker.getPalo());

		}

	}

	void barajar() {
		Random rdn = new Random();
		ArrayList<Carta> mazo = getMazo();

		for (int i = 0; i < mazo.size(); i++) {
			int azar = rdn.nextInt(mazo.size());
			Carta c = mazo.remove(azar); // aqui removemos la carta
			mazo.add(c); // aqui volvemos a meter la carta que ha sido removida.
		}

	}

}
