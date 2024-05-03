package ultimosejercicios.banco;

public class Main {
	public static void main(String[] args) throws Exception {
		CuentaCorriente cc = new CuentaCorriente("Manolo", 100);
		try {
			cc.retirarDinero(152.4);
			
		} catch (SaldoNegativoException e) {
			System.err.println("Saldo actual: " +  (double)cc.getSaldo());
			System.err.println(e.getMessage());
			System.out.println("Error 133 .- Pongase en contacto con el banco");
		}
	}

}
