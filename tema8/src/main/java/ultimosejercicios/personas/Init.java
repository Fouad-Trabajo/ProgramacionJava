package ultimosejercicios.personas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Init {

	static CrearObjetos instancia = new CrearObjetos();

	public static void main(String[] args) {

		escribir5PrimerosObjetos();
		escribir5SegundosObjetos();
		leerFichero();

	}

	public static void escribir5PrimerosObjetos() {
		try (FileOutputStream fos = new FileOutputStream("C:/Users/Fouad/Desktop/ListaObjetos.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { // try-with-resources

			System.out.println("Escribiendo los 5 primeros objetos en el fichero...");

			/*
			 * Escribe un objeto como "no compartido" en ObjectOutputStream. Este método
			 * significa que puedes enviar el mismo objeto al flujo varias veces, y cada vez
			 * se tratará como un objeto nuevo
			 */
			oos.writeUnshared(instancia.p1);
			oos.writeUnshared(instancia.p2);
			oos.writeUnshared(instancia.p3);
			oos.writeUnshared(instancia.p4);
			oos.writeUnshared(instancia.p5);
			System.out.println("Insertados los 5 primeros objetos, ahora se cierra el fichero.");

		} catch (IOException e) {
			System.err.println("Error de Escritura :" + e);
		}

	}

	public static void escribir5SegundosObjetos() {
		try (FileOutputStream fos = new FileOutputStream("C:/Users/Fouad/Desktop/ListaObjetos.txt", true);
				MyObjectOutputStream moos = new MyObjectOutputStream(fos)) { // try-with-resources NO se sobreescribe

			System.out.println("Escribiendo los 5 siguentes objetos en el fichero...");

			moos.writeUnshared(instancia.p6);
			moos.writeUnshared(instancia.p7);
			moos.writeUnshared(instancia.p8);
			moos.writeUnshared(instancia.p9);
			moos.writeUnshared(instancia.p10);
			System.out.println("Insertados los 5 siguentes objetos sin crear cabeceras extra\n");
		} catch (IOException e) {
			System.err.println("Error de Escritura :" + e);
		}

	}

	public static void leerFichero() {
		try (FileInputStream fis = new FileInputStream("C:/Users/Fouad/Desktop/ListaObjetos.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			for (;;) {
				try {
					Persona p1 = (Persona) ois.readUnshared();
					System.out.println(p1);
				} catch (ClassNotFoundException e) {
					System.err.println("Error, fichero no encontrado: " + e);
					e.printStackTrace();
				}
			}

		} catch (EOFException e) {
			System.err.println("Error, has llegado al final del fichero: " + e);
		} catch (IOException e) {
			System.err.println("Error de lectura: " + e);
		}
	}

}
