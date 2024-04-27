package ficheros.ejercicios;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4_2 {

	public static void main(String[] args) throws IOException {

		NumerosReales numerosReales = new NumerosReales();

		try {
			numerosReales.writeNumbers();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		numerosReales.readNumbers();

	}

	// Inerit class
	private static class NumerosReales {

		static Scanner input = new Scanner(System.in);
		static int n;

		// Método 1
		public void writeNumbers() throws IOException { // Esta es otra forma de capturar una excepción

			try (FileWriter numerosEscribir = new FileWriter("NumerosReales2.txt");) {

				System.out.print("¿Cúantos números quieres introducir en el fichero?: ");
				n = input.nextInt();

				for (int i = 0; i < n; i++) {
					System.out.print("> ");
					int num = input.nextInt();
					// String numeros=String.valueOf(num + " ");
					numerosEscribir.write(num + " "); // Esto de aquí es lo mismo que la línea de arriba
					// Estoy guardando los números como si fueran una cadena de texto
				}

			}

			input.close();
		}

		// Método 2
		public void readNumbers() {
			try (FileReader numerosLeer = new FileReader("NumerosReales2.txt");
					Scanner scanner = new Scanner(numerosLeer)) { // Try-With-Resources

				int b = 0, suma = 0;
				double media = 0;

				System.out.println("Los números que he econtrado en el fichero son: ");
				while (scanner.hasNext()) { //Si no tiene siguiente, se para la lectura
					b = scanner.nextInt();
					System.out.print(b + " ");
					suma += b; // suma

					media = (double) suma / n; // media aritmética

				}

				System.out.println("\nLa suma de los números es: " + suma);
				System.out.println("La media aritmética de los números es: " + media);
				scanner.close();

				// Excepciones que saltan a la hora de leer un fichero
			} catch (EOFException e) {
				System.err.println(e);
			} catch (FileNotFoundException e) {
				System.err.println(e);
			}

			catch (IOException e) {
				System.err.println(e);
			}

		}

		// Esto forma no funciona, poruqe me hace las operaciones con los números asociados a
		// la tabla ASCII
		public void readNumbers1() {
			try (FileReader numerosLeer = new FileReader("NumerosReales2.txt")) {

				int b = 0, suma = 0;
				double media = 0;

				System.out.println("Los números que he econtrado en el fichero son: ");
				while (b != -1) {
					b = numerosLeer.read();
					System.out.print((char) b);
					suma += b; // suma
					media = suma / n; // media aritmética

				}

				System.out.println("\nLa suma de los números es: " + suma);
				System.out.println("La media aritmética de los números es: " + media);

			} catch (FileNotFoundException e) {
				System.err.println(e);
			}

			catch (IOException e) {
				System.err.println(e);
			}

		}

	}

}
