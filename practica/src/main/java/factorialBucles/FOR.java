package factorialBucles;

import java.util.Scanner;

public class FOR {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("FACTORIAL DE LOS 100 PRIMEROS NÚMEROS");
		System.out.print("Introduce un número entre el 1 y el 100 incluidos: ");
		byte num = sc.nextByte();

		while (num < 0 || num > 100) {
			System.out.print("Número erroneo, introduce un número válido: ");
			num = sc.nextByte();
		}
		// --> No hace falta declarar una variable "number", porque ya hemos declarado
		// otra variable "i" y le damos valor de "num" y al terminar el bucle "i" es 0,
		// pero el valor de num lo introdujo el usuario al principio

		if (num <= 20) {
			long factorial = 0;
			for (int i = num; i > 0; i--) {

				factorial = factorial * i; // Para la suma sería suma=suma+i; (mulitplicación y suma conbinada)
			}
			System.out.println("El factorial del número " + num + " es: " + factorial);
		} else {
			System.out.println(
					"El facorial del número " + num + " es demasiado grande, el programa no puede mostrarlo :<");
		}
		sc.close();
	}

}
