package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej05IntrNumMayorCerrar0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, max = 0, cont = 0;

		System.out.println("CUANTAS VECES SE REPITE EL MAYOR NÚMERO INTRODUCIDO");
		System.out.println("Introduce números:");
		
		do {
			System.out.print("-");
			num = sc.nextInt();

			if (num > max) {
				max = num;
				cont = 1;
			} else if (num == max) {
				cont++;
			}

		} while (num != 0);

		System.out.println("El programa se detiene porque has introducido 1 cero.");
		System.out.println("El " + max + " es el mayor número introducido y se repite " + cont + " veces.");

		sc.close();
	}

}
