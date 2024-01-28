package fouad.personal.dam.tema3;

public class Cuenta {

	// Atributos
	private String titular;
	private String apellido;
	private int edad;
	private double cantidad;

	// Metodos

	// Constructor vacio
	public Cuenta() {

	}

	// 1er Constructor
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	// 2nd Constructor - Constructor sobrecargado
	public Cuenta(String titular, String apellido, int edad, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
		this.apellido = "No asignado";
		this.edad = edad;
	}

	// 3er Constructor - Constructor sobrecargado
	public Cuenta(String titular, int edad, double cantidad) {
		this.titular = titular;
		this.edad = 20;
		this.cantidad = 846.37;
	}

	// 4 Constructor - Constructor sobrecargado
	public Cuenta(String titular, String apellido, double cantidad) {
		this.titular = titular;
		this.apellido = apellido;
		this.cantidad = cantidad;
	}

	// Getter , Setter , toString
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	// Estos dos los he añadido yo para mas ejemplos
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	// Terminan aquí

	@Override
	public String toString() {
		return "Cuenta [Titular=" + titular + "; Cantidad de la cuenta=" + cantidad + "€]";
	}

	// Métodos especiales

	// INGRESAR
	public void Ingresar(double cantidad) {
		if (cantidad >= 0) {
			this.cantidad = this.cantidad + cantidad; // suma combinada this.cantidad+=cantidad
			System.out.println("El saldo de la cuenta es: " + this.cantidad);
		} else {
			System.out.println("Error");
		}
	}

	// RETIRAR
	public void Retirar(double cantidad) {
		if (cantidad < this.cantidad) {
			this.cantidad = this.cantidad - cantidad; // resta conbinada this.cantidad-=cantidad;
			System.out.println("El saldo de la cuenta es: " + this.cantidad);
		} else if (cantidad == this.cantidad) {
			this.cantidad = 0; // this.cantidad=this.cantidad-cantidad; Es lo mismo
			System.out.println("El saldo de la cuenta es: " + this.cantidad);
		} else {
			System.out.println("ERROR, no se ha podido realizar la transacción");
		}

	}

}
