package fouad.personal.dam.tema4;

import java.util.*; // Aquí tenemos importado el scanner y el random

public class Ej07Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("ARRAY ALEATORIO DE 50 ELEMENTOS");

		// Constante
		final int TOTAL_ELEMENTOS = 5;

		// Crear array de 100 primeros números
		int[] enteros = new int[TOTAL_ELEMENTOS];

		// Imprimir array de números aleatorios entre 1 y 100
		for (int k = 0; k < enteros.length; k++) {
			enteros[k] = rand.nextInt(10) + 1; // también se puede poner .nextInt(1.101);
			System.out.print(enteros[k] + " ");
		}

		// Imprimir los números que no estén en ese array
		System.out.println(" \nNÚMEROS QUE NO ESTÁN EN EL ARRAY");
		for (int i = 1; i <= 10; i++) { // Este bucle recorre los 100 primeros números
			boolean estar = false; // Restablecer variable orden a true al inicio de caba vuelta
			for (int j = 0; j < enteros.length; j++) {
				if (i == enteros[j]) {
					estar = true;	// Si la variable es true, quiere decir que el num
					break;
				}
			}
			if (!estar) { // Si el variable es false, quiere decir que el num no está en el array
				System.out.print(i + " ");
			}
		}
		sc.close();

	}

}
