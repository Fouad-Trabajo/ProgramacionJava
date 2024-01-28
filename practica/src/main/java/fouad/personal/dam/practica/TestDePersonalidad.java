package fouad.personal.dam.practica;

import java.util.Scanner;

public class TestDePersonalidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String animal1, animal2, animal3;
		int contraseña;

		System.out.print("Por favor, introduce la contraseña para poder realizar el test de personalidad: ");
		contraseña = sc.nextInt();

		if (contraseña == (1023))
			System.out.println("Contraseña correcta, accediendo...");

		else {
			while (contraseña != 1023) {
				System.out.print("Contraseña incorrecta, vuele a intentarlo: ");
				contraseña = sc.nextInt();
				if (contraseña == 1023)
					System.out.println("Contraseña correcta, accediendo...");
			}
		}

		System.out.println("TEST DE PERSONALIDAD:");

		System.out.print("¿Que animal te representa más?: ");
		animal1 = sc.next();

		System.out.print("Si ese animal no existiera, por favor elija otro: ");
		animal2 = sc.next();

		while (animal2.equals(animal1)) {
			System.out.print("Has introducido el primer animal, por favor elija otro animal: ");
			animal2 = sc.next();
		}

		System.out.print("Si el segundo animal tampoco existiera, por favor elija un tercero: ");
		animal3 = sc.next();

		while (animal3.equals(animal1) || (animal3.equals(animal2))) {
			if (animal3.equals(animal1)) {
				System.out.print("Has introducido el primer animal, por favor elija un animal distinto: ");
				animal3 = sc.next();
			} else {
				System.out.print("Has introducido el segundo animal, por favor elija un animal distinto: ");
				animal3 = sc.next();
			}

		}

		System.out.println("");
		System.out.println("RESPUESTAS");
		System.out.println("El primer animal es como te ves a ti mismo/a: " + animal1);
		System.out.println("El segundo animal es como te ven los demás: " + animal2);
		System.out.println("El tercer animal es como quieres que te vean los demás: " + animal3);
		System.out.println("Gracias por participar :)");

		sc.close();
	}

}
