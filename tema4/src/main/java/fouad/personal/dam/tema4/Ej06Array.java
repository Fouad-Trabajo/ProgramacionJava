package fouad.personal.dam.tema4;

import java.util.*; //Importada clase scanner y random

public class Ej06Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num=0, max = Integer.MIN_VALUE;// Menor valor de que puede tener un int
		
		// Declaración-Instancia array
		int[] ArrayEnteros = { 4, 9, 7, -8, 1, -3 }; //Array de 6 elementos

		//Imprimir elementos array
		for (int i = 0; i < ArrayEnteros.length; i++) {
				System.out.print(ArrayEnteros[i] + " ");
		}System.out.println("<-- Elementos del array"); // Salto de línea

		//Imprimir índices del array
		for(int j=0;j<ArrayEnteros.length;j++) {
			System.out.print(j + " ");
		}
		System.out.println("<-- Indice del array");
		sc.close();

	}

}
