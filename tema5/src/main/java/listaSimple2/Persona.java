package listaSimple2;

import java.util.Objects;

public class Persona {

	private String nombre;
	private int edad;

	// Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * MÉTODO ESPECIAL que calcula qué persona es la de mayor edad
	 * 
	 * @param p1 Persona 1
	 * @param p2 Persona 2
	 * @return la persona mayor o null en caso de no recibir alguna de las personas
	 */
	public static Persona mayor(Persona p1, Persona p2) {
		if (p1 != null && p2 != null) {
			return p1.getEdad() > p2.getEdad() ? p1 : p2;
			/*
			 * if(p1.getEdad()>p2.getEdad()) {
				return p1;
			   }else {
				return p2;
			   }
			 * Es un if en una sola línea, un ternario
			 */
		}
		return null;
	}

	// Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombre + " tiene " + edad + " años";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

}
