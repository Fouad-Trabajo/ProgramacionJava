package examenUT3;

public class Cuenta {

	// Atributos
	private double saldo;
	private String nombre;
	private String DNI;
	private static String moneda; 
	// Poner static significa que este atributo es de la superclase Objeto de java
	

	// Constructores
	public Cuenta() {
		// Constructor por defecto (vacio)
	}

	// 1er Constructor
	public Cuenta(double saldo, String nombre, String DNI, String moneda) {
		this.saldo = saldo;
		this.nombre = nombre;
		this.DNI = DNI;
		this.moneda=moneda;
	}

	// getter y setter
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	

	public static String getMoneda() {
		return moneda;
	}

	public static void setMoneda(String moneda) {
		Cuenta.moneda = moneda;
	}

	// Métodos especiales
	public void CrearCuenta(double saldo, String nombre, String DNI) {
		this.saldo = 20;
		this.nombre = nombre;
		this.DNI = DNI;

	}

	public double RetirarDinero(double dinero) {
		if (saldo > 0) {
			return this.saldo -= dinero; // resta combinada
		} else if (dinero > saldo) {
			return 0;
		} else {
			return 0;
		}
	}

	public double IngresarDinero(double dinero) {
		if (dinero > 0) {
			return this.saldo += dinero;
		} else if (dinero == 0) {
			return this.saldo;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "[saldo=" + saldo + ", nombre=" + nombre + ", DNI=" + DNI + "]";
	}

}
