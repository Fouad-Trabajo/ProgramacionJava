package fouad.personal.dam.tema4;

import java.util.Scanner;

public class Ej03Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declarar - instanciar un array de 8 elementos
		int[] enteros = { 10, 20, 30, 40, 50, 60, 70, 40 };
		// El último indice está en la posición(índice) 7 pero es el octavo número: [7]==8

		// Suponemos que ordenado es de menor a mayor valor

		//Imprimir el array
		System.out.println("ARRAY DE 8 ELEMENTOS");
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Enteros [" + i + "] es " + enteros[i]);
		}
		
		
		System.out.println("----------------------");
		int numAnterior = 0;
		for (int num : enteros) {
			if (num > numAnterior) {
				
				System.out.println("El array está ordenado");
			} else {
				System.out.println("El array no está ordenado");
			}
			numAnterior = num;
			
		}
		
		sc.close();
	}

}
