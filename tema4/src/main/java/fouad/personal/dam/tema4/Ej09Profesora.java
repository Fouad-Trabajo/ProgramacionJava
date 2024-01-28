package fouad.personal.dam.tema4;

public class Ej09Profesora {
	// Forma de la profesora - Uso de métodos

	private static final int VERTICAL = 0;
	private static final int HORIZONTAL = 1;
	// Lo pongo en MAYÚSCULAS para saber que es final (una constante)

	public static void main(String[] args) {

		int[][] mat = { 
				{ 5, 6, 2 }, 
				{ 6, 8, 0 }, 
				{ 3, 1, 5 } };

		// Declaración Array calcularSumaFila

		// int [][] arraySumaFilas = new int [mat.length];
		int[] arraySumaFilas = calcularSumaFila(mat);

		// llamadas al los métodos/funciones
		mostrarMatriz(mat, "Matriz original");

		mostrarArrayUnidminesional(calcularSumaFila(mat), "_Array Suma Filas_", VERTICAL);
		mostrarArrayUnidminesional(calcularSumaColumma(mat), "_Array suma columnas_", HORIZONTAL);

	} // Cierre del main

	// private static void calcularSumaFila(int [][] mat, int[] array);

	private static void mostrarMatriz(int[][] mat, String msg) {
		System.out.println(msg);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Función de calcularSumaFila
	private static int[] calcularSumaFila(int[][] mat) {
		int[] arraySuma = new int[mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				arraySuma[i] += mat[i][j]; // Primero recorre verticalmente y suma toda esa fila
			}
		}
		return arraySuma;

	}

	// Función de calcularSumaColumna
	private static int[] calcularSumaColumma(int[][] mat) {
		int[] arraySuma = new int[mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				arraySuma[i] += mat[j][i]; // Primero recorre horizontalmente y suma toda esa columna

			}

		}
		return arraySuma;

	}

	// Array para mostrar la suma de las filas
	private static void mostrarArrayUnidminesional(int[] arrayComodin, String mensajito, int direccion) {
		System.out.println(mensajito);
		for (int i = 0; i < arrayComodin.length; i++) {
			if (direccion == VERTICAL) {
				System.out.println(arrayComodin[i]);
			} else {
				System.out.print(arrayComodin[i] + " ");
			}
		}
		System.out.println();
	}

	/*
	 * DIFERENCIAS ENTRE FUNCIÓN Y PROCEDIMIENTO
	 * Si un método devuleve un valor es una función y el procedimiento no devuleve nada
	 * porque se rellena dentro del método, pero para poder rellenar el procedimiento, antes
	 * debemos instanciar/crear el array arriba en el main
	 * 
	 * 
	 * PASO POR PARÁMETRO/REFERENCIA
	 */
	
	
	// Esto es un procedimientos
	private static void calcularFila(int[][] mat, int[] array) {
		// NO devuelve nada,nosotros le damos parámetro, por lo que se pone void
	}

}
