package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej06DivisibleEntre2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("DIVISIBLES ENTRE 2");
		System.out.print("Introduce un número entero: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.print("El número " + num + " es divisible entre 2");
		} else {
			System.out.print("El número " + num + " no es divisible entre 2");
		}

		sc.close();

	}

}
