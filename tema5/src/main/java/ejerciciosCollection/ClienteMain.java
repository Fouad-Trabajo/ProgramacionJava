package ejerciciosCollection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ClienteMain {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("David", 056, 1500.00);
		Cliente cliente2 = new Cliente("Beicon", 0555, 20.00);
		Cliente cliente3 = new Cliente("Carla", 055656, 748.56);
		Cliente cliente4 = new Cliente("Alejandra", 052326, 12.38);

		// Collection - Genérico
		// Collection<> cliente = new HashSet<>();

		// Collection - List (lista)
		List<Cliente> list1 = new ArrayList<>();
		List<Cliente> list2 = new LinkedList<>();
		Stack<Cliente> list3 = new Stack<>();

		// Collection - Queue (Cola)
		Queue<Cliente> cola1 = new PriorityQueue<>();
		Queue<Cliente> cola2 = new ArrayDeque<>();

		// Collection - Set (Conjunto no ordenado)
		Set<Cliente> set1 = new HashSet<>();
		Set<Cliente> set2 = new LinkedHashSet<>();
		Set<Cliente> set3 = new TreeSet<>();

		// Añadir los objetos a cada tipo de colección
		// ArrayList
		list1.add(cliente1);
		list1.add(cliente2);
		list1.add(cliente3);
		list1.add(cliente4);
		list1.add(cliente1);
		//list1.remove(0);

		// Stack
		list3.push(cliente1);
		list3.push(cliente2);
		list3.push(cliente3);
		list3.push(cliente4);
		list3.pop(); //El último en entrar, es el último en salir(borrarse)

		// PriorityQueue
		cola1.add(cliente1);
		cola1.add(cliente2);
		cola1.add(cliente3);
		cola1.add(cliente4);
		

		// HashSet
		set1.add(cliente1);
		set1.add(cliente2);
		set1.add(cliente3);
		set1.add(cliente4);
		set1.add(cliente4);

		// LinkedHashSet
		set2.add(cliente1);
		set2.add(cliente2);
		set2.add(cliente3);
		set2.add(cliente4);
		set2.add(cliente1);

		// TreeSet
		set3.add(cliente1);
		set3.add(cliente2);
		set3.add(cliente3);
		set3.add(cliente4);
		set3.add(cliente2);

		// Iterar e imprimir

		System.out.println("ArrayList --> Ordenado por orden de llegada, si permite duplicados");
		for (Cliente cli : list1) {
			System.out.println(cli);
		}
		System.out.println(); // Salto de línea

		System.out.println("Stack --> El último en entrar a la pila es el primero en salir");
		for (Cliente cli : list3) {
			System.out.println(cli);
		}
		System.out.println(); // Salto de línea

		System.out.println("PriorityQueue");
		for (Cliente cli : cola1) {
			System.out.println(cli);
		}
		System.out.println(); // Salto de línea

		System.out.println("HashSet --> No ordenado, no permite dublicados");
		for (Cliente cli : set1) {
			System.out.println(cli);
		}
		System.out.println(); // Salto de línea

		System.out.println("LinkedHashSet --> Ordenado por orden de llegada, no permite duplicados");
		for (Cliente cli : set2) {
			System.out.println(cli);
		}
		System.out.println(); // Salto de línea

		System.out.println("TreeSet --> Ordenado, no permite duplicados");
		for (Cliente cli : set3) {
			System.out.println(cli);
		}
		System.out.println(); // Salto de línea
		
		System.err.println("Iterar con el iterador: Queue");
		Iterator<Cliente> iterator=cola1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.err.println("Iterra con el iterador genérico: Stack");
		Iterator iterator2=list3.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
