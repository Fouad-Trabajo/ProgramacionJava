package fouad.personal.dam.tema5;

public class Lista {

	// Encapsulación (por eso pongo private)
	private Nodo primero;
	private int tamaño;

	// método remove
	public String remove(int index) {
		Nodo aBorrar = null; // Iteradores para recorrer la lista
		String info = null;
		// primer elemento
		if (!isEmpty() && (index < tamaño) && (index >= 0)) { // No se cumple, no tiene sentido recorrer la lista
			if (index == 0) { // Es el primer elemento el que tengo que borrar
				aBorrar = primero; // Ya lo borro abajo
				primero = primero.getSig();
			} else { // Recorro hasta llegar al index
				aBorrar = primero.getSig(); // Acabo de poner que aBorrar es el segundo
				Nodo anterior = primero;

				for (int i = 1; i < index; i++) {
					anterior = anterior.getSig();
					// También se puede hacer así
					anterior = aBorrar;
					aBorrar = aBorrar.getSig();

				}
				if (index == tamaño - 1) { // Resultaría que el elemento a borrar sería el último
					anterior.setSig(null); // Le estoy diciendo que anterior apunte a null
					info = aBorrar.getInfo(); // Se puede hacer al final
				} else { // Borrar elemento del medio
					anterior.setSig(aBorrar.getSig());
					aBorrar.setSig(null); // Para quitar la referencia
				}
				// Vuelco la info que tenga el nodo aBorrar a mi String
				info = aBorrar.getInfo();
				aBorrar = null; // OPCIONAL
				tamaño--;
			}
		}
		return info;
	}

	// método add. Añadir valores a la lista
	public void add(String info) {
		// Creación de elementos
		Nodo nuevo = new Nodo(info);

		// Antes de añadir ... veremos si está vacía
		if (primero == null) { // La lista está completamente vacía
			primero = nuevo;
		} else { // Si la lista no está vacía: añado elementos al final de la lista
			Nodo aux = primero; // Auxiliar apunta al primero. Iterador auxiliar
			// Recorido
			while (aux.getSig() != null) { // Mientras que aux.getSig() sea distinto de nulo voy a recorrer la lista
				aux = aux.getSig(); // El valor de auxiliar se el asigna el valor del siguente al axuiliar aux++;
			}

			// Asignación
			aux.setSig(nuevo); // RECUERDA "setteame", para asignar algo en POO se puede utilizar el set
		}
		tamaño++;
	}

	// Imprimir la lista
	public void print() {
		Nodo aux = primero; // Iterador auxiliar

		// Recorrido
		while (aux != null) {
			System.out.println(aux.getInfo()); // Imprimir auxiliar
			aux = aux.getSig(); // El valor de auxiliar se el asigna el valor del siguente al axuiliar aux++;
		}
	}

	// Método TAMAÑO de lista
	// public int size() {
	// return tamaño;
	// }

	// Imagina que no tengo el atributo tamaño (contador del tamaño de la lista)
	public int size() {
		int contador = 0;
		Nodo aux = primero; // Variable auxiliar de tipo nodo
		// Recorrer lista
		while (aux != null) {
			contador++;
			aux = aux.getSig();
		}
		return contador;
	}

	// Método lista estaVacía
	public boolean isEmpty() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Otra forma de saber si la lista está vacía (para que una lista esté vacía por
	 * cojones el primer elemento debe estar vacío)
	 */
	
	// public boolean isEmpty() {
	// return tamaño==0;
	// }

	// Main
	public static void main(String[] args) {

	}

}
