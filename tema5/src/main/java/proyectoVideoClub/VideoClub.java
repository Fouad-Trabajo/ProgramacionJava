package proyectoVideoClub;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoClub {

	private List<Cliente> listaClientes;
	private List<Pelicula> listaPeliculas;
	private List<Prestamo> listaPrestamos;

	// Constructor (porque lo pide el enunciado)
	public VideoClub() {
		this.listaClientes = new ArrayList<>();
		this.listaPeliculas = new ArrayList<>();
		this.listaPrestamos = new ArrayList<>();

	}

	// Añadir cliente con el método contains de la clase List
	public boolean addCliente(Cliente cliente) {
		if (!listaClientes.contains(cliente)) { // Si el cliente no existe
			listaClientes.add(cliente);
			System.out.println("Se ha insertado correctamente");
		}
		return false;

	}

	// Añadir cliente sin el método contains de la clase List
	public void addCliente2(Cliente cliente) {
		boolean dentroLista = false;
		for (Cliente item : listaClientes) {
			if (item.getNumeroCarnet() == (cliente.getNumeroCarnet())) {
				dentroLista = true;
				break;
			}

		}
		if (!dentroLista) {
			listaClientes.add(cliente);
		}

	}

	// Añadir pelicula con el método contains de la clase List
	public boolean addPelcula(Pelicula pelicula) {
		if (!listaPeliculas.contains(pelicula)) {
			return listaPeliculas.add(pelicula);
		}
		return false;
	}

	// Añadir prestamo con el método contains de la clase List
	public boolean addPrestamo(Prestamo prestamo) {
		if (!listaPrestamos.contains(prestamo)) {
			return listaPrestamos.add(prestamo);
		}
		return false;

	}

	public Pelicula buscarPelicula(int codigo) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el id de la película: ");
		int idPelicula = sc.nextInt();
		Pelicula pelicula = null;
		for (int i = 0; i < listaPeliculas.size(); i++) {
			if (listaPeliculas.get(i).getCodigo().equals(codigo)) {
				pelicula = listaPeliculas.get(i);
				break;

			}

		}

		return pelicula;
	}

	public Cliente buscarCliente(int numeroCarnet) {
		return null;
	}

	public List getPrestamos() {
		return null;
	}

	public List getPrestamos(int numeroCarnet) {
		return null;
	}

	public boolean devolucion(int codigoPelicula, int numeroCarnet) {
		return false;
	}

	public List prestamosMorosos() {
		return null;
	}

}
