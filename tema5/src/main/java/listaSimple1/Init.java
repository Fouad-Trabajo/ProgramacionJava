package listaSimple1;

public class Init {
	/*
	 * ENUNCIADO
	 * 
	 * Utilizando la clase NODO y la clase LISTA crea una clase main que se llame
	 * Init y haz lo siguiente:
	 * 
	 * Crea un objeto llamado lista de la clase Lista ---LISTA lista--- Ejecuta las
	 * siguientes acciones
	 * 
	 * 2) por pantalla "ESTA VACIA???" ---llamadaAlMetodo
	 * 
	 * 3)añadimos 3 elementos
	 * 
	 * 4)imprimimos... por pantalla toda la lista
	 * 
	 * 5)por pantalla "El tamaño de la lista es" +llamadaAMetodo
	 * 
	 * 6)por pantalla “La lista está vacía??” +llamadaAlMetodo
	 */

	public static void main(String[] args) {

		Lista listaDeLaCompra = new Lista(); // Instancia de objeto de clase Lista

		// Lista vacía?
		System.out.println("¿La lista está vacia?: " + listaDeLaCompra.isEmpty());

		// Añadimos 3 elementos a la lista
		System.out.println("\nAñadimos elementos a la lista");
		listaDeLaCompra.add("Caramelo"); // llamada al método .add que tiene un valor String por parámetro
		listaDeLaCompra.add("Bellota");
		listaDeLaCompra.add("Ordenador \n");

		// Imprimir toda la lista (los 3 elementos que hemos añadido)
		listaDeLaCompra.print();

		System.out.println("El tamaño de la lista es: " + listaDeLaCompra.size());

		// Preguntar de nuevo si la lista está vacía despues de llenarla de 3 elementos
		System.out.println("¿La lista está vacia?: " + listaDeLaCompra.isEmpty());

	}

}
