package com.ipartek.sqlite3;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.pojo.Perro;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {

		/*
		 * String sql = "SELECT * FROM perro ORDER BY nombre ASC;"; ArrayList<Perro>
		 * perros = new ArrayList();
		 * 
		 * // Todo lo que metamos dentro de los () del try se cierra automaticamente al
		 * // terminar el try // Esto es posible porque los recursos implementan la
		 * interfaz AutoClosable try (Connection conn =
		 * DriverManager.getConnection("jdbc:sqlite:ddbb/perrera.db"); PreparedStatement
		 * pst = conn.prepareStatement(sql); ResultSet rs = pst.executeQuery(); Patinete
		 * patin = new Patinete();) {
		 * 
		 * while (rs.next()) {
		 * 
		 * Perro p = new Perro(); p.setId(rs.getInt("id"));
		 * p.setNombre(rs.getString("nombre")); p.setRaza(rs.getString("raza"));
		 * p.setPeso(rs.getFloat("peso")); p.setVacunado(rs.getBoolean("vacunado"));
		 * p.setHistoria(rs.getString("historia")); perros.add(p);
		 * 
		 * }
		 * 
		 * for (Perro perro : perros) { System.out.println(perro); }
		 * 
		 * } // try, se cierran Connection, PreparedStatement, ResultSet y Patinete
		 */

		// Este DAO se encarga de realizara la operaciones de CRUD contra la bbdd

		PerroDAOSqlite dao = new PerroDAOSqlite();

		System.out.println("Ultimo id " + dao.getLastId());

		System.out.println(dao.recuperar(1));
		System.out.println(dao.recuperar(2));
		System.out.println(dao.recuperar(3));
		System.out.println(dao.recuperar(145)); // aqui saldra null porque no hay perro en la posicion 145

		Perro pNuevo = new Perro("bubba", "boxer", 34);

		try {

			dao.crear(pNuevo); // insert

		} catch (Exception e) {

			System.out.printf("** el nombre del perro %s ya existe \n", pNuevo.getNombre());
		}

		dao.eliminar(3);

		for (Perro p : dao.listar()) {
			System.out.println(p);
		}

		System.out.println("terminamos");

	}

}