package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej12PedirNombreYMostrarloPorPantalla {

	public static void main (String [] args) {
		
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Escribe tu nombre: ");
		String nombre=sc.nextLine();
		
		System.out.println("Tu nombre es: " + nombre);
		
		sc.close();
	}
	
}
