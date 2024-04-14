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
	Path aux = Paths.get(RUTA + "aux.bin");

	public static void main(String[] args) {
		// Declaramos una lista de tipo plantas para luego guardalo en el fichero
		List<Planta> plantas = new ArrayList<>(); // Vamos a serializar esta coleccion

		// Actualizar vivero
		Init.actualizarLista_Fichero(original);
		Init.imprimirVivero_lista_fichero();
		// Imprimir_vivero

	}

	public static void actualizarLista_Fichero(Path original) {

		// Introducir objetos de tipo Planta en la lista
		List<Planta> listaPlantas = new ArrayList<>();
		try (InputStream is = Files.newInputStream(original); ObjectInputStream ois = new ObjectInputStream(is)) {
			// Acciones que va ha hacer el try pero no están en observación
			System.out.println("Comienzo de la lectura...");

			for (;;) { // bucle infinito - while true
				try {
					listaPlantas.add((Planta)ois.readObject()); // Casting

					// Estos cath están al mismo nivel, no están anidados
				} catch (EOFException e) { // Esto sobraría la verdad
					System.err.println("Fin de la lectura");
					break; // Esto es para detener el bucle
				} catch (ClassNotFoundException e) {
					System.out.println("Error, clase no encontrada");
					break;
				}
			}

		} catch (IOException e) { // Se puede poner así o simplemente poner el padre
									// "Exception"
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
		System.out.println("He actualizado los precios");

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

	public static void imprimirVivero_lista_fichero() {
		try (InputStream is = Files.newInputStream(original); ObjectInputStream ois = new ObjectInputStream(is);)

		{
			while(true) { //Bucle infinito
				try {
					Planta planta = (Planta) ois.readObject();
					System.out.println(planta);
				} catch (EOFException e) {
					System.err.println("Fin de la lectura");
					break;
				}catch (ClassNotFoundException e) {
					System.err.println("Error, clase no encontrada");
					break;
				}
				
				// is.close(); no hace falta cerrar los objetos de lectura, poruqe se encarga de hacerlo el try
				// ois.close();
			}

			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
