package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej08Ordenar3Numeros {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		// El código va aqui.

		double num1, num2, num3;

		System.out.println("ORDENAR NÚMEROS INTRODUCIDOS:");

		System.out.print("Introduce número 1: ");
		num1 = sc.nextDouble();

		System.out.print("Introduce número 2: ");
		num2 = sc.nextDouble();

		System.out.print("Introduce número 3: ");
		num3 = sc.nextDouble();

		System.out.println();

		if (num1 > num2 && num1 > num3 && num2 > num3) { // 1,2,3
			System.out.println(num1 + " > " + num2 + " > " + num3);
		}

		if (num1 > num2 && num1 > num3 && num3 > num2) { // 1,3,2
			System.out.println(num1 + " > " + num3 + " > " + num2);
		}

		if (num2 > num1 && num2 > num3 && num1 > num3) { // 2,1,3
			System.out.println(num2 + " > " + num1 + " > " + num3);
		}

		if (num2 > num1 && num2 > num3 && num3 > num1) { // 2,3,1
			System.out.println(num2 + " > " + num3 + " > " + num1);
		}

		if (num3 > num1 && num3 > num2 && num1 > num2) { // 3,2,1
			System.out.println(num3 + " > " + num1 + " > " + num2);
		}

		if (num3 > num1 && num3 > num2 && num2 > num1) { // 3,2,1
			System.out.println(num3 + " > " + num2 + " > " + num1);
		}

		if (num1 == num2 && num1 == num3 && num2 == num3) { // 1=2=3
			System.out.println("Los tres números son iguales");
		}
		System.out.println("Gracias por responder");
		sc.close();

	}

}
