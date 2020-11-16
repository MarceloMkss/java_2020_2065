package com.ipartek.apps.cartas;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja.<br>
 * Para crear dicha lista se creara una clase de tipo carta, que tendrá un
 * número entero para el valor de la carta.<br>
 * así como un string con el palo de la baraja (copas, espadas, oros,
 * bastos).<br>
 * <ul>
 * <li>Crear la baraja con las cartas</li>
 * <li>ordenadas por palos.</li>
 * <li>ordenadas por números.</li>
 * <li>Barajar dicha baraja.
 * <li>mostrar las cartas.</li>
 * </ul>
 * 
 * @author Marcelo Kleibson de Souza Silva
 *
 */

public class Carta {

	private Palo palo;
	Numero numero;

	public Carta(Palo palo, Numero numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}

}
