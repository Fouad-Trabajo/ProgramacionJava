package coreccionExamen;

public class Cuenta {

	// Atributos
	protected double saldo;
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
		this.moneda = moneda;
	}

	public Cuenta(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
		saldo = 20;
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
	public boolean RetirarDinero(double dinero) {
		boolean operacion = false;
		if (dinero > 0) {
			if (dinero > 0) {
				saldo -= dinero;
				operacion = true;
			} else {
				saldo = 0;
				operacion=true;
			}
		} else {
			System.out.println("La cantidad debe ser positiva");
			operacion=false; //no hace falta poner eso
		}
		return operacion;
	}

	// el nombre de los metodos no hace falta que empiezen em mayúscula
	public double IngresarDinero(double dinero) {
		if (dinero > 0) {
			 return this.saldo += dinero;
		}else{
			return 0;
		}

	}

	@Override
	public String toString() {
		return "[saldo=" + saldo + ", nombre=" + nombre + ", DNI=" + DNI + "]";
	}

}
