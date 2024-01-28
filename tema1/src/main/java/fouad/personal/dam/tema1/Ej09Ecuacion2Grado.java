package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej09Ecuacion2Grado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double resultado, resultado1, resultado2;

		System.out.println("ECUACIÓN DE SEGUNDO GRADO: ");

		System.out.print("Introduce coeficiente a: ");
		int a = sc.nextInt();

		System.out.print("Introduce coeficiente b: ");
		int b = sc.nextInt();

		System.out.print("Introduce coeficiente c: ");
		int c = sc.nextInt();

		// double raiz=b*b-4*a*c;
		if ((b * b - 4 * a * c) >= 0) {
			resultado1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			resultado2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out
					.println("Las soluciones reales de esta escuación son: X1= " + resultado1 + " y X2= " + resultado2);
		} else if ((b * b - 4 * a * c) == 0) {
			resultado = -b / (2 * a);
			System.out.println("Las soluciones de la ecuación son: " + resultado);
		}

		else {
			System.out.print("La ecuación no tiene soluciones reales.");
		}

		// Soluciones: X1=-2 ; X2=-3

		sc.close();
	}
}
