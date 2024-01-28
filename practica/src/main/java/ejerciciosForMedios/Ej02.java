package ejerciciosForMedios;

import java.util.Scanner;

public class Ej02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introdue un número entero: ");
		int num = sc.nextInt();

		int digitos = 0;
		if (num == 0) {
			System.out.println("El número " + num + " tiene 1 dígito");
		} else {
			while (num != 0) {

				num /= 10;
				digitos++;

			}
			System.out.println("El número " + num + " tiene " + digitos + " dígitos");
		}

		sc.close();
	}

}
