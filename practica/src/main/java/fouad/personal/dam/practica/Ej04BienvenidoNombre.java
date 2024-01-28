package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej04BienvenidoNombre {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();

		System.out.println("Bienvennido " + nombre);

		sc.close();

	}

}

//El ejrcicio 3 es exactamente igual, solo que no está el Scanner.
/*
 * public static void main (String [] args) {
 * 
 * String nombre= Fouad;
 * 
 * System.out.println("Bienvennido " + nombre);
 */
