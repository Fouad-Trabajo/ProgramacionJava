package tema3Clases;

public class Empleado {

	// Atributos -- No hace falta que se pongan arriba, porque no es programación
	// estructurada.
	private final String nombre;
	private String seccion;
	private static int id=1;
	

	// 1er Constructor - Tienene el mismo nombre que la clase
	public Empleado(String nombre, String seccion) {
		this.nombre = nombre;
		this.seccion = seccion;
	
	}

	/*
	 * Esta es otra forma de hacerlo
	 * 
	 * public Empleado(String nombre, String seccion, int id) { 
	 * 		this.nombre = nombre;
	 * 		this.seccion = "Administracion"; 
	 * 		this.id=id;
	 * 
	 * }
	 */

	// 2nd Constructor - Constructor sobrecargado
	public Empleado(String nombre) { // Los constructores que NO devuelven nada, no hace falta poner void
		this(nombre, "Administracion"); // Llamar al constructor 1
	}

	// Métodos (no hace falta llamarlos como get y set)
	public String ObtenerNombreSeccion() { // getNombre, no hace falta que se llame get
		return "Empleado --> id:#" + (id++) + " NOMBRE: " + nombre + "; SECCIÓN: " + seccion;
	} // i++ es un post-incremento primero se muestra el id y luego se incrementa, ++i es todo lo contrario: Teoría Tema 1

	// Al poner final en el atributo nombre, no hace falta poner el setter del
	// nombre

	// Los metodos que no devuelven nada, SI hace falta poner void
	public void AsignarSeccion(String seccion) { // setNombre, no hacer falta que se llame set
		this.seccion = seccion;
	}

	

}
