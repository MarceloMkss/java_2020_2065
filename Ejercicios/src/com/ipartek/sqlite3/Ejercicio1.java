package com.ipartek.sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio1 {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/concesionario.db");

		String sql = "SELECT * FROM coche;";
		PreparedStatement pst = conn.prepareStatement(sql); // sirve para EJECUTAR consultaen la base de datos. le
															// pasamos la sql
		ResultSet rs = pst.executeQuery(); // ejecutamos la query y nos devuelve un ("ResultSet")conjunto de resultado

		while (rs.next()) { // teniendo el resultado lo recorro en un bucle while y por cada interacion
							// dentro acedemos el resultado.
			System.out.println(rs.getInt("id") + rs.getString("nombre")); // el resultado seria que me trae la id y el
																			// nombre

		}

		System.out.println("terminamos");

	}

}
