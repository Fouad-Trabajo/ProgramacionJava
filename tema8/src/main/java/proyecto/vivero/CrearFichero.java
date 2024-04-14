package proyecto.vivero;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CrearFichero { // Integer es una clase envolvente

	private static final String RUTA = "C:/Users/Fouad/Desktop/";

	public static void main(String args[]) throws ArithmeticException { // Eso significa que puede lanzar una excepción
		Crear creando = new Crear();
		creando.escrituraLectura();

		Path file = Paths.get(RUTA + "plantas.bin");

		try (OutputStream os = Files.newOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(os);) {
			// Se somete a observación este pedazo de código dentro del try

			/*
			 * También se puede poner dentro del OutputStream
			 * C:/Users/Fouad/Desktop/plantas.bin
			 */

			System.out.println("Comienzo a escribir el fichero...");
			oos.writeObject(new Planta(1, "Camelia", "Camellia japonica", 9.95, 28));
			oos.writeObject(new Planta(2, "Mimosa", "Acacia dealbata", 9.95, 16));
			oos.writeObject(new Planta(3, "Hortensia", "Hydrangea macrophylla", 19.5, 4));
			oos.writeObject(new Planta(4, "Acebo", "Ilex Aquifolium", 18, 55));
			oos.writeObject(new Planta(5, "Lirio", "Iris germanica", 3, 36));
			oos.writeObject(new Planta(6, "MadreSelva", "Loricena japonica", 2.25, 40));
			oos.writeObject(new Planta(7, "Cala", "Zantedschia", 8.90, 9));
			oos.writeObject(new Planta(8, "Tejo", "Taxus", 16.5, 5));
			oos.writeObject(new Planta(9, "Romero", "Salvia", 4.5, 68));
			oos.writeObject(new Planta(10, "Azalea", "ubducyn", 10, 20));

			// Cerramos los objetos de tipo escritura
			os.close();
			oos.close();

		} catch (Exception e) { // Na má cerrar el try, se abre el catch
			System.out.println(e);
			e.printStackTrace(); // Imprimir la pila de errores que se ha ido acumulando
		}

	}

	static class Crear {
		Planta planta = new Planta(0, null, null, 0, 0);

		public void escrituraLectura() {
			try {
				// Flujo de salida
				ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(
						new FileOutputStream("C:/Users/Fouad/Desktop/ArrayObjetos.bin"));
				escribiendo_fichero.writeObject(planta);
				escribiendo_fichero.close();

				// Flujo de entrada
				ObjectInputStream recuperando_fichero = new ObjectInputStream(
						new FileInputStream("C:/Users/Fouad/Desktop/ArrayObjetos.bin"));
				Planta planta_recuperada = (Planta) recuperando_fichero.readObject(); // Casting
				recuperando_fichero.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
