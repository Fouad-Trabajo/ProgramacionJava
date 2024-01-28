package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej02MayorDeEdad {

	public static void main(String[] args) {

		// Declarar scanner
		Scanner edad = new Scanner(System.in);

		// Declarar variable
		byte edadUsuario;
		// leer información en el scanner

		System.out.print("Hola que tal, ¿Qué edad tienes? ");
		edadUsuario = edad.nextByte();
		byte age=0;
		while (edadUsuario > 100 || edadUsuario < 0) {
			System.out.print("La edad introducida es incorrecta. Introduce la edad de nuevo: ");
			age=edad.nextByte();
		}

		// leer información en el objeto del scanner
		System.out.print("Tu edad es " + edadUsuario + ". ");

		if (age >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad.");
		}

		// cerrar scanner
		edad.close();

	}

}
