package examen.tema5Collection;

import java.util.ArrayList;
import java.util.List;

public class Contenedor<T> {

	private Nodo<T> aux;

	// Array dinámico (crece o decrece según añadimos o eliminamos elementos)
	List<T> listaGenerica = new ArrayList<>();
	private int entero;

	// Constructor
	public Contenedor(int entero) {
		this.entero = entero;
	}

	public void insertarAlPpio(T nuevo) {
		// Nodo aux = new Nodo;
		if (aux.getSig() != null) {
			listaGenerica.add(nuevo);
		}

	}

	public void insertarAlFinal(T nuevo) {
		if (aux.getSig() == null) { // Si el siguiente es null, quiere decir que estamos en el último
			listaGenerica.add(nuevo);
		}

	}

	public T extraerTDelPpio() {
		if (aux.getSig() != null) {
			listaGenerica.remove(aux);
			return null; // Aquí debería devolver el objeto de tipo T
		}

		return null;
	}

	public T extraerDelTFinal() {
		for (int i = 0; i < listaGenerica.size(); i++) {
			if (aux.getSig() == null) {
				listaGenerica.remove(aux);
				return null; // Aquí debería devolver el objeto de tipo T
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Contenedor [aux=" + aux + ", listaGenerica=" + listaGenerica + ", entero=" + entero + "]";
	}

}
