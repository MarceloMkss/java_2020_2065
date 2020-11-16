package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private static final String PATH = "ddbb/perrera.db";
	final String SQL = "SELECT id, nombre FROM perro ORDER BY nombre ASC;";
	ArrayList<Perro> lista = new ArrayList<Perro>();
	private int indice;
	private static PerroDAOArrayList INSTANCE = null;

	private PerroDAOArrayList() {
		super();
		lista.add(new Perro(1, "Audi"));
		lista.add(new Perro(2, "Golf"));
		lista.add(new Perro(3, "Mercedez"));
		lista.add(new Perro(4, "Seat"));
		indice = 5;
	}

	public static synchronized PerroDAOArrayList getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new PerroDAOArrayList();
		}

		return INSTANCE;
	}

	@Override
	public Perro recuperar(int id) {
		// TODO hacer un for y buscar por id
		Perro p = null;
		p = new Perro();
		p.setId(id);

		return p;
	}// recuperar

	@Override
	public Perro crear(Perro p) throws Exception {

		p.setId(indice);
		lista.add(p);
		indice++;
		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		// hacer un for y buscar por id y cambiarlo

		return null;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		// hacer un for y buscar por id y eliminar de la posicion encontrada
		return false;
	}

	@Override
	public ArrayList<Perro> listar() {

		Perro p = new Perro();
		p.getId();
		p.getNombre();
		p.getRaza();
		p.getPeso();

		lista.add(p);

		return lista;
	}

}
