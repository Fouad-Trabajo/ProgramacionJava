package encapsulamiento;

public class Alumno {

	// Atributos
	private int id;
	private String nombre;
	private String apellido; // Todos los atributos de una clase mejor ponerlo privados

	// Constructores
	public Alumno(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// 2nd Constructor Vacio
	public Alumno() {

	}

	// Getter y Setter

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

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	

	// Métodos especiales

	// public ....

}
