package ficheros.ejercicios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		FicheroNumeros ficheroNumeros = new FicheroNumeros();
		ficheroNumeros.escribirFicheroOriginal();
		ficheroNumeros.leerFicheroOriginal_EscribirFicheroCopia();
		ficheroNumeros.leerFicheroCopia();

	}

	// Clase interna
	private static class FicheroNumeros {

		static Scanner input = new Scanner(System.in);
		static int num = 0;

		public void escribirFicheroOriginal() {
			System.out.println("Introduce un número entero positivo (-1 para terminar): ");

			try (FileOutputStream fos = new FileOutputStream("C:/Users/Fouad/Desktop/numeros.dat");
					ObjectOutputStream ois = new ObjectOutputStream(fos)) {

				do {
					System.out.print("> ");
					num = input.nextInt();
					if (num >= 0) {
						ois.writeInt(num);
					} else if (num == -1) {
						System.out.println("Cierre");
					} else {
						System.out.println("Error, número negativo introducido");
					}
				} while (num != -1);

			} catch (IOException e) {
				System.out.println(e);
			}
		} // Cierre método 1

		public void leerFicheroOriginal_EscribirFicheroCopia() {

			System.out.print("Los números escritos en el archivo (numeros.dat) son: ");

			try (FileInputStream fis = new FileInputStream("C:/Users/Fouad/Desktop/numeros.dat");
					ObjectInputStream ois = new ObjectInputStream(fis);

					/*
					 * Aquí hay 2 flujos, 1 de entrada de datos del fichero original y otro de
					 * salida hacia el fichero copia
					 */

					FileOutputStream fos = new FileOutputStream("C:/Users/Fouad/Desktop/numerosCopia.dat");
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {

				try {
					int digito;
					while ((digito = ois.readInt()) != -1) {
						System.out.print(digito + " ");

						// Escribir en el fichero copia
						oos.writeInt(digito);

					} // Cierre del while
				} catch (EOFException e) {
					System.out.println(e);
				}

			} catch (IOException e) {
				System.out.print(e + " ");
			}

			input.close();
		} // Cierre método 2

		public void leerFicheroCopia() {

			System.out.print("Los números escritos en el archivo (numerosCopia.dat) son: ");
			try (FileInputStream fis = new FileInputStream("C:/Users/Fouad/Desktop/numerosCopia.dat");
					ObjectInputStream ois = new ObjectInputStream(fis)) {

				try {
					int digito;
					while ((digito = ois.readInt()) != -1) {
						System.out.print(digito + " ");
					}
				} catch (EOFException e) {
					System.out.println(e);
				}
			} catch (IOException e) {
				System.out.print(e + " ");
			}
		}// Cierre método 3

	}

}
