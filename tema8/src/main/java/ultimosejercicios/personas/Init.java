package ultimosejercicios.personas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Init {

	static CrearObjetos instancia = new CrearObjetos();

	public static void main(String[] args) {
		ClaseInterna ineritClass = new ClaseInterna();

		ineritClass.escribir5PrimerosObjetos();
		ineritClass.escribir5siguentesObjetos();
		ineritClass.leerFichero();

	}

	static class ClaseInterna {
		public void escribir5PrimerosObjetos() {
			try (MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream("ListaObjetos.dat"))) { // try-with-resources

				System.out.println("Escribiendo los 5 primeros objetos en el fichero...");

				/*
				 * Escribe un objeto como "no compartido" en ObjectOutputStream. Este método
				 * significa que puedes enviar el mismo objeto al flujo varias veces, y cada vez
				 * se tratará como un objeto nuevo
				 */
				oos.writeUnshared(new Persona("Adolfo", "Martín", new Mascota("Picas", 4), 20));
				oos.writeUnshared(new Persona("Rubén", "Hidalgo", new Mascota("Durazno", 0), 18));
				oos.writeUnshared(instancia.p3);
				oos.writeUnshared(instancia.p4);
				oos.writeUnshared(instancia.p5);
				System.out.println("Insertados los 5 primeros objetos, ahora se cierra el fichero.");

			} catch (IOException e) {
				System.err.println("Error de Escritura :" + e);
			}

		}

		public void escribir5siguentesObjetos() { // No sobreescribe
			try (MyObjectOutputStream moos = new MyObjectOutputStream(new FileOutputStream("ListaObjetos.dat", true))) {

				System.out.println("Escribiendo los 5 siguentes objetos en el fichero...");

				moos.writeUnshared(new Persona("Javier", "Pallares", new Mascota("Medusa", 8), 21));
				moos.writeUnshared(new Persona("José", "Rueda", new Mascota("Durazno", 0), 24));
				moos.writeUnshared(instancia.p8);
				moos.writeUnshared(instancia.p9);
				moos.writeUnshared(instancia.p10);
				System.out.println("Insertados los 5 siguentes objetos sin crear cabeceras extra\n");
			} catch (IOException e) {
				System.err.println("Error de Escritura :" + e);
			}

		}

		public void leerFichero() {
			try (MyObjectInputStream ois = new MyObjectInputStream(new FileInputStream("ListaObjetos.dat"))) {
				for (;;) {
					try {
						Persona p1 = (Persona) ois.readUnshared();
						System.out.println(p1);
					} catch (ClassNotFoundException e) {
						System.err.println("Error, el fichero no se ha encontrado: " + e);
					}
				}
			} catch (EOFException e) {
				System.err.println("Error, has llegado al final del fichero: " + e);
			} catch (IOException e) {
				System.err.println("Error de lectura: " + e);
			}
		}
	}
}
