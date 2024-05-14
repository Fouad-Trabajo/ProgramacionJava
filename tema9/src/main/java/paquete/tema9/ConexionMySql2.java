package paquete.tema9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class ConexionMySql2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Connection miConexion = null;
		try {
			// 1. Conexión
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");

			//String query = "SELECT * FROM articulos WHERE nombre=?";
			// 2. Objeto STATAMENT
			PreparedStatement miPreStatement = miConexion.prepareStatement("SELECT * FROM articulos WHERE nombre=?"
					+ "AND id_articulo=?");

			// 3. Crear la SQL - DQL
			miPreStatement.setString(0, "Ordenador");
			

			// 4. LEER RESULTSET
			Resultset miResultset = (Resultset) miPreStatement.executeQuery();

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
