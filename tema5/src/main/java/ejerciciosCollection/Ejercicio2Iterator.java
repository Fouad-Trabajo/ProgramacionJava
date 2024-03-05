package ejerciciosCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2Iterator {

	// Instancia de ArrayList
	private static List<Integer> collectionNumeros = new ArrayList<>();

	// Método almacenar número en un lista
	public static void almacenarNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿De qué tamaño quieres la lista?: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			collectionNumeros.add(i);
		}
		sc.close();

	}

	// Método para recorrer la lista e imprimirla con un for each
	public static void recorrerListaforeach() {
		System.out.println("Recorrer e imprimir lista con un for each: ");
		for (int digito : collectionNumeros) {
			System.out.print(digito + " ");
		}

	}

	// Método para recorrer la lista e imprimirla con un iterator
	public static void recorrerListaIterator1(List<Integer> listaNumeros) {
		System.out.println("Recorrer con iterador indicando el objeto del iterador: ");
		Iterator<Integer> iterator = listaNumeros.iterator(); // Indicando el tipo de objeto
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	// Método para recorrer la lista e imprimirla con un iterator
	public static void recorrerListaIterator2(List<Integer> listaNumeros) {
		System.out.println("Iterador sin indicar el objeto del iterador para borrar los números pares: ");
		Iterator iterator = listaNumeros.iterator(); // Sin indicar el tipo de objeto
		while (iterator.hasNext()) {
			Integer num = (Integer) iterator.next();
			if (num % 2 == 0) { // Si es par, borrarlo
				iterator.remove();
			} else { // Si no es par, imprimelo
				System.out.print(num + " ");
			}

		}
	}

	// Método para recorrer la lista e imprimirla con un for each
	public static void recorrerListaForEeach() {
		System.out.println("Recorrer e imprimir lista con el método forEach: ");
		collectionNumeros.forEach(x -> System.out.print(x + " "));
		// Impimir el auxiliar?, debo aprender como funciona este bucle

	}

	public static void main(String[] args) {
		// Almacena los números en la lista
		Ejercicio2Iterator.almacenarNumeros();

		// Imprime con for each
		Ejercicio2Iterator.recorrerListaforeach();
		System.out.println("\n"); // Salto de línea

		// Imprimir con iterador
		Ejercicio2Iterator.recorrerListaIterator1(collectionNumeros);
		System.out.println("\n"); // Salto de línea

		// Imprimir con iterador
		Ejercicio2Iterator.recorrerListaIterator2(collectionNumeros);
		System.out.println("\n"); // Salto de línea

		// Imprime con forEach
		Ejercicio2Iterator.recorrerListaForEeach();
		;
		System.out.println("\n"); // Salto de línea
	}

}
