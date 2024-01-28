package practicaTema4;

import java.util.Scanner;

public class Ej01Array {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Inicializar un array-Declarar un array
		int[] enteros = { 5, 7, 9, 3, 4, 5, 3, 9, 4, 3, 6, 4, 2, 8, 1, 3, 6, 7, 9, 5 };
		/*
		 * Array de 20 elementos. El último elemento recibe el índice 19 y el primer
		 * elemento recibe el índice 0
		 */
		System.out.println("ARRAY DE 20 ELEMENTOS");
		// Recorrer el array e imprimirlo
		for (int j = 0; j < enteros.length; j++) {
			for (int i = 0; i < enteros.length; i++) {
				System.out.print(enteros[i] + " ");
			}
			System.out.println(); // Esto es un salto de línea después de imprimir una línea de array
		}
		System.out.println("Acabo de imprimir un cuadrado de array, 20 filas, 20 columnas jajajaj");
		System.err.println("-----------------------------------------------");

		// for-each para recorrer el array y cada elemento se asigna a una variable
		for (int digito : enteros) {
			System.out.print(digito + " ");
		}

		System.out.print("\nPor favor, introduce un número entero: ");
		int num = sc.nextInt();

		// 1ª forma de hacerlo
		System.err.println("1ª forma de hacerlo");
		int contador = 0;
		for (int digito : enteros) {
			if (num == digito) {
				contador++;
			}
		}
		System.out.println("El número " + num + " se repite " + contador + " veces");

		// 2ª forma de hacerlo
		System.err.println("2ª forma de hacerlo");
		for (int h = 0; h < enteros.length; h++) {
			if (num == enteros[h]) {
				contador++;
			}
		}
		System.out.println("El número " + num + " se repite " + contador + " veces");
		System.out.println("Este ejercicio está incompleto, falta saber porque el 2nd método está mal");
		sc.close();
	}

}
