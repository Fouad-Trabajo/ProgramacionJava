package ultimosejercicios.personas;

import java.io.Serializable;
import java.util.Objects;

public class Mascota implements Serializable{
	
	private static final long serialVersionUID = -1919986265534771971L;
	
	public String nombre;
	public int numeroPatas;

	public Mascota(String nombre, int numeroPatas) {
		this.nombre = nombre;
		this.numeroPatas = numeroPatas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	@Override
	public String toString() {
		return "Mascota [nombre = " + nombre + ", numeroPatas = " + numeroPatas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numeroPatas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return Objects.equals(nombre, other.nombre) && numeroPatas == other.numeroPatas;
	}

	
	

}
