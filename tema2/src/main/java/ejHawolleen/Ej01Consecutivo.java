package ejHawolleen;

import java.util.Scanner;

public class Ej01Consecutivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("NÚMEROS CONSECUTIVOS");

		int num, numAnterior = 0;
		boolean consecutivo = false;
		System.out.println("Introduce un número(número negativo cierra el programa): ");

		do {
			// Leer números hasta que se introduza un número negativo
			System.out.print(": ");
			num = sc.nextInt();

			if (num == numAnterior) {
				consecutivo = true;

			}
			numAnterior = num;
		} while (num >= 0);

		if (consecutivo==true) {
			System.out.println("SI");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
