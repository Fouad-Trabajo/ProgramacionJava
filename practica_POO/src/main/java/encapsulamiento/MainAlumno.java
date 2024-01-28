package encapsulamiento;

public class MainAlumno {
	public static void main(String[] args) {

		// Intancia de objetos
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno(101, "Rubén", "García");

		// Impresion de objetos
		System.out.println(alumno2.toString());
		System.out.println("-----------------------------");
		System.out.println("id: " + alumno2.getId());
		System.out.println("Nombre: " + alumno2.getNombre());
		System.out.println("Apellido: " + alumno2.getApellido());
		System.out.println("Nombre de la clase: " + alumno2.getClass());
		
		System.out.println("-----------------------------");
		
		System.out.println(alumno1.toString()); 
		//Como estamos haciendo uso del constructor vacio, pues el alumno1 no tiene parámetros
		
	}

}
