package ultimosejercicios.banco;

import java.util.ArrayList;

public class Pandilla {

	private final int capacidad = 3;
	ArrayList<Amigo> lista;

	public Pandilla(ArrayList<Amigo> lista) {
		this.lista = lista;
	}

	public ArrayList<Amigo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Amigo> lista) {
		this.lista = lista;
	}

	public void add(Amigo a) throws PandillaCompletaException, NoMeGustaTuNombreException {
		if (lista.size() == capacidad) {
			throw new PandillaCompletaException();
		} else if (a.getNombre().charAt(a.getNombre().length() - 1) == 's') {
			if(a.getNombre().charAt(a.getNombre().length() - 1) == 's') {
			throw new NoMeGustaTuNombreException();
			}
			else {
				lista.add(a);
			}
		} else {
			lista.add(a);
		}

	}

	@Override
	public String toString() {
		return "Pandilla [capacidad=" + capacidad + ", lista=" + lista + "]";
	}

}
