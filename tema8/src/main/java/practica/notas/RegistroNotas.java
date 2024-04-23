package practica.notas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RegistroNotas {

	public static void main(String[] args) {

		Notas notas = new Notas();

		notas.registrarNotas();
		// notas.consultarNotaPorNombreDeEstudiante();
		notas.consultarNotas();
		notas.promedioNotas();

	}

	private static final String RUTA = "C:/Users/Fouad/Desktop/notas.txt";

	private static final String NOMBRE = "Fouad"; // Si quieres consultar la nota de otro alumno,cambia el nombre

	// Clase interna
	static class Notas {

		public void registrarNotas() { // Meter notas en el sistema (fichero)
			try (FileOutputStream fos = new FileOutputStream(RUTA);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				System.out.println("Escribiendo notas de estudiantes...");
				oos.writeObject(new Estudiante(1, "Rubén", "García", 5, 4, 9, 10, 4.70, 8.0));
				oos.writeObject(new Estudiante(2, "Fouad", "Aharchi", 10, 5, 7, 9.8, 8, 7.5));
				oos.writeObject(new Estudiante(3, "María", "Hernandez", 0, 3, 2, 7, 8.8, 9));
				oos.writeObject(new Estudiante(4, "Marcos", "Perrino", 7, 2, 1, 9, 8.4, 6.6));
				oos.writeObject(new Estudiante(5, "Lucía", "Gutierrez", 8, 4.2, 6.9, 7, 5.2, 4));
				oos.writeObject(new Estudiante(6, "Alba", "Torecilla", 8, 1.2, 7, 9, 6.75, 8));

			} catch (IOException e) {
				System.out.println(e);
			}
		}

		public void consultarNotas() { // Imprimir todas las notas

			try (FileInputStream fis = new FileInputStream(RUTA); ObjectInputStream ois = new ObjectInputStream(fis)) {

				System.out.println("Comienzo de la lectura: ");
				while (true) {
					try {
						Estudiante e1 = (Estudiante) ois.readObject();
						System.out.println(e1.toString());
					} catch (EOFException e) {
						System.out.println(e);
						break;
					} catch (ClassNotFoundException e) {
						System.out.println(e);
						e.printStackTrace();
						break;
					}
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}

		public void consultarNotaPorNombreDeEstudiante() { // Imprimir 1 nota en concreto
			try (FileInputStream fis = new FileInputStream(RUTA); ObjectInputStream ois = new ObjectInputStream(fis)) {
				System.out.println("Estoy leyendo solo este objeto mediante coincidencia con el nombre");

				for (;;) {

					try (Estudiante e1 = (Estudiante) ois.readObject();) {
						if (e1.getNombre().equals(NOMBRE)) {
							System.out.println(e1);
						}
					} catch (EOFException e) {
						System.err.println(e);
						break;
					} catch (IOException e) {
						System.err.println(e);
						break;
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void eliminarNota() {

		}

		public void eliminarNotas() {

		}

		public void promedioNotas() {
			try (FileInputStream fis = new FileInputStream(RUTA); ObjectInputStream ois = new ObjectInputStream(fis)) {
				System.out.println("Media de las notas:");

				for (;;) {

					try (Estudiante e1 = (Estudiante) ois.readObject();) {

						System.out.println("Media de " + e1.getNombre() + ": " + 
						(e1.getMatematicas() + e1.getLengua() + e1.getHistoria() + e1.getBiología() 
						+ e1.getInglés() + e1.getReligión()) / 6);

					} catch (EOFException e) {
						System.err.println(e);
						break;
					} catch (IOException e) {
						System.err.println(e);
						break;
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
