package practicaTema4;

import java.util.Scanner;

public class Ej02Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Instanciar array
		int[] arrayUsuario = new int[10];

		/*
		 * Inicializar las variables max y min con los valores más pequeño y más grande
		 * que puede tener un int, respectivamente(están al revés a posta)
		 */
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		/*
		 * Inicializar los índices del valor máximo y mínimo con -1 (un valor que no
		 * puede ser un índice válido dentro de un array), Los índices van desde el 0 en
		 * adelante
		 */
		int indiceMax = -1, indiceMin = -1;

		// Bucle para pedirle al usuario 10 números
		System.out.println("Introduce el elemento que está en el:");
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.print("Indice [" + i + "]: ");
			int num = sc.nextInt();
			arrayUsuario[i] = num;
		}

		System.out.println("ARRAY DE NÚMERO INTRODUCIDOS POR EL USUARIO");
		for (int i = 0; i < arrayUsuario.length; i++) {
			System.out.print(arrayUsuario[i] + " ");
			// Este bucle es para imprimir los elemetos del array
			if (arrayUsuario[i] > max) {
				max = arrayUsuario[i];
				indiceMax = i;
			}
			if (arrayUsuario[i] < min) {
				min = arrayUsuario[i];
				indiceMin = i;
			}
		}
		System.out.println("<---- Elementos del array"); // Salto de línea

		for (int j = 0; j < arrayUsuario.length; j++) {
			System.out.print(j + " ");
			// Esto bucle es para imprimir los índices del array
		}
		System.out.println("<---- Indices del array");

		// MAX Y MIN: IMPRESIÓN
		System.out.println("El máximo es " + max + " y ocupa el índice: " + indiceMax);
		System.out.println("El minímo es " + min + " y ocupa el índice: " + indiceMin);

		sc.close();
	}
}
