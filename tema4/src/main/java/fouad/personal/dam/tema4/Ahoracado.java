package fouad.personal.dam.tema4;

import java.util.Scanner;

public class Ahoracado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("___: !!!AHORCADO!!! :____");

		String opcionMinus; // Declaración variable de String minúsculas
		do {
			// Instancia de array unidimensional de tipo String
			char[] palabra = { 'm', 'e', 's', 'a' }; // Array de palabra escondida
			char[] raya = { '_', '_', '_', '_' }; // Array de rayitas en el suelo

			System.out.println("Adivina la palabra -- Tienes 7 intentos");

			int intento = 0; // Variable para contar los intentos del usuario

			do {
				// Imprimir rayitas en el suelo
				for (int j = 0; j < raya.length; j++) {
					System.out.print(raya[j] + " ");
				}
				System.out.println(); // Salto de línea

				System.out.print("Introduce una letra: ");
				char letra = input.next().charAt(0); // Pedir un String y quedarme con la letra que ocuapa posición 0
				char letraMinuscula = Character.toLowerCase(letra);
				// Recorrer el array palabra e imprimir letra si coincide
				for (int i = 0; i < palabra.length; i++) {
					if (letraMinuscula == palabra[i]) {
						raya[i] = letraMinuscula;
					}
				}
				// Declarar variable que crea una cadena (String) a partir del array de char
				String palabraAdivinada = new String(palabra);

				/*
				 * DETENER EL JUEGO SI EL USUARIO GANA Para eso debo comparar ambos arrays, y si
				 * coninciden, significa que el usuario ha encontrado la palabra escondida
				 */

				boolean comparacion = true;

				// COMPARACIÓN DE AMBOS ARRAYS (SIN UTILIZAR LA CLASE ARRAYS)
				if (palabra.length != raya.length) { // Primero comparo ambas longitudes de los arrays
					comparacion = false;
				} else {
					for (int i = 0; i < palabra.length; i++) { // Segundo comparo índice por índice de cada array
						if (palabra[i] != raya[i]) {
							comparacion = false;
							break;
						}
					}
				} 
				if (comparacion==true) {
					System.out.println("Felicidades, has ganado la palabra es: [" + palabraAdivinada + "]");
					System.out.println("Intentos: " + (intento + 1));
					break;
				} // Fin de la comparacion de ambos arrays

				intento++;

				// Detener el juego si el usuario pierde
				if (intento == 7) {
					System.out.print("No lo has conseguido. SadMonkey :( \nLa palabra era: [" + palabraAdivinada + "]");
					System.out.println("\nIntentos: " + intento);
				}
			} while (intento < 7); // Fin del segundo Do-While

			/* -------------------------------------------------------------------------- */

			// Preguntarle al usuario si quiere volver a jugar
			System.out.print("¿Quieres volver a jugar? (yes/no): ");
			opcionMinus = input.next().toLowerCase(); // Convierto a minusculas la opción del usuario

			while (!opcionMinus.equals("yes") && !opcionMinus.equals("no")) {
				System.out.print("Has introducido un valor erroneo, ¿Quieres volver a jugar? (yes/no): ");
				opcionMinus = input.next().toLowerCase(); // Convierto a minusculas la opción del usuario
			}

			if (opcionMinus.equals("no")) {
				System.out.println("Programa cerrado.");
				break;
			}

		} while (opcionMinus.equals("yes")); // Fin del primer Do-While

		input.close(); // Cierre del Scanner
	}
}
