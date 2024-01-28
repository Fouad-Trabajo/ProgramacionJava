package ejerciciosForMedios;

import java.util.Scanner;

public class Ej01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int num = sc.nextInt();

		int factorial = 1;
		for (int i = num; i > 0; i--) {

		/*	if (i == 0) {	Esto sirve para saltar cuando i==0 y seguir con el bucle
				continue;
			}*/
			factorial *= i; // --> factorial=factorial*i;
		}
		System.out.print("El factorial de " + num + " es: " + factorial);

		sc.close();
	}

}
