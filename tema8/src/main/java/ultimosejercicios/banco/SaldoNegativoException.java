package ultimosejercicios.banco;

public class SaldoNegativoException extends Exception{


	private static final long serialVersionUID = 5938034566231095884L;
	
	public SaldoNegativoException(double saldo) {
		super("Tines la cuenta tiritando ("+ Double.toString(saldo) + ")");
	}

}
