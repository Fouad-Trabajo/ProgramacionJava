package tema3Clases;

public class Cuenta {

	// Atributos
	String titular;
	String apellido;
	double cantidad;

	// Primer constructor
	Cuenta(String titular,  double cantidad) {
		this.titular = titular;
		this.apellido="No asignado";
		this.cantidad=cantidad;
		}

	// segundo constructor
	//Constructor sobrecargado que solo asigne el titular// Sobreescribir o Sobrecargar
	Cuenta (String titular){
		this.titular=titular;
		 this.cantidad=75.80;
		  this.apellido="No tiene";
	}
	
	// tercer constructor
	Cuenta(String titular, String apellido, double cantidad) {
		this.titular = titular;
		this.apellido=apellido;
		this.cantidad=cantidad;
		}
	
	
	// Getter and Setter
	public String getTitular() {
		return titular; // return this.titular (también se puede poner así)
	}

	public void setTitular(String titular) { // se pone "void" porque no devuelve nada
		this.titular = titular;  	
	}
	/*
	 *  //Diferenciar constructores
	void setTitular(String nombre){
		titular=nombre; 
	Si le cambiar el nombre la variable, así se puede distinguir, 
	si se pone el mismo nombre, se pone "this."
	 *
	 */

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) { // se pone "void" porque no devuelve nada
		this.cantidad = cantidad;
	}

	// To String	sobreescribir
	@Override
	public String toString() {
		return "Cuenta: Titular de la cuenta= " + titular + " Apellido= " + apellido + ": Cantidad de la cuenta= " + cantidad + " euros";
	}

	
	// INGRESASR
	public void Ingresar(double cantidad) { // se puede poner public para que las clases externas la vean
		if (cantidad > 0) {
			this.cantidad = this.cantidad + cantidad; // this.cantidad+=cantidad; --> Suma conbinada;
		}else {
			System.out.println("El saldo de tu cuenta es 0€");
		}
	}
	
	
	// RETIRAR
	public void Retirar(double cantidad) {
		if (cantidad >this.cantidad) {
			this.cantidad = 0;
		} else {
			this.cantidad -= cantidad; // this.cantidad=this.cantidad-cantidad;
		}
	}

}
