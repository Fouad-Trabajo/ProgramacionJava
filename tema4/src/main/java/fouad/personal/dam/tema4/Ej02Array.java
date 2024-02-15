package fouad.personal.dam.tema4;

import java.util.Scanner;

public class Ej02Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaración variable
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, posicion=0;

		// Declaración - Instancia array
		int[] Enteros = new int[3];
		

		// Pedir número 10 veces
		for (int i = 0; i <= Enteros.length - 1; i++) {
			System.out.print("Introduce número [" + i + "]: ");
			int num = sc.nextInt();
			Enteros[i]= num;
			if (num > max) {
				max = num;
				posicion=i;
			}
			if (num < min) {
				
				min = num;
				posicion=i;
			}
		}

		for (int j = 0; j < Enteros.length; j++) {
			// Impresión por pantalla del array anteriormente solicitado por pantalla
		}

		System.out.println("El valor máximo es " + max + " y su posición es: " + posicion);
		System.out.println("El valor mínimo es " + min + " y su posición es: " + posicion);

		sc.close();

	}

}
