package proyecto.vivero;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Init {

	private static final String RUTA = "C:/Users/Fouad/Desktop/";

	static Path original = Paths.get(RUTA + "plantas.bin");
	static Path aux = Paths.get(RUTA + "aux.bin");

	public static void main(String[] args) {
		CrearFichero creado = new CrearFichero();
		creado.main(args);

		// Actualizar vivero
		actualizar_Fichero(original, aux);

		// Imprimir_vivero
		imprimirVivero_fichero(aux);

	}

	public static void actualizar_Fichero(Path original) {

		// Introducir objetos de tipo Planta en la lista
		List<Planta> listaPlantas = new ArrayList<>();
		try (InputStream is = Files.newInputStream(original); ObjectInputStream ois = new ObjectInputStream(is)) {
			// Acciones que va ha hacer el try pero no están en observación
			System.out.println("Comienzo de la lectura...");

			for (;;) { // bucle infinito - while true
				try {
					listaPlantas.add((Planta) ois.readObject()); // Casting

					// Estos cath están al mismo nivel, no están anidados
				} catch (EOFException e) { // Esto sobraría la verdad
					System.err.println("Fin de la lectura");
					break; // Esto es para detener el bucle
				} catch (ClassNotFoundException e) {
					System.out.println("Error, clase no encontrada");
					break;
				}
			}

		} catch (IOException e) {

			System.err.println(e);
			e.printStackTrace(); // Pila de excepciones imprimibles
		}

		// Actualizar precio
		for (Planta p : listaPlantas) {
			if (p.getCantidad() < 10) {
				p.setPrecio(p.getPrecio() * 0.8); // 20% descuento
			} else if (p.getCantidad() <= 50) { // Coje la cantidad entre 50 y 10 incluidos
				p.setPrecio(p.getPrecio() * 0.7);
			} else { // planta.getCantidad()>50
				p.setPrecio(p.getPrecio() * 0.6); // 40% descuento
			}
		}
		System.out.println("He actualizado los precios pero no están metidos en en el fichero todavía");

		// Meter los objetos cambiados nuevamente en la lista
		try (OutputStream os = Files.newOutputStream(original); ObjectOutputStream oos = new ObjectOutputStream(os);)

		{
			System.out.println("Comienzo de la escritura de los objetos con el precio cambiado");
			for (Planta planta : listaPlantas) {
				oos.writeObject(planta);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Sobrecargar método
	public static void actualizar_Fichero(Path original, Path aux) {

		try (InputStream is = Files.newInputStream(original);
				ObjectInputStream ois = new ObjectInputStream(is);
				OutputStream os = Files.newOutputStream(aux);
				ObjectOutputStream oos = new ObjectOutputStream(os)) {
			// Acciones que va ha hacer el try pero no están en observación
			System.out.println("Comienzo de la lectura...");

			for (;;) { // bucle infinito - while true
				try {
					Planta p1 = (Planta) ois.readObject();
					if (p1.getCantidad() < 10) {
						p1.setPrecio(p1.getPrecio() * 0.8); // 20% descuento
					} else if (p1.getCantidad() <= 50) { // Coje la cantidad entre 50 y 10 incluidos
						p1.setPrecio(p1.getPrecio() * 0.7);
					} else { // planta.getCantidad()>50
						p1.setPrecio(p1.getPrecio() * 0.6); // 40% descuento
					}

					oos.writeObject(p1);

					// Estos cath están al mismo nivel, no están anidados
				} catch (EOFException e) { // Esto sobraría la verdad
					System.err.println("Fin de la lectura del fichero auxiliar");
					break; // Esto es para detener el bucle
				} catch (ClassNotFoundException e) {
					System.out.println("Error, clase no encontrada");
					break;
				}
			}

		} catch (IOException e) {

			System.err.println(e);
			e.printStackTrace(); // Pila de excepciones imprimibles
		}
	}

	// Método imprimir vivero(fichero)
	public static void imprimirVivero_fichero(Path file) {
		try (InputStream is = Files.newInputStream(file); ObjectInputStream ois = new ObjectInputStream(is);)

		{
			while (true) { // Bucle infinito
				try {
					Planta planta = (Planta) ois.readObject();
					System.out.println(planta);
				} catch (EOFException e) {
					System.err.println("Fin de la lectura");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("Error, clase no encontrada");
					break;
				}

				// no hace falta cerrar los objetos de lectura, porque se encarga el try
				// is.close();
				// ois.close();
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
