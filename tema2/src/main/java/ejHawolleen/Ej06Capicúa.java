package ejHawolleen;

import java.util.Scanner;

public class Ej06Capicúa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entre el 0 y el 9999 incluidos: ");
		int num = sc.nextInt();

		while (num < 0 || num > 9999) {
			System.out.print("Número erroneo, introduce un número válido: ");
			num = sc.nextInt();
		}

		int unidadesmillar = num / 1000;
		int centenas = (num % 1000) / 100;
		int decenas = (num % 100) / 10;
		int unidades = num % 10;

		if (num < 10 || num >= 10 && num < 100 && (unidades == decenas)
				|| num >= 100 && num < 1000 && (unidades == centenas)
				|| num > 1000 && num <= 9999 && (unidades == unidadesmillar && decenas == centenas)) {
			System.out.println("El número " + num + " es capicúa");
		} else {
			System.out.println("El número " + num + " no es capicúa");

		}

		sc.close();
	}

}
