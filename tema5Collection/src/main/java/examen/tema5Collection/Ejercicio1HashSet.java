package examen.tema5Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio1HashSet {
	public static void main(String[] args) {

		// Instancia de collection set
		Set<Integer> numeros = new HashSet<>(); // Utilizo la coleccion set, porque no permite duplicados

		// Almacenar números en la collection
		for (int i = 1; i <= 30; i++) {
			numeros.add(i);
		}

		System.out.println("Iterar e imprimir con un for each ");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println("\n"); // Salto de línea

		System.out.println("Iterar e imprimir con un iterador indicando el tipo de iterador");
		Iterator<Integer> iterador = numeros.iterator();
		while (iterador.hasNext()) {
			System.out.print(iterador.next() + " ");
		}
		System.out.println("\n"); // Salto de línea

		//Iterar e con un iterador sin indicar el tipo de iterador
		Iterator iteradorGenerico = numeros.iterator();

		while (iteradorGenerico.hasNext()) {
			int it = (Integer) iteradorGenerico.next();
			if (it % 3 == 0) {
				iteradorGenerico.remove();
			}
		}

		System.out.println("Iterar e imprimir con un for each, despues del borrado");
		for (int digito : numeros) {
			System.out.print(digito + " ");
		}
		// También se puede iterar con el método forEach
		// forEach {(--> x System.out.println(num) });

	}
}
