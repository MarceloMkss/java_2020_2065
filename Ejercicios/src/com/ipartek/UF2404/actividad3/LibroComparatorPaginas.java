package com.ipartek.UF2404.actividad3;

import java.util.Comparator;

public class LibroComparatorPaginas implements Comparator<Libro> {// esta clase sirve para hacer comparacion de libros y
																	// devuelve ordenados

	@Override
	public int compare(Libro o1, Libro o2) {

		return o1.getNumeroPaginas() - o2.getNumeroPaginas();

	}

}
