package fouad.personal.dam.tema3;

public class Empleado {
	
	//Atributos
	private String nombre;
	private String seccion;
	
	//Constructores
	public Empleado() {
		//constructor por defecto(vacio)
	}

	//2nd constructor
	public Empleado(String nombre, String seccion) {
		this.nombre = nombre;
		this.seccion = seccion;
	}
	//3er constructor (sobrecargado)
	public Empleado(String nombre) {
		this.nombre=nombre;
		this.seccion="Administración";
	}

	// Getter y setter - La profesora ha pedido que solo tengamos 2 métodos
	public String Obtener() {
		return "Nombre: " + nombre + "; Sección: " + seccion ;
	}

	public void setPoner(String seccion) {
		this.seccion = seccion;
	}

		

	
}
