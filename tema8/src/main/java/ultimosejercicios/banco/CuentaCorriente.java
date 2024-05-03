package ultimosejercicios.banco;

public class CuentaCorriente {

	private String propietario;
	private double saldo;

	public CuentaCorriente(String propietario, double saldo) {
		super();
		this.propietario = propietario;
		this.saldo = saldo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresarDinero(double cantidad) {
		this.saldo += cantidad;
	}

	public void retirarDinero(double cantidad) throws SaldoNegativoException {
		this.saldo -= cantidad;
		if(saldo- cantidad<0) {
			throw new SaldoNegativoException(cantidad);
		
		}
	}
}
