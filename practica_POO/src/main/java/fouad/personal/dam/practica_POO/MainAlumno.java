package fouad.personal.dam.practica_POO;

public class MainAlumno {
	public static void main(String[] args) {

		// Instanciar objetos - Crear alumnos
		Alumno alumno1 = new Alumno(); // Llamada al constructor vacio
		Alumno alumno2 = new Alumno(10665, "Fouad", "Aharchi", 20); // Llamada al 2nd constructor

		// Imprimir objetos
		System.out.println("+--------------------------------+");
		System.out.println("| ALUMNOS DEL ALONSO DE MADRIGAL |");
		System.out.println("+--------------------------------+");

		// Impresión realizada con el contructor completo - 2nd constructor
		System.out.println("El expediente del alumno 2 es: " + alumno2.getExpediente());
		System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre());
		System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido());
		System.out.println("La edad el alumno 2 es: " + alumno2.getEdad());

		System.out.println("--------------------------------------------");
		
		alumno2.setExpediente(10669); // Con el set puedo sobreescribir los datos
		System.out.println("El expediente *corregido* del alumno 2 es: " +  + alumno2.getExpediente());
		System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre());
		System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido());
		System.out.println("La edad el alumno 2 es: " + alumno2.getEdad());

		System.out.println("--------------------------------------------");

		// Impresión realizada con el constructor vacio y colocando los valores con el set
		alumno1.setExpediente(10438);
		alumno1.setNombre("Federico");
		alumno1.setApellido("Martín");
		alumno1.setEdad(27);
		// El set recibe parametros y el get los obtiene (mostrar por pantalla)
		System.out.println("El expediente del alumno 1 es : " + alumno1.getExpediente());
		System.out.println("El nombre del alumno 1 es : " + alumno1.getNombre());
		System.out.println("El apellido del alumno 1 es : " + alumno1.getApellido());
		System.out.println("La edad del alumno 1 es : " + alumno1.getEdad());

	}
}
