package examen.tema5Collection;

import java.util.Stack;

public class Ejercicio2Pila<T> { // Pila

	private Nodo nodo;
	private int tam;
	Stack<Registro> pila = new Stack<>();
	// Registro<T> nuevo = new Registro();

	public void push() { // Insertar
		if (nodo.getSig() != null) {
			push();
		}
		tam++;

	}

	public T pop() { // Extraer
		if (nodo.getSig() == null) {
			pop();
		}
		tam--;
		return null;
	}

	public T peek() { // Obtener sin extraer
		if (nodo.getSig() == null) {
			pop();
		}
		return null;
	}

	public int tam() { // Obtener tamaño
		return tam;
	}

	public void imprimir() { // Imprimir

		for (Registro digito : pila) {
			System.out.print(digito + " ");
		}
	}

}
