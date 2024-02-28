package listaSimpleMia;

import java.util.HashSet;
import java.util.Set;

public class ListaSimple implements Lista {

	// Main principal
	public static void main(String[] args) {

		// Lista listaSimple= new Lista(); No se puede instanciar una interfaz
		Lista listaSimple = new ListaSimple();

		Lista arrayLista = new ListaSimple();

		Set<Lista> ListasSimple = new HashSet<>();

	} // Cierre del main

	private int tam;
	private Nodo primero;
	/*
	 * Se pone @Override porque estamos implementando TODOS los métodos de una
	 * interfaz
	 */

	// Método a definir
	@Override
	public boolean isEmpty() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}

	}
	/*
	 * public boolean isEmpty() { return tam==0;
	 * 
	 * } //También se puede hace así
	 */

	@Override
	public Persona getFirst() {
		Persona persona = null;
		if (!isEmpty()) {
			persona = primero.getInfo();
		}
		return persona;
	}

	@Override
	public Persona getLast() {
		Persona persona = null; // Necesito crear un objeto para poder devolver un objeto
		if (!isEmpty()) { // Si la lista NO está vacía recorro la lista
			Nodo aux = primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return persona;
	}

	@Override
	public void insertAtBegin(Persona info) {
		// Creción de elemento nuevo
		Nodo nuevo = new Nodo(info); // Instancia de Nodo

		// Antes de añadir elemento a la lista, veremos si está vacía
		if (isEmpty()) { // Si la lista está completamente vacía (tam==0);
			primero = nuevo;
		} else {
			nuevo.setSig(primero); // El sig del nodo que he añadido será el primer nodo que había antes
			primero = nuevo; // Ahora el primer nodo es el nuevo nodo
		}
		tam++; // Como he añadido un elemento, pues el tamaño de la lista aumenta
	}

	/*
	 * public void insertAtBegin(Persona info) { Nodo nuevo= new Nodo(info); if
	 * (isEmpty()) { nuevo.setSig(primero); } primero = nuevo tam++;
	 * 
	 * }
	 */

	@Override
	public void insertAtEnd(Persona info) {
		// Creación de elemento nuevo
		Nodo nuevo = new Nodo(info);
		// Antes de añadir elemento a la lista, veremos si está vacía
		if (primero == null) { // Lista completamente vacía
			primero = nuevo;
		} else {
			Nodo aux = primero;
			aux = primero.getSig();
			while (aux.getSig() != null) { // Dejo de recorrer hasta que
				aux = aux.getSig(); // Al finalizar el bucle, nos encontramos en el último elemento
			}
			aux.setSig(nuevo);
			; // Ahora el primer nodo es el nuevo nodo
		}
		tam++;
	}

	@Override
	public void insertAtPosition(Persona info, int index) {

		if (index >= 0 && index <= tam) {
			System.out.println("Posición fuera de rango");
			Nodo nuevo = new Nodo(info);
			Nodo aux = primero.getSig();
			if (index == 0) {
				nuevo.setSig(primero);
				primero = nuevo;
			} else {
				if (index == tam) {
					while (aux.getSig() != null) {
						aux = aux.getSig();
					}
				} else { // Recorro la lista hasta la posición
					for (int i = 0; i < index; i++) {
						aux = aux.getSig();
					}
					nuevo.setSig(aux.getSig());
					aux.setSig(nuevo);
				}
			}
			tam++;
		}

	}

	public void insertAtPosition2(Persona info, int index) {

		if (index >= 0 && index <= tam) {
			System.out.println("Posición fuera de rango");
			Nodo nuevo = new Nodo(info);
			Nodo aux = primero.getSig();
			if (index == 0) {
				nuevo.setSig(primero);
				primero = nuevo;
			} else {
				for (int i = 0; i < index; i++) {
					aux = aux.getSig();
				}
				nuevo.setSig(aux.getSig());
				aux.setSig(nuevo);
			}
			tam++;
		}

	}

	@Override
	public boolean containsInfo(Persona info) {
		Nodo aux = primero;
		while (aux != null) {
			if (aux.getInfo().equals(info)) { // Perosna =info
				return true;
			}
			aux = aux.getSig();
		}
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		Nodo aux = primero;
		Persona persona = null;
		if (index < 0 && index <= tam) {
			return persona;
		} else {
			for (int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
		}
		return aux != null ? aux.getInfo() : null; // Esto es un ternario, lo mismo que un if-else pero en una línea
	}

	@Override
	public boolean removeByInfo(Persona info) {

		return false;
	}

	@Override
	public Persona removeAt(int index) {
		
		return null;
	}

	@Override
	public void print() {
		Nodo aux = primero; // Iterador auxiliars
		while (aux != null) {
			System.out.println(aux.getInfo()); // Imprimir auxiliar
			aux = aux.getSig(); // El valor de auxiliar se el asigna el valor del siguente al axuiliar aux++;
		}

	}

	@Override
	public boolean clearList() { // versión super simplificada
		primero = null;

		return isEmpty();
	}

	public boolean clearList2() { // versión recursiva
		if (isEmpty()) { // Mi caso de salida --> Lista vacía
			return true;
		} // Caso donde la lista está llena
		removeAt(0);  //elimino uno (el primero)

		return clearList2();
	}

	@Override
	public int size() {
		int contador = 0;
		Nodo aux = primero; // Variable auxiliar de tipo nodo
		// Recorrer la lista
		while (aux != null) {
			contador++;
			aux = aux.getSig(); // Actualizando el valor de auxiliar en cada iteración
		}
		return contador;
	}

}
