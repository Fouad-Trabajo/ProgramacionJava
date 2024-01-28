package fouad.personal.dam.practica;

import java.util.Scanner;

public class ExplicaciónIF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int num = sc.nextInt();

		if (num > 80) {
			System.out.println("Esto se ejecuta si la condición 1 es verdadera");
		}
		else if (num > 60) {
			System.out.println("Esto se ejecuta si la condición 1 es falsa y la condición 2 es verdadera");
		}
		else if (num > 30) {
			System.out.println("Esto se ejecuta si la condición 1 es falsa, "
					+ "la condición 2 es falsa y la condición 3 es verdadera");
		}
		else {
			System.out.println("Esto se ejecuta si ningua de las condiciones anteriores son verdaderas");
		}
		sc.close();
	}

}
