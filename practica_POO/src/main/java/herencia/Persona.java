package herencia;

public class Persona {
	
	//Atributos
	int id;
	String nombre;
	String apellido;
	String direccion;
	int telefono;
	
	//Constructores
	public Persona() {
		
	}
	
	public Persona(int id, String nombre, String apellido, String direccion, int telefono) {
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.telefono=telefono;
	}
	
	// getter y setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	
	
	
	
	// Métodos especiales
	
	
	// public ...
	

	

}
