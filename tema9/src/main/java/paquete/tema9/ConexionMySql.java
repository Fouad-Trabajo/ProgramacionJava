package paquete.tema9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySql {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Connection miConexion = null;
		try {
			// 1. Conexión
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");

			// 2. Objeto STATAMENT
			Statement miStatement = miConexion.createStatement();

			// 3. Crear la SQL - DQL
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM articulos");

			// 4. LEER RESULTSET
			while ((miResultset).next()) {
				int id_articulo = miResultset.getInt("id_articulo");
				String nombre = miResultset.getString("nombre");
				System.out.println("id: " + id_articulo + " Nombre del articulo: " + nombre);
			}

		} catch (SQLException e) {
			System.out.println("No se ha conectado!!!!");
		} finally {
			try {
				if (miConexion != null) {
					System.out.println("Se va ha proceder a cerrar la conexión");
					miConexion.close();
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}
}
