package factorialBucles;

import java.util.*;

public class DoWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("FACTORIAL DE LOS 100 PRIMEROS NÚMEROS");
		System.out.print("Introduce número entre 1 y 100 incluidos: ");
		byte num = sc.nextByte();

		while (num < 1 || num > 100) {
			System.out.println("Número erroneo, introduce un número válido: ");
			num = sc.nextByte();
		}

		if (num <= 20) {
			long number = num, factorial = 1;
			do {

				factorial = factorial * number;
				number--;

			} while (number > 0);
			System.out.println("El factorial del número " + num + " es: " + factorial);
		} else {
			System.out.println(
					"El factorial del número " + num + " es demasiado grande, el programa no puede representarlo :<");
		}

		sc.close();

	}
}
