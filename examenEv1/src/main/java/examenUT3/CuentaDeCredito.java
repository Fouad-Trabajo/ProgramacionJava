package examenUT3;

public class CuentaDeCredito extends Cuenta{
	
	// Atributos 
	private double limiteDescubierto=0;

	
	//Constructor
	public CuentaDeCredito(double saldo, String nombre, String DNI, String moneda,double limiteDescubierto) {
		super(saldo, nombre,DNI, moneda);
		this.limiteDescubierto = -50;
	}


	// getter y setter
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}


	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	
	
	
	
	

}
