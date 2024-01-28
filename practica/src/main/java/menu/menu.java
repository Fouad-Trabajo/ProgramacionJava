package menu;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		// Implementamos el scanner para que el usuario pueda escribir por consola
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("MENU");
		System.out.println("1-Borrar pet");
		System.out.println("2-Get Pet");
		System.out.println("3-Update Pet");
		System.out.println("4-Change Pet");
		System.out.println("5-Exit");

		System.out.print("¿Que quieres hacer?: ");
		num = sc.nextInt();
		// Menú de 5 opciones
		switch (num) {
		case 1:
			System.out.println("Has elegido borrar una mascota");
			break;
		case 2:
			System.out.println("Has elegido get una mascota");
			break;
		case 3:
			System.out.println("Has elegido update una mascota");
			break;
		case 4:
			System.out.println("Has elegido change una mascota");
			break;
		case 5:
			System.out.println("Saliendo del programa...");
			break;
		default:
			System.out.println("Operación no válida. Elige una opción del menú");
			while (num <= 0 || num > 5) {
				System.out.print("¿Que quieres hacer?: ");
				num = sc.nextInt();
				switch (num) {
				case 1:
					System.out.println("Has elegido borrar una mascota");
					break;
				case 2:
					System.out.println("Has elegido get una mascota");
					break;
				case 3:
					System.out.println("Has elegido update una mascota");
					break;
				case 4:
					System.out.println("Has elegido change una mascota");
					break;
				case 5:
					System.out.println("Saliendo del programa...");
					break;
				}
			}
		}

		sc.close(); // Cerramos el scanner

	}

}
