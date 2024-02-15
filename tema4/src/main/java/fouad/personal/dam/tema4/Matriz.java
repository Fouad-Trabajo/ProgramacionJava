package fouad.personal.dam.tema4;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

	// Constante
	private static final int FILAS_DEFECTO = 4;
	private static int position = 0; //Indice de los valores max, min de los arraySuma

	// Método Matriz
	private static int[][] generarMatrizValores() {
		System.err.println("EJERCICIO O MÉTODO 1");
		Random azar = new Random();

		// GENERAR MATRIZ
		// Generar número aleatorio
		int numAzar = azar.nextInt(6) + 10;
		// 2 Forma de generar num aleatorio
		int numAleatorio = (int) (Math.random() * 6 + 10);
		System.out.println("Número de filas por defecto: " + FILAS_DEFECTO);
		System.out.println("Número aleatorio de columnas: " + numAleatorio);
		// Instanciar matriz con las longitudes que se han especificado
		int[][] matriz = new int[FILAS_DEFECTO][numAleatorio];

		System.out.println("Generada matriz vacía");
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
		System.out.println(); // Matriz vacia

		// CARGAR MATRIZ - IMPRIMIR MATRIZ (poniendo el system.out.print...) El que está
		// comentado

		// Llenar el array de número aleatorios entre el 1 y 9
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[f].length; c++) {
				int numMatrizAzar = azar.nextInt(9) + 1; // La diferencia 9[-1]((8)+1)+1;
				matriz[f][c] = numMatrizAzar;
				// System.out.print(matriz[i][j] + " ");
			}
		}

		// IMPRIMIR MATRIZ
		System.out.println("Matriz llena de número aleatorios entre 1 y 9(incluidos)");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		return matriz;
	}

	private static int[] sumaFilas(int[][] matriz) {
		System.err.println("\nEJERCICIO O MÉTODO 2");
		System.out.println("Suma de filas (ArraySumaFilas)");
		int[] arraySumaFilas = new int[matriz.length];
		// Recorrer el bucle y darle valores al arraySuma
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				arraySumaFilas[i] += matriz[i][j];
			}
		}
		// Imprimir arraySumaFilas
		for (int k = 0; k < arraySumaFilas.length; k++) {
			System.out.println(arraySumaFilas[k]);
		}

		return arraySumaFilas;
	}

	private static int[] sumaColumnas(int[][] matriz) {
		System.err.println("\nEJERCICIO O MÉTODO 3");
		System.out.println("Suma de columnas (ArraySumaColumas)");

		int[] arraySumaColumnas = new int[matriz[0].length];
		// Recorrer el bucle y darle valores a arraySumaColumanas
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				arraySumaColumnas[i] += matriz[j][i];
			}
		}
		// Imprimir arraySumaColumnas
		for (int k = 0; k < arraySumaColumnas.length; k++) {
			System.out.print(arraySumaColumnas[k] + " ");
		}
		return arraySumaColumnas;
	}

	// MAX Y MIN DE ArraySumaFilas
	private static String maxSumaFilas(int[] arraySumaFilas) {
		System.err.println("EJERCICIO O MÉTODO 4");
		int maxFilas = Integer.MIN_VALUE, posicion = 0;
		for (int i = 0; i < arraySumaFilas.length; i++) {
			if (arraySumaFilas[i] > maxFilas) {
				maxFilas = arraySumaFilas[i];
				posicion = i;
			}
		}
		return "Máximo: " + maxFilas + ", indice: " + posicion;

	}

	private static String minSumaFilas(int[] arraySumaFilas) {
		int minFilas = Integer.MAX_VALUE;

		// Recorrer arraySumaFila calcular valor máximo
		for (int i = 0; i < arraySumaFilas.length; i++) {
			if (arraySumaFilas[i] < minFilas) {
				minFilas = arraySumaFilas[i];
				position = i;
			}
		}
		return "Mínimo: " + minFilas + ", indice: " + position;
	}

	// MAX Y MIN DE ArraySumaColumnas

	private static String maxSumaColumnas(int[] arraySumaColumnas) {
		System.err.println("EJERCICIO O MÉTODO 5");
		int maxColumas = Integer.MIN_VALUE;

		// Recorrer arraySumaColumna calcular valor máximo
		for (int i = 0; i < arraySumaColumnas.length; i++) {
			if (arraySumaColumnas[i] > maxColumas) {
				maxColumas = arraySumaColumnas[i];
				position = i;
			}
		}
		return "Máximo: " + maxColumas + ", indice: " + position;
	}

	private static String minSumaColumnas(int[] arraySumaColumnas) {
		int minColumnas = Integer.MAX_VALUE;

		// Recorrer arraySumaColumna calcular valor máximo
		for (int i = 0; i < arraySumaColumnas.length; i++) {
			if (arraySumaColumnas[i] < minColumnas) {
				minColumnas = arraySumaColumnas[i];
				position = i;
			}
		}
		return "Mínimo: " + minColumnas + ", indice: " + position;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * //Pedir al usuario número de columnas
		 * System.out.print("Introduce el número de columnas: "); 
		 * int numUsuario=sc.nextInt();
		 */

		// Método generar, rellenar e imprimir array multidimensional
		int[][] matrix = generarMatrizValores();

		/*
		 * Para llamar al método sumaFilas o sumaColumnas desde el main, necesitas tener
		 * una matriz 2D inicializada. No puedes simplemente llamar a la clase y poner
		 * .sumaFilas(); porque sumaFilas es un método estático que requiere un
		 * argumento de matriz 2D.
		 */
		int[] arraySumaFilas = sumaFilas(matrix);
		int[] arraySumaColumnas = sumaColumnas(matrix);

		System.out.println("\n\n-------ArraySumaFilas-------");
		System.out.println(Matriz.maxSumaFilas(arraySumaFilas));
		System.out.println(Matriz.minSumaFilas(arraySumaFilas));

		System.out.println("\n-------ArraySumaColumnas-------");
		System.out.println(Matriz.maxSumaColumnas(arraySumaColumnas));
		System.out.println(Matriz.minSumaColumnas(arraySumaColumnas));

		sc.close();

	}
}
