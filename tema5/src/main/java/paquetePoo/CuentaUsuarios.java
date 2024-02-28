package paquetePoo;

import java.util.HashSet; //Importar clases (si ponemos * se importan todas las clases del paqute java.util)
import java.util.Set;

public class CuentaUsuarios {
	public static void main(String[] args) {

		// Instancia de objeto de clase Cliente
		Cliente cl1 = new Cliente("Fouad Arenas", "001", 16000);
		Cliente cl2 = new Cliente("Miguel Delibes", "002", 1450);
		Cliente cl3 = new Cliente("Rubén Ruperto", "003", 1500);
		Cliente cl4 = new Cliente("Mario Vaquerizo", "004", 130);

		// Instancia de Colleción
		Set<Cliente> clienteBanco = new HashSet<>();

		clienteBanco.add(cl1);
		clienteBanco.add(cl2);
		clienteBanco.add(cl3);
		clienteBanco.add(cl4);

		// Recorrermos la colección

		System.out.println(clienteBanco.toString()); // Tambien se puede poner sin el .toString()

		System.out.println("-------------------------------------------------------------"); // Salto de línea
		// for-each
		for (Cliente cliente : clienteBanco) {
			System.out.println(cliente);
		}

	}

}
