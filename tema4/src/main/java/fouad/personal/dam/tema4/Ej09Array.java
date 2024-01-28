package fouad.personal.dam.tema4;

import java.util.*;

public class Ej09Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matriz = { { 5, 9, 10 }, { 7, 0, 12 }, { 3, 1, 8 } };
		int[] sumaFilas = new int[3];
		int[] sumaColumnas = new int[3];

		// Imprimir array multidimensional
		System.out.println("ARRAY MULTIDIMENSIONAL");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]" + "=" + matriz[i][j] + " ");
			}
			System.out.println(); // Salto de línea
		}
		/*
		 * Como es una matriz y es cuadrada, se puede poner j<matriz[0], si cada array
		 * tuviera una longitud distinta, pues se pone j<matriz[i]
		 */

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sumaFilas[i] = sumaFilas[i] + matriz[i][j];
				sumaColumnas[j] = sumaColumnas[j] + matriz[i][j];
			}
		}

		System.out.println("Suma de filas:");
		for (int i = 0; i < sumaFilas.length; i++) {
			System.out.println(sumaFilas[i]);
		}

		System.out.println("Suma de columnas:");
		for (int i = 0; i < sumaColumnas.length; i++) {
			System.out.print(sumaColumnas[i]+ " ");
		}

		
		

		
		sc.close();

	} //Cierre del main
	
	

}
