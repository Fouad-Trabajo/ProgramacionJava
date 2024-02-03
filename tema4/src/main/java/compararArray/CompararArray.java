package compararArray;

public class CompararArray {

	public static void main(String[] args) {

		// Instancia de array
		int[] enteros = { 7, 0, 2 };
		int[] numeros = { 7, 0, 2 };

		// Recorrer array e imprimirlo
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");
		}
		System.out.println(); // Salto de línea
		for (int j = 0; j < numeros.length; j++) {
			System.out.print(numeros[j] + " ");
		}
		System.out.println(); // Salto de línea

		// Comparación de ambos arrays
		boolean comparacion = true;
		if (enteros.length != numeros.length) {
			comparacion = false;
		} else {
			for (int i = 0; i < enteros.length; i++) {
				if (enteros[i] != numeros[i]) {
					comparacion = false;
					break;
				}
			}
		}

		if (comparacion) {
			System.out.println("Los arrays son iguales");
		} else {
			System.out.println("Los arrays son diferentes");
		}

	}

}
