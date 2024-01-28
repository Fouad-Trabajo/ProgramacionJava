package practicaTema4;

import java.util.Scanner;

public class Ej03Array2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numAnterior = Integer.MIN_VALUE; // Válor más alto que puede tomar un int

		// Instancia de array
		int[] numEnteros = { 5, 6, 7, 4}; // Array de 5 elementos

		// 2nd forma de instanciar un array
		int[] numeros = new int[5];

		boolean orden = false;
		System.out.println("Ordenado-De menor a mayor (1,2,5,9,12,36..)");
		// Imprimir array
		for (int i = 0; i < numEnteros.length; i++) {
			System.out.print(numEnteros[i] + " ");
			if (numEnteros[i] > numAnterior) {
				orden = true;
			}
			numAnterior = i;
		}
		System.out.println(); // Salto de línea
		if (orden == true) {
			System.out.println("El array está ordenado");
		} else {
			System.out.println("El array no está ordenado");
		}
		sc.close();
	}

}
