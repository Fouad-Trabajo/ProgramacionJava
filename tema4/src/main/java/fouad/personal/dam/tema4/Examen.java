package fouad.personal.dam.tema4;

import java.util.*;


public class Examen {

	public static final int NUM_COLUMNAS_DEFECTO = 10; // Constante

	public static int[][] ejercicio1() {
		System.err.println("EJERCICIO 1");
		Random rand = new Random();
		// Generar núm aletorio(para las filas)
		int numAleatorio = rand.nextInt(6) + 6;
		// Crear-Instancias array
		int[][] matriz = new int[numAleatorio][NUM_COLUMNAS_DEFECTO];

		System.out.println("Número de filas: " + numAleatorio);
		System.out.println("Número de columas " + NUM_COLUMNAS_DEFECTO);

		// Mostrar matriz vacía
		System.out.println("\nMatriz vacía");
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				System.out.print(matriz[i][k] + " ");
			}
			System.out.println(); // Salto de línea
		}
		// Cargar (Llenar matriz con valores aleatoriamente)
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				int numAzar = rand.nextInt(7) + 1;
				matriz[i][k] = numAzar;
			}
		}
		// Mostrar matriz llena
		System.out.println("\nMatriz llena con números entre el 1 y 7 incluidos (aleatoriamente)");
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				System.out.print(matriz[i][k] + " ");
			}
			System.out.println(); // Salto de línea
		}
		// Devolver matriz
		return matriz;
	}

	public static int[] ejercicio2(int[][] matriz) {
		System.err.println("\nEJERCICIO 2");
		System.out.println("Array suma de los elementos de cada fila:");

		// Intancia de arraySumaFilas
		int[] arraySumaFilas = new int[matriz.length];

		// Recorrer la matriz y sumar las filas
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				arraySumaFilas[i] += matriz[i][k]; // Suma conbinada
			}
		}
		// Imprimir arraySumaFilas
		for (int i = 0; i < arraySumaFilas.length; i++) {
			System.out.println(arraySumaFilas[i]);
		}

		// Devolver arraySumaFilas
		return arraySumaFilas;
	}

	public static int[] ejercicio3(int[][] matriz, int[] arraySumaFilas) {
		System.err.println("\nEJERCICIO 3");

		int position = 0, max = Integer.MIN_VALUE; // Valor más pequeño que puede tomar un int

		for (int i = 0; i < arraySumaFilas.length; i++) {
			if (arraySumaFilas[i] > max) {
				max = arraySumaFilas[i];
				position = i;
			}
		}
		System.out.println("La suma mayor es " + max + " y equivale al índice: " + position);

		// Imprimir de la matriz, solo el subarray que se encuentra en el índice 3
		int[] subArray = new int[matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			if (i == position) {
				subArray=matriz[position];
				System.out.println(subArray[i]); 
				//No se hacerlo :(
			}
			

		}

		// Devolver
		return subArray;
	}

	public static int[][] ejercicio4() {
		System.err.println("\nEJERCICIO 4");
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Escribe el número de filas (n): ");
		int numFilas = sc.nextInt();
		System.out.print("Escribe el número de columnas (m): ");
		int numColumas = sc.nextInt();

		// Instancia de matriz2
		int[][] matriz = new int[numFilas][numColumas];

		System.out.println("Matriz generada sin modificaciones:");
		// Rellenamos la matriz con valor entre 1 y 9 inclusive
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				int numAzar = rand.nextInt(9) + 1;
				matriz[i][k] = numAzar;
			}
		}

		// Impresión de matriz sin modificaciones
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				System.out.print(matriz[i][k] + " ");
			}
			System.out.println(); // Salto de línea
		}

		// Modificar primera línea con la segunda
		System.out.println("Matriz con modificaciones: \n no se hacerlo :(");

		return matriz;
	}

	// MAIN DEL EXAMEN
	public static void main(String[] args) {
	

		int matrix[][] = ejercicio1();
		int sumaFila[] = ejercicio2(matrix);
		int arrayMayor[] = ejercicio3(matrix, sumaFila);
		int matrizModificada[][] = ejercicio4();

	} // Cierre del main

}
