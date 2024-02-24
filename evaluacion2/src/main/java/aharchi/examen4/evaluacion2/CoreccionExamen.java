package aharchi.examen4.evaluacion2;

import java.util.Random;
import java.util.Scanner;

public class CoreccionExamen {

	public static final int NUM_COLUMNAS_DEFECTO = 10; // Constante
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);

	/*
	 * Si los hacemos static, se convierten en propios de la clase y cualquier
	 * método puede utilizarlos sin necesidad de instanciarlos en cada método
	 */
	// Método imprimirMatriz para no tener código repetitivo
	private static void imprimirMatrizArray(int[][] matriz, int[] array) {
		if (array == null) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println(); // Salto de línea
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}

	}

	public static int[][] ejercicio1() {
		System.err.println("EJERCICIO 1");

		// Generar núm aletorio(para las filas)
		int numAleatorio = rand.nextInt(6) + 6;
		// Crear-Instancias array
		int[][] matriz = new int[numAleatorio][NUM_COLUMNAS_DEFECTO];

		System.out.println("Número de filas: " + numAleatorio);
		System.out.println("Número de columas " + NUM_COLUMNAS_DEFECTO);

		// Mostrar matriz vacía
		System.out.println("\nMatriz vacía");
		imprimirMatrizArray(matriz, null);
		// Cargar (Llenar matriz con valores aleatoriamente)
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[i].length; k++) {
				matriz[i][k] = rand.nextInt(7) + 1;
				// Se puede hacer sin declarar una variable
			}
		}
		// Mostrar matriz llena
		System.out.println("\nMatriz llena con números entre el 1 y 7 incluidos (aleatoriamente)");
		imprimirMatrizArray(matriz, null);

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
		// Imprimir arraySumaFilas (con método)
		imprimirMatrizArray(null, arraySumaFilas);

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

		// -------------- ESTO NO LO HICE EN EL EXÁMEN---------------- \\

		// Imprimir de la matriz, solo el subarray que se encuentra en el índice 3
		int[] subArray = matriz[position];
		/*
		 * Instancia de subArray. El valor que le doy, es el array que se encuentre en
		 * "position"
		 */
		// Imprimir subArray
		System.out.println("SubArray cuya suma es la más alta:");
		for (int i = 0; i < subArray.length; i++) {
			System.out.print(subArray[i] + " ");
		}
		System.out.println();
		// -------------- ESTO NO LO HICE EN EL EXÁMEN---------------- \\

		// Devolver subArray
		return subArray;

	}

	public static int[][] ejercicio4() {
		System.err.println("\nEJERCICIO 4");
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
				matriz[i][k] = rand.nextInt(9) + 1;

			}
		}

		// Impresión de matriz sin modificaciones
		imprimirMatrizArray(matriz, null);

		// -------------- ESTO NO LO HICE EN EL EXAMEN---------------- \\
		// Modificación de matriz
		int[] arrayAuxiliar = matriz[0]; // Declaro un array y le asigno la primera fila de la matriz
		matriz[0] = matriz[1]; // Cambio el valor de la fila 1. Le asigno el valor de la fila 2
		matriz[1] = arrayAuxiliar; // El array de la fila 2 le asigno el arrayAuxiliar

		// -------------- ESTO NO LO HICE EN EL EXAMEN---------------- \\

		// Modificar primera línea con la segunda
		System.out.println("Matriz con modificaciones:");
		imprimirMatrizArray(matriz, null);

		// Devolver matriz con las filas 0 y 1 cambiadas
		return matriz;
	}

	public static int[] puntoExtra(int[] arraySumaFilas) {
		System.err.println("EJERCICIO PUNTO EXTRA");
		int[] arrayCopia = new int[arraySumaFilas.length];
		for (int i = 0; i < arrayCopia.length; i++) {
			arrayCopia[i] = arraySumaFilas[i];
		}

		int indiceActual = 0;
		int[] arrayOrdenado = new int[arraySumaFilas.length];
		while (indiceActual < arrayCopia.length) {
			int indiceMenor = 0;
			for (int i = 1; i < arrayCopia.length; i++) {
				if (arrayCopia[i] < arrayCopia[indiceMenor]) {
					indiceMenor = i;
				}

			}
			arrayOrdenado[indiceActual] = arrayCopia[indiceMenor];
			arrayCopia[indiceMenor] = Integer.MAX_VALUE;

			indiceActual++;
		}

		System.out.println("Array ordenado");
		imprimirMatrizArray(null, arrayOrdenado);
		return arrayOrdenado;
	}

	// MAIN DEL EXAMEN
	public static void main(String[] args) {

		int[][] matrix = ejercicio1();
		int[] sumaFila = ejercicio2(matrix);
		int[] arrayMayor = ejercicio3(matrix, sumaFila);
		int[][] matrizModificada = ejercicio4();
		int[] arrayOrdenado = puntoExtra(sumaFila);

	} // Cierre del main

}
