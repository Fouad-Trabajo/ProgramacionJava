package cola;

public class Cola<T> {
	// null <-- (encolar) ultimo penultimo <-- nodo_n <-- segundo <--primero
	// (desencolar)

	private NodoGenerico<T> primero;
	private NodoGenerico<T> ultimo;
	private int tam;

	// constructor opcional
	public Cola() {
		primero = ultimo = null;
		tam = 0;
	}

	public int size() {
		return tam;
	}

	public boolean isEmpty() {
		return tam == 0;
	}

	public void enqueue(T info) {
		NodoGenerico<T> nuevoGenerico = new NodoGenerico<T>(info);
		if (isEmpty()) {
			primero = ultimo = nuevoGenerico;
		} else { // si no es el último
			ultimo.setSig(nuevoGenerico);
			ultimo = nuevoGenerico;
		}
		tam++;
	}

	public T dequequeSinNodo() { // Método para eliminar el primero de la cola
		if (!isEmpty()) { // si está llena la cola
			T info = primero.getInfo();
			primero = primero.getSig(); // Ahora el primero es el siguiente del acutal primero
			tam--;
			return info;
		} // Si está vacía, devuelve null
		return null;
	}

	public T dequequeConNodo() { // Es lo mismo, pero ahora lo hacemos con el Nodo
		if (!isEmpty()) { // si está llena la cola
			NodoGenerico<T> aux = primero;
			primero = primero.getSig(); // Ahora el primero es el siguiente del acutal primero
			tam--;
			aux.setInfo(null);
			return aux.getInfo();
		} // Si está vacía, devuelve null
		return null;
	}

	public T front() { // es lo mismo que el peak de pilas (mostrar sin borrar)
		if (!isEmpty()) {
			return primero.getInfo();
		}
		return null;

	}

	public void print() {
		System.out.println("La cola contiene: ");
		if (!isEmpty()) {
			NodoGenerico<T> aux = primero;
			while (aux != null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig(); // avanzo
			}
		} else {
			System.out.println("Está vacíaa");
		}
	}
	
	
	public void print1() {
		System.out.println("La cola contiene: ");
		if(!isEmpty()) {
			System.out.println("último");
			System.out.println("");
		}

	}

}
