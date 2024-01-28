package fouad.personal.dam.tema4;

import java.util.*; //Importar la clase scanner, random y todas las que yo necesite

public class Ej08Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaración de array multidimensional
		int[][] cuadradoMagico = new int[4][4]; // 4 filas y cada una tiene 4 columnas
		int[] sumaFilas = new int[4];
		int[] sumaColumnas = new int[4];

		// Imprimir array multidimensional
		for (int i = 0; i < cuadradoMagico.length; i++) {
			for (int k = 0; k < cuadradoMagico[i].length; k++) {

				if (i == k) {
					System.out.print(1 + " ");
				} else {
					System.out.print(cuadradoMagico[i][k] + " ");
				}
			}//Cierre bucle for anidado
			System.out.println(); // Salto de línea
		}	
		

		sc.close();

	}

}
