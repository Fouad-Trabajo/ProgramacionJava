package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej07CambiarBilletes {

	public static void main(String[] args) {

		Scanner euros = new Scanner(System.in);

		int eurostotales, billetes500 = 0, billetes200 = 0, billetes100 = 0, billetes50 = 0, billetes20 = 0,
				billetes10 = 0, billetes5 = 0;

		System.out.println("CALCULADORA DE BILLETES");
		System.out.print("Introduce la cantidad de euros: ");
		eurostotales = euros.nextInt();

		if (eurostotales >= 500) {
			billetes500 = eurostotales / 500;
			eurostotales %= 500; // --> eurostotales=eurostotales%500;
		}

		if (eurostotales >= 200) {
			billetes200 = eurostotales / 200;
			eurostotales %= 200;
		}

		if (eurostotales >= 100) {
			billetes100 = eurostotales / 100;
			eurostotales %= 100;
		}

		if (eurostotales >= 50) {
			billetes50 = eurostotales / 50;
			eurostotales %= 50;
		}

		if (eurostotales >= 20) {
			billetes20 = eurostotales / 20;
			eurostotales %= 20;
		}

		if (eurostotales >= 10) {
			billetes10 = eurostotales / 10;
			eurostotales %= 10;
		}

		if (eurostotales >= 5) {
			billetes5 = eurostotales / 5;
			eurostotales %= 5;
		}

		System.out.println(billetes500 + " de 500€");
		System.out.println(billetes200 + " de 200€");
		System.out.println(billetes100 + " de 100€");
		System.out.println(billetes50 + " de 50€");
		System.out.println(billetes20 + " de 20€");
		System.out.println(billetes10 + " de 10€");
		System.out.println(billetes5 + " de 5€");

		if (eurostotales < 5) {
			System.out.print("El saldo restante en monedas es de: " + eurostotales);
			eurostotales %= 5;
		}

		euros.close();

	}

}
