package ut9.Serverproduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServerProduct {
	public static void main(String[] args) {
		Producto p1 = new Producto(5, "Alberto");
		saveProduct(p1);

	}

	// método para actualizar un producto o nos lo guarda
	public static void saveProduct(Producto producto) {
		Connection connection = null;

		try {
			String url = "jdbc:mysql://localhost:3306/tienda";
			String user = "root";
			String password = "";

			connection = DriverManager.getConnection(url, user, password);

			if (producto.id != null) { // Si existe, entonces lo actualizo
				PreparedStatement statement = connection.prepareStatement(
						"UPDATE producto SET name = ? WHERE id = ?");
				statement.setString(0, producto.name);
				statement.setLong(1, producto.id);
				statement.execute(); //Esto lanza la consulta a la BD
				// ("UPDATE producto SET name = " + producto.nombre + " WHERE id = " + producto.id");
			}else {
				PreparedStatement statament = connection.prepareStatement("INSERT INTO  producto (name) Values(?)");
				statament.setString(1, producto.name);
				statament.execute();
			}
			System.out.println(producto.name + " ha sido actualizado en la Base de datos");

		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if (connection != null) {
					System.out.println("Se va ha proceder a cerrar la conexión");
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
}
