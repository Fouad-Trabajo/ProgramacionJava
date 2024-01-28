package factorialBucles;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("FACTORIAL DE LOS 100 PRIMEROS NÚMEROS");
		System.out.print("Introduce entre número entre 1 y 100 incluidos: ");
		byte num = sc.nextByte();

		while (num < 1 || num > 100) {
			System.out.print("Número erroneo, introduce un número válido: ");
			num = sc.nextByte();
		}

		if (num <= 20) {
			int number = num; // --> He creado una variable con valor "num" porque el valor de "num" al final
			// del bucle es 0.
			long factorial = 1;
			while (number > 0) {
				factorial = factorial * number; // --> factorial*=num;
				number--;
			}
			System.out.println("El factorial de " + num + " es: " + factorial);
		} else {
			System.out.println(
					"El factorial del número " + num + " es demasiado grande, el programa no puede mostaralo. :<");
		}

		sc.close();
	}

}
