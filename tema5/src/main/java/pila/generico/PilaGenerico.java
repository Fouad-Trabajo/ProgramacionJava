package pila.generico;

public class PilaGenerico<T> {
	
	private NodoGenerico<T> cima;
	private int tam;

	// Size
	public int size() {
		return tam;
	}

	// es nulo
	public boolean isEmpty() {
		return cima == null;
	}

	public void push(T info) {
		NodoGenerico<T> nuevo = new NodoGenerico<T>(info);
		if (!isEmpty()) {
			nuevo.setSig(cima);
		}
		cima = nuevo;
		tam++;
	}

	public T pop() {
		if (!isEmpty()) {
			NodoGenerico<T> borrar = cima; // creo ese nodo para almacenar lo que voy a borrar
			cima = cima.getSig();
			borrar.setSig(null);
			tam--;
			return borrar.getInfo();
		}
		return null;
	}

	public T peak() {
		if (!isEmpty()) {
			return cima.getInfo();
		}
		return null;
	}

	public void print() {
		System.out.println("La Pila contiene: ");
		if (!isEmpty()) {
			NodoGenerico<T> aux = cima;
			System.out.println("Cima");
			while (aux != null) {
				System.out.println("|" + aux.getInfo() + "|");
				aux = aux.getSig();
			}
		}
	}

}
