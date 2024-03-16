package ejerciciosCollection;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

	private String nombre;
	private Integer n_cuenta;
	private Double saldo;
	
	
	
	public Cliente(String nombre, Integer n_cuenta, Double saldo) {
		super();
		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getN_cuenta() {
		return n_cuenta;
	}



	public void setN_cuenta(Integer n_cuenta) {
		this.n_cuenta = n_cuenta;
	}



	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", n_cuenta=" + n_cuenta + ", saldo=" + saldo + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(n_cuenta, nombre, saldo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(n_cuenta, other.n_cuenta) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(saldo, other.saldo);
	}



	@Override
	public int compareTo(Cliente cliente) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(cliente.nombre);
	}
	
	
	
	
	
	
	
	
	
}
