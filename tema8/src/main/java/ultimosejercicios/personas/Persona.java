package ultimosejercicios.personas;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable {

	private static final long serialVersionUID = -6915740144452689451L;

	public String nombre;
	public String apellido;
	public Mascota mascota;
	public int edad;

	public Persona(String nombre, String apellido, Mascota mascota, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mascota = mascota;
		this.edad = edad;
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

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", apellido = " + apellido + ", " + mascota + ", edad = " + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, mascota, nombre);
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
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(mascota, other.mascota)
				&& Objects.equals(nombre, other.nombre);
	}

}
