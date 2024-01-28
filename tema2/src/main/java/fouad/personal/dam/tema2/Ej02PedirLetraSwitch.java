package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej02PedirLetraSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("VOCALES Y CONSONANTES");
		System.out.print("Introduce una letra: ");
		char letra = sc.next().charAt(0); // Leer una cadena de caracteres, y luego seleccionar el primer caracter
		letra = Character.toLowerCase(letra); // --> Minusculas y Mayúsculas

		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Has introducido una vocal.");
			break;

		default:
			System.out.println("Has introducido una consonante.");

		}

		System.out.print("Gracias por participar :)");

		sc.close();
	}

}
