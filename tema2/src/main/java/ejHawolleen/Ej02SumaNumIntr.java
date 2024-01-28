package ejHawolleen;

import java.util.Scanner;

public class Ej02SumaNumIntr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("SUMA DE NÚMEROS");
		int contador0 = 0, suma = 0; // declaración de variables para el bucle
		System.out.println("Introduce un número (5 ceros cierran el programa): ");

		do {
			System.out.print("- ");
			int num = sc.nextInt();
			suma += num; // --> suma=suma+num;

			if (num == 0) {
				contador0++; // --> contador0=contador0+1;
			}

		} while (contador0 != 5); // También se puede hacer así: while (contador0<5);

		System.out.println("La suma de los número introducidos es: " + suma);

		sc.close();

	}

}
