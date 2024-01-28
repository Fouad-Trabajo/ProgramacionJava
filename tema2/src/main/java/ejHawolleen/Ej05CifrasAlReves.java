package ejHawolleen;

import java.util.Scanner;

public class Ej05CifrasAlReves {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CIFRAS Y NÚMEROS");

		System.out.print("Introduce un número entero entre 0 y 9.999 incluidos: ");
		int num = sc.nextInt();
		while (num < 0 || num > 9999) {
			System.out.print("Has introducido un número erroneo, introduce un número válido: ");
			num = sc.nextInt();
		}
		int unidadesmillar = num / 1000;
		int centenas = (num % 1000) / 100;
		int decenas = (num % 100) / 10;
		int unidades = num % 10;

		if (num < 10 || num >= 10 && num < 100 && (unidades == decenas)
				|| num >= 100 && num < 1000 && (unidades == centenas)
				|| num > 1000 && num <= 9999 && (unidades == unidadesmillar && decenas == centenas)) {
			System.out.println("El número " + num + " se lee igual al derecho que al revés: " + num);
		}

		/*
		 * if (num < 10) { System.out.println(num + " al revés es " + num); } else if
		 * (num < 100) { num%=10; System.out.println(num + " al revés es " + num); }
		 * else if (num < 1000) {
		 * 
		 * } else if (num < 10000)
		 */

		sc.close();
	}

}
