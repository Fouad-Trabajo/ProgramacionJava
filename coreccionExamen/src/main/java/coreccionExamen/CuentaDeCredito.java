package coreccionExamen;

public class CuentaDeCredito extends Cuenta{
	
	// Atributos 
	private double limiteDescubierto=0;

	
	//Constructor
	public CuentaDeCredito(double saldo, String nombre, String DNI, String moneda) {
		super(0.0, nombre,DNI, moneda);
		this.limiteDescubierto = -50;
	}

	//Sobreescribir RetirarDinero
		// RetirarDinero de CuentaCredito
		public boolean RetirarDinero(double dinero) {
			boolean operacion = false;
			if (dinero > 0) {
				if ((saldo- dinero)>=limiteDescubierto) {
					saldo -= dinero;
					operacion = true;
				} else {
					System.out.println("Superas el límite descubierto");
					operacion=false; //no hace falta poner eso
				}
			} else {
				System.out.println("La cantidad debe ser positiva");
			}
			return operacion;
		}
	
	
		

	// getter y setter
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}


	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	
	
	
	
	

}
