package proyectoVideoClub;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VideoClubHashSet {

	private Collection<Cliente> listaClientes;
	private Set<Pelicula> listaPeliculas;
	private Set<Prestamo> listaPrestamos;

	// Constructor vacío
	public VideoClubHashSet() {
		this.listaClientes = new HashSet<>();
		this.listaPeliculas = new HashSet<>();
		this.listaPrestamos = new HashSet<>();

	}

	public boolean addCliente(Cliente cliente) {
		return listaClientes.add(cliente);
	}

	public boolean addPelcula(Pelicula pelicula) {
		return listaPeliculas.add(pelicula);
	}

	public boolean addPrestamo(Prestamo prestamo) {
		return listaPrestamos.add(prestamo);

	}

	public Pelicula buscarPelicula(int codigo) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el id de la película: ");
		int idPelicula = sc.nextInt();

		sc.close(); //Cierre del scanner
		return null;
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
