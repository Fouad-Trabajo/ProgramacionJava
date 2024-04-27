package ficheros.ejercicios;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args){

		NumerosReales numerosReales = new NumerosReales();
		numerosReales.readNumbers();
		
	}

	// Inerit class
	private static class NumerosReales {
		
		// Método 1
		public void readNumbers() {
			try (FileReader numerosLeer = new FileReader("NumerosReales.txt");
					Scanner scanner = new Scanner(numerosLeer)) { // Try-With-Resources a partir de java 7

				int contador=0;
				double b=0, suma = 0,media = 0;

				System.out.println("Los números que he econtrado en el fichero son: ");
				while (scanner.hasNext()) { // Si no tiene siguiente, se para la lectura
					b = scanner.nextDouble();
					System.out.print(b + " ");
					suma += b; // suma
					contador++;
					media = suma / contador; // media aritmética

				}

				System.out.println("\nLa suma de los números es: " + suma);
				System.out.println("La media aritmética de los números es: " + media);
				

				// Excepciones que saltan a la hora de leer un fichero
			} catch (EOFException e) {
				System.err.println(e);
			} catch (FileNotFoundException e) {
				System.err.println("Error loco " + e);
			}

			catch (IOException e) {
				System.err.println(e);
			}

		}

	}

}
