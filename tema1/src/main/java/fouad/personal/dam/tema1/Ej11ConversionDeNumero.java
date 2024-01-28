package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej11ConversionDeNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		char caracter;

		System.out.println("CONVERSIÓN DE DATOS --> TABLA ASCII");

		System.out.print("Introduce un número entero: ");
		num = sc.nextInt();

		// Cambiar el tipo de variable de "int" a "char" manteniendo el valor que tiene
		// la variable, se llama (Casting).
		caracter = (char) num;
		System.out.println("El valor " + num + " correponde con el caracter : " + caracter + " según la tabla ASCII");

		sc.close();
	}

}
