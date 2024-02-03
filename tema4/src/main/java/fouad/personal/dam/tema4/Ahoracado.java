package fouad.personal.dam.tema4;

import java.util.Scanner; //Puedo poner * para importar todas las clases/bibliotecas que necesite

public class Ahoracado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("___: !!!AHORCADO!!! :____");

		String opcionMinus;
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

				// Pedir al usuario una letra
				System.out.print("Introduce una letra: ");
				char letra = input.next().charAt(0); // Pedir un String y quedarme con la letra que ocupa posión 0
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

				if (palabra.length != raya.length) {
					comparacion = false;
				} else {
					for (int i = 0; i < palabra.length; i++) {
						if (palabra[i] != raya[i]) {
							comparacion = false;
							break;
						}
					}
				}
				if (comparacion) {
					System.out.println("Felicidades, has ganado la palabra es: [" + palabraAdivinada + "]");
					System.out.println("Intentos: " + (intento + 1)); // Imprimir intentos del usuario
					break;
				} // Fin de la comparacion de ambos arrays

				intento++;

				// Detener el juego si el usuario pierde
				if (intento == 7) {
					System.out
							.println("No lo has conseguido. SadMonkey :( \nLa palabra era: [" + palabraAdivinada + "]");
					System.out.println("Intentos: " + intento); // Imprimir intentos del usuario
				}
			} while (intento < 7); // Fin del bucle DO-While

			// --------------------------------------------------------------------------

			// Preguntarle al usuario si quiere volver a jugar
			System.out.print("¿Quieres volver a jugar? (yes/no): ");
			String opcion = input.next();
			opcionMinus = opcion.toLowerCase(); // Convierto a minusculas la opción del usuario

			do {
				System.out.print("Has introducido un valor erroneo, ¿Quieres volver a jugar? (yes/no): ");
				opcionMinus = input.next();
				if (opcionMinus.equals("yes")) {
					System.out.println("Aquí debería poner algo pero no se lo que és, quizá otro do-while");

				} else if (opcionMinus.equals("no")) {
					System.out.println("Programa cerrado");
					break; // Salir del bucle
				}

			} while (!opcionMinus.equals("yes") && !opcionMinus.equals("no"));

		} while (opcionMinus.equals("yes"));

		input.close(); // Cierre del scanner
	} // Cierre main

}
