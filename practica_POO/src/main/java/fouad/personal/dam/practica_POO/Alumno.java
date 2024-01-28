package fouad.personal.dam.practica_POO;

public class Alumno {

	// Atributos globales- Caracterísictas del objeto
	int expediente; // 10669
	String nombre; // Fouad
	String apellido; // Aharchi Aharchi
	int edad; // 20

	// Constructores - Tienen le mismo nombre que la clase

	public Alumno() {
		
		// Esto es un constructor vacio
	}

	// El cosntructor tiene atributos locales
	public Alumno(int expediente, String nombre, String apellido, int edad) {
		this.expediente = expediente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// Getter y Setter
	public int getExpediente() { // get devuelve valores de ahí el return
		return expediente;
	}

	public void setExpediente(int expediente) { // el set no devuelve valores, recibe valores y los asigna/coloca
		this.expediente = expediente;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Métodos - Acciones que puede realizar el objeto
	public void mostrarNombre() { // setter
		System.out.println("Hola, soy un alumno y se decir mi nombre");
	}

	public void saberAprobado(double calificacion) {
		if (calificacion >= 5) {
			System.out.println("He aprobado");
		} else {
			System.out.println("He suspendido");
		}
	}

}
