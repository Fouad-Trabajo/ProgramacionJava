package listaSimple2;

public class ListaSimpleTorpe implements Lista {

	private Nodo primero;
	// No tiene tamaño

	/*
	 * Esta lista es menos eficiente, porque no tiene contador de tamaño y no está
	 * factorizada
	 */

	// Main
	public static void main(String[] args) {

		Nodo nodo = new Nodo(null);
		Lista lista = new ListaSimpleTorpe(nodo);
	}

	// Constructor
	public ListaSimpleTorpe(Nodo primero) {
		this.primero = primero;
	}

	@Override
	public boolean isEmpty() {
		return primero == null;
	}

	@Override
	public Persona getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertAtBegin(Persona info) {
		Nodo nuevo = new Nodo(info);

		if (primero == null) {
			primero = nuevo;
		} else {
			nuevo.setSig(primero);
			primero = nuevo;
		}
	}

	@Override
	public void insertAtEnd(Persona info) {

	}

	@Override
	public void insertAtPosition(Persona info, int index) {
		// Hacer este método pero sin utilizar el auxiliar (anterior)
		Nodo nuevo = new Nodo(info); // Instancia de nodo
		Nodo anterior = primero;
		if (index == 0) {
			insertAtBegin(info);
		} else {
			for (int i = 0; i < index; i++) {
				if (index == i) {

				}
			}
		}

	}

	@Override
	public boolean containsInfo(Persona info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeByInfo(Persona info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona removeAt(int index) {
		if (!isEmpty() && index >= 0 && index < size()) {
			if (index == 0) {
				Nodo borrar = primero;
				primero = primero.getSig();
				borrar.setSig(null);
				// opcional
				borrar = null;
			}
		}
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean clearList() {
		if (!isEmpty()) {
			System.out.println("Borrando....");
			while (size() != 0) {
				removeAt(0); // va borrando el primero por delante
			}
			System.out.println("Fin del borrado");
		}
		return isEmpty();
	}

	@Override
	public int size() {
		int contador = 0;
		Nodo aux = primero;
		// recorrido de todo la lista
		while (aux != null) {
			contador++;
			aux = aux.getSig();
		}
		return contador;
	}

}
