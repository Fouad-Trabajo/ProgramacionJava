package coreccionExamen;

public class CuentaAPlazoFijo extends Cuenta {

	// Atributos
	private String fecha;

	/*
	 * o bien contador de tipo int private int contador;
	 */

	public CuentaAPlazoFijo() {
		// constructor por defecto (vacio)
	}

	public CuentaAPlazoFijo(double saldo, String nombre, String DNI, String moneda, String fecha) {
		super(saldo, nombre, DNI, moneda);
		this.fecha = fecha;

	}

	// getter y setter
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
