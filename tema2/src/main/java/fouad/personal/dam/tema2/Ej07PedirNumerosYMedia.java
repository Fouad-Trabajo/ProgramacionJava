package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej07PedirNumerosYMedia {

	// Ejercicio 7: Realiza un programga que permita la entrada de varios números y
	// calcule su media

	public static void main(String[] args) {

		System.out.println("MEDIA DE NÚMEROS");

		Scanner sc = new Scanner(System.in);
		double suma = 0;

		System.out.print("Dime para cuántos valores quieres calcular la media: ");
		double totalvalores = sc.nextDouble();

		for (int i = 1; i <= totalvalores; i++) {
			System.out.print("Introduce valor " + i + ": ");
			double num = sc.nextDouble();

			// Suma convinada
			suma += num; // Es lo mismo que poner suma=suma+num;
		}

		// Media
		float media = (float) (suma / totalvalores);

		if (totalvalores == 0) {
			System.out.println("ERROR");
		}

		else {
			System.out.println("La media de estos números es: " + media + " :)");
		}
		sc.close();
	}

}
