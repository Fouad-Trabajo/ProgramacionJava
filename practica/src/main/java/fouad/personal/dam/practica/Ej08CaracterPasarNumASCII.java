package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej08CaracterPasarNumASCII {
	// Paso opuesto al ejercicio anterior (ej 8)
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CONVERSIÓN DE UN CARACTER A UN NÚMERO SEGÚN TABLA ASCII");

		System.out.print("Introduce un caracter: ");
		char caracter = sc.next().charAt(0);
		// El scanner lee la cadena entera y luego "charAT(0)" toma solo el primer
		// caracter

		int num = (int) caracter;
		System.out.print("La conversión del caracter " + caracter + " a número según la tabla ASCII es: " + num);

		sc.close();
	}

}
