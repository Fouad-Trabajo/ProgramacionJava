package paquete;

import java.util.Objects;

public class Cliente {

	private String nombre;
	private String numCuenta;
	private double saldo;

	// Constructor
	public Cliente(String nombre, String numCuenta, double saldo) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo = saldo;

	}

	// 2nd constructor
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numCuenta=" + numCuenta + ", saldo=" + saldo + "] \n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numCuenta, saldo);
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
		return Objects.equals(nombre, other.nombre) && Objects.equals(numCuenta, other.numCuenta)
				&& Objects.equals(saldo, other.saldo);
	}

}
