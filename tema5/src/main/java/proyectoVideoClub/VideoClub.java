package proyectoVideoClub;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class VideoClub<E> {

	private Collection<Cliente> listaClientes;
	private Collection<Pelicula> listaPeliculas;
	private Collection<Prestamo> listaPrestamos;

	// Constructor vacío
	public VideoClub() {
		listaPrestamos= new ArrayList<Prestamo>();
		listaClientes= new ArrayDeque();
	}

	
	public E addObjeto() { // Este método es generico
		// Ahora puedo añadir objetos de tipo Cliente, Pelicula o Prestamo
		Cliente cliente1 = new Cliente("Rubén");
		
		Pelicula pelicula1 = new Pelicula("Tenet");
		Prestamo prestamo1 = new Prestamo(null,null,null,null);
		
		
		listaClientes.add(cliente1);
		listaPeliculas.add(pelicula1);
		listaPrestamos.add(prestamo1);

		System.out.println();
		return null;
	}

	public Pelicula buscarPelicula(int codigo) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el id de la película: ");
		int idPelicula=sc.nextInt();
		
		
		return null;
	}

	public Cliente buscarCliente(int numeroCarnet) {
		return null;
	}

	public List<E> getPrestamos() {
		return null;
	}

	public List<E> getPrestamos(int numeroCarnet) {
		return null;
	}

	public boolean devolucion(int codigoPelicula, int numeroCarnet) {
		return false;
	}

	public List<E> prestamosMorosos() {
		return null;
	}

}
