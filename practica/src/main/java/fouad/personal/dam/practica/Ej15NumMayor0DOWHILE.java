package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej15NumMayor0DOWHILE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("NÚMERO MAYOR QUE 0");
		System.out.print("Introduce un número mayor que 0: ");
		int num = sc.nextInt();
		do {
			if (num <= 0) {
				System.out.print("Ese número no es válido, introduce otro: ");
				num = sc.nextInt();
			}

		} while (num < 0);

		System.out.println("Ese número es válido: " + num);

		sc.close();
	}

}
