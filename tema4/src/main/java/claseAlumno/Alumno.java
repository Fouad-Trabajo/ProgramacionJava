package claseAlumno;

public class Alumno {

	private String nombre;
	private int edad;
	
	//Constructor
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Getter y setter
	public String getNombreString() {
		return nombre;
	}

	public void setNombreString(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
