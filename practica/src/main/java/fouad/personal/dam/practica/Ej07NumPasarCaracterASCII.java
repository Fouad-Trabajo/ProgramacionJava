package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej07NumPasarCaracterASCII {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CONVERSIÓN DE UN NÚMERO A CARACTER SEGÚN LA TABLA ASCII");

		System.out.print("Introduce un número entero: ");
		int num = sc.nextInt();

		char caracter= (char) num;
		System.out.println("La conversión del número " + num + " a caracter según la tabla ASCII es: " + caracter);

		System.out.println("Gracias por responder :)");

		sc.close();
	}

}
