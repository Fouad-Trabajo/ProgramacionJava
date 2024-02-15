package examenTema4Practica;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaración de array
		int[] numEnteros = { 3, 5, 10, 5, 2, 5, 9, 11, 2, 6, 4, 3, 0, 9, 44, 5, 1, 18, 20, 11 };
		int contador = 0;

		System.err.println("ARRAY");
		for (int i = 0; i < numEnteros.length; i++) {
			System.out.println("numEnteros[" + i + "]: " + numEnteros[i]);
		}

		System.out.print("\nIntroduce un número: ");
		int numero = input.nextInt();

		for (int i = 0; i < numEnteros.length; i++) {
			if (numero == numEnteros[i]) {
				contador++;
			}
		}

		if (contador == 0) {
			System.out.println("El número " + numero + " no aparece en el array");
		} else {
			System.out.println("El número " + numero + " se repite " + contador + " veces");
		}

		input.close();

	}

}
