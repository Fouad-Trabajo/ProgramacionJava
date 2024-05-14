package ultimosejercicios.banco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CuentaCorriente cc = new CuentaCorriente("Manolo", 100);
		try {
			cc.retirarDinero(152.4);

		} catch (SaldoNegativoException e) {
			System.err.println("Saldo actual: " + (double) cc.getSaldo());
			System.err.println(e.getMessage());
			System.out.println("Error 133 .- Pongase en contacto con el banco");
		}

		System.out.println("Introduce un valor: ");
		int v = input.nextInt();
		Contador c1 = new Contador(v);
		try {
			c1.incrementar();
			
		} catch (LimiteInferiorSuperior e) {
			System.out.println("Valor actual: " + c1.getValor());
			System.out.println("Has superado el límite: " + e.getMessage());
		}

		try {
			c1.decrementar();
		} catch (LimiteInferiorSuperior e) {
			System.out.println("Valor actual: " + c1.getValor());

			System.out.println("Has superado el límite: " + e.getMessage());
		}
	
	}
		

}
