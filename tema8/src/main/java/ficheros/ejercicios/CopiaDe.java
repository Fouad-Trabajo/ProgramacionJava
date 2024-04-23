package ficheros.ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class CopiaDe {

	private static final String RUTA = "C:/Users/Fouad/Desktop/";

	public static void main(String[] args) {
		/*
		 * EJERCICIO COPIA
		 * 
		 * Escribir un programa que duplique el contenido de un fichero cuyo nombre se
		 * pide al usuario.
		 * 
		 * El fichero Copia tendrá el mismo nombre con el prefijo “copia_de_”
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre del fichero: ");
		String nombre = sc.nextLine();

		try (FileInputStream fis = new FileInputStream(RUTA + nombre);
				ObjectInputStream oos = new ObjectInputStream(fis)) {
			String holaString = (String) oos.read();
			System.out.println("Comienzo de la escritura");
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}

	}

	public static class copia {

		public void fichero(String nombre) {

		}
	}

}
