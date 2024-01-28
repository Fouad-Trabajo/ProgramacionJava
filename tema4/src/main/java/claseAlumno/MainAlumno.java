package claseAlumno;

public class MainAlumno {
	public static void main (String []args) {
		
		// Instanciar-Crear objetos
		AlumnoController gestor = new AlumnoController();
		
		
		
		Alumno a1= new Alumno("Alejandra", 23);
		Alumno a2=new Alumno("Eudardo", 20); 
		
		gestor.addAlumnos(a1);
		gestor.addAlumnos(a2);
		gestor.printAlumnos();
		
		
		
	}

}
