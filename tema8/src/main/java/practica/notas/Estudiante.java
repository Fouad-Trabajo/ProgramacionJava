package practica.notas;

import java.io.Serializable;
import java.util.Objects;

public class Estudiante implements Serializable, AutoCloseable {

	private static final long serialVersionUID = -641128903598046293L;

	private int id;
	private String nombre;
	private String apellido;
	private double matematicas;
	private double lengua;
	private double historia;
	private double biología;
	private double inglés;
	private double religión;
	
	
	public Estudiante(int id, String nombre, String apellido, double matematicas, double lengua, double historia,
			double biología, double inglés, double religión) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.matematicas = matematicas;
		this.lengua = lengua;
		this.historia = historia;
		this.biología = biología;
		this.inglés = inglés;
		this.religión = religión;
	}


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


	public double getMatematicas() {
		return matematicas;
	}


	public void setMatematicas(double matematicas) {
		this.matematicas = matematicas;
	}


	public double getLengua() {
		return lengua;
	}


	public void setLengua(double lengua) {
		this.lengua = lengua;
	}


	public double getHistoria() {
		return historia;
	}


	public void setHistoria(double historia) {
		this.historia = historia;
	}


	public double getBiología() {
		return biología;
	}


	public void setBiología(double biología) {
		this.biología = biología;
	}


	public double getInglés() {
		return inglés;
	}


	public void setInglés(double inglés) {
		this.inglés = inglés;
	}


	public double getReligión() {
		return religión;
	}


	public void setReligión(double religión) {
		this.religión = religión;
	}


	@Override
	public String toString() {
		return "Estudiante: --> [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", matematicas=" + matematicas
				+ ", lengua=" + lengua + ", historia=" + historia + ", biología=" + biología + ", inglés=" + inglés
				+ ", religión=" + religión + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellido, biología, historia, id, inglés, lengua, matematicas, nombre, religión);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(apellido, other.apellido)
				&& Double.doubleToLongBits(biología) == Double.doubleToLongBits(other.biología)
				&& Double.doubleToLongBits(historia) == Double.doubleToLongBits(other.historia) && id == other.id
				&& Double.doubleToLongBits(inglés) == Double.doubleToLongBits(other.inglés)
				&& Double.doubleToLongBits(lengua) == Double.doubleToLongBits(other.lengua)
				&& Double.doubleToLongBits(matematicas) == Double.doubleToLongBits(other.matematicas)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(religión) == Double.doubleToLongBits(other.religión);
	}


	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

	

	
	
}