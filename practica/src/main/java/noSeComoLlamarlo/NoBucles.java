package noSeComoLlamarlo;

import java.util.Scanner;

public class NoBucles {

	public static void main(String[] args) {
		/**
		 * Imprimir los número de 1 a N sin usar bucles(while, for, do-while)
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Hasta donde quieres imprimir: ");
		int n = input.nextInt();
		
		//Llamada al método recursivo
		imprimirNumerosRecursivamente(1, n);

	}

	public static void imprimirNumerosRecursivamente(int c, int n) {
		if (c <= n) {
			System.out.println(c);
			imprimirNumerosRecursivamente(c + 1, n); //recursividad del método
		}

	}

}
