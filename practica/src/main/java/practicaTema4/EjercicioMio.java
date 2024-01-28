package practicaTema4;

import java.util.Scanner;

public class EjercicioMio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Instancia de array
		int[] enteros = { 3, 2, 7, 0, 5, 3, 4, 2, 0, 5 };

		System.out.println("ARRAY DE 10 ELEMENTOS");
		// Imprimir array
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");

		}
		System.out.println("\n"); // 2 saltos de línea

		int num;
		// Pedir al usuario un índice del array
		do {
			System.out.print("Introduce un índice del array: ");
			num = sc.nextInt();
			while (num >= enteros.length || num < 0) {
				System.out.print(
						"Has introducido un índice que no se encuentra en el array, introduce un índice válido: ");
				num = sc.nextInt();
			}

		} while (num > enteros.length || num < 0);

		// Imprimir elemento del índice
		System.out.println("En el índice " + num + " se encuentra el elemento: " + enteros[num]);

		sc.close(); // Cierre del scanner

	}

}
