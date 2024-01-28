package claseAlumno;

public class AlumnoController {

	// Atributos
	private final int TAM_ARRAY = 30;
	// Array de objetos(de alumnos)
	private Alumno[] arrayAlumnos;

	// constructor
	public AlumnoController() {
		this.arrayAlumnos = new Alumno[TAM_ARRAY];
	}

	// Método especial
	public void addAlumnos(Alumno al) {
		int index=0; // es un contador
		while(arrayAlumnos[index]!=null) {
			index++;
		}
		arrayAlumnos[index] = al;
	}

	public void addAlumnos(Alumno al, int index) {
		arrayAlumnos[index] = al;
	}

	public void printAlumnos() {
		for (int i = 0; i < TAM_ARRAY; i++) { // También se puede: for(int i =0; i<arrayAlumnos.length; i++)
			if (arrayAlumnos[i] != null) {
				System.out.println(arrayAlumnos[i].getNombreString() + " " + arrayAlumnos[i].getEdad());
			}
		}
	}

	public void printAlumnos2() {
		for (int i = 0; i < TAM_ARRAY; i++) {
			System.out.println(arrayAlumnos[i].getNombreString() + " " + arrayAlumnos[i].getEdad());
		}
	}
}
