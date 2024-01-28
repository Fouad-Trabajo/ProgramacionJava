package fouad.personal.dam.tema2;

import java.util.Scanner;

public class EjIntrNotasAsignaciónIF {
	// También se puede hacer con Switch, lo tengo hecho en otro clase.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("INTRODUCIR NOTAS Y CALIFICACIÓN");

		System.out.print("Introduce una nota: ");
		double num = sc.nextFloat();

		while (num > 10 || num < 0) {
			System.out.print("Has introducido un nota no válida.\nPor favor introduce una nota entre 0 y 10: ");
			num = sc.nextDouble();
		}
		if (num < 5) {
			System.out.println("Insuficiente \nEspero que apruebes programación");
		} else if (num < 5.50) {
			System.out.println("Suficiente pero por los pelos, te estoy vigilando...");
		} else if (num < 6.50) {
			System.out.println("Bien");
		} else if (num < 8.50) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}

		sc.close();
	}

}
