package examenUT3;

public class CuentaAPlazoFijo extends Cuenta {

	private String fecha;

	public CuentaAPlazoFijo() {

	}

	public CuentaAPlazoFijo(double saldo, String nombre, String DNI, String moneda, String fecha) {
		super(saldo, nombre, DNI, moneda);
		this.fecha = fecha;

	}

}
