package ejerciciosCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio3TreeSet {

	public static void main(String[] args) {

		// Declaramos un array cuya longitud es generada aleatoriamente
		int longArray = (int) (Math.random() * (15) + 1);
		int numeros[] = new int[longArray];

		// Imprimir array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 7001) + 1000;
			System.out.printf("%d * ", numeros[i]);

		}
		System.out.println(); // Salto de línea

		// INSTANCIAR COLLECCIONES
		HashSet<Integer> pilaHashSet = new HashSet<>();

		Set<Integer> pilaTreeSet = new HashSet<>();
		// También se puede instanciar así, por la compatibilidad de tipos por herencia

		LinkedHashSet<Integer> pilaLinkedHashSet = new LinkedHashSet<>();

		// Rellenar las 3 pilas Set
		for (int num : pilaHashSet) {
			pilaHashSet.add(num);
			pilaLinkedHashSet.add(num);
			pilaLinkedHashSet.add(num);
		}

		for (int digito : pilaHashSet) {
			System.out.print(digito + " ");
		}
		System.out.println();

		for (int digito : pilaTreeSet) {
			System.out.print(digito + " ");
		}
		System.out.println();
		
		for (int digito : pilaLinkedHashSet) {
			System.out.print(digito + " ");
		}
		System.out.println();

	}

}
