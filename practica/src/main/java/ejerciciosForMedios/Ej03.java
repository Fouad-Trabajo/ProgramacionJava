package ejerciciosForMedios;

import java.util.Scanner;

public class Ej03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introdue un número entero: ");
		int num = sc.nextInt();

		boolean primo = true;
		if (num <= 1) {
			primo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {

				if (num % i == 0) {
					primo = false;
					break;
				}
			}
		}
		if (primo) {
			System.out.println("El número " + num + " es primo");
		} else {
			System.out.println("El número " + num + " no es primo");

		}

		sc.close();
	}

}
