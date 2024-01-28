package fouad.personal.dam.tema2;

import java.util.Scanner;

public class EjemploNotasFOR {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double suma = 0;
		for (int i = 1; i <= 3; i++) {

			System.out.print("Introduce una nota " + i + ": ");
			double nota = sc.nextDouble();
			suma += nota;
		}

		System.out.println("La suma de las notas es: " + suma);

		// i=
		// nota=
		// suma=

		sc.close();
	}

}
