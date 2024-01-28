package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej08Ordenar3NumFOR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1, num2, num3;

		System.out.println("Introduce un número 1:");
		num1 = sc.nextDouble();

		System.out.println("Introduce un número 2:");
		num2 = sc.nextDouble();

		System.out.println("Introduce un número 3:");
		num3 = sc.nextDouble();

		/*
		 * Bucle repetir pregunta hasta tener 3 valores. for (int i = 1; i <= 3; i++) {
		 * System.out.print("Introduce el número " + i + ": "); 
		 * int numFOR=sc.nextInt();
		 * 
		 * if (i == 1) // 1er bucle { num1 = sc.nextDouble(); }
		 * 
		 * if (i == 2) // 2er bucle { num2 = sc.nextDouble(); }
		 * 
		 * if (i == 3) // 3er bucle { num3 = sc.nextDouble(); }
		 * 
		 * } Cierre del bucle FOR.
		 */

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
