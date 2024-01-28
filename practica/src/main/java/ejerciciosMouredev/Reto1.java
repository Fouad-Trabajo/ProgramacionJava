package ejerciciosMouredev;

public class Reto1 {

	/*
	 * ENUNCIADO Escribe un programa que muestre por consola (con un print) los
	 * números de 1 a 100 (ambos incluidos y con un salto de línea entre cada
	 * impresión), sustituyendo los siguientes: - Múltiplos de 3 por la palabra
	 * "fizz". - Múltiplos de 5 por la palabra "buzz". - Múltiplos de 3 y de 5 a la
	 * vez por la palabra "fizzbuzz".
	 */

	public static void main(String[] args) {

		// PRIMER FORMA DE HACERLO CON IF
		// Imprimir los 100 primeros números
		for (int i = 1; i <= 100; i++) {

			if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.println("fizzbuzz");
				continue; // Esto es para saltar el valor y seguir con el siguente
			}
			if ((i % 3) == 0) {
				System.out.println("fizz");
				continue;
			}

			if ((i % 5) == 0) {
				System.out.println("buzz");
				continue;
			}
			System.out.println(i);

		} // for de al 1 forma

		// SEGUNDA FORMA DE REALIZARLO CON VARIABLES BOOLEANAS

		for (int i = 1; i <= 100; i++) {
			boolean div3 = ((i % 3) == 0);
			boolean div5 = ((i % 5 == 0));
			if (div3 && div5) {
				System.out.println("fizzbuzz");
			} else if (div3) {
				System.out.println("fizz");
			} else if (div5) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		} // for de la 2 forma

	} // Cierre del main

}
