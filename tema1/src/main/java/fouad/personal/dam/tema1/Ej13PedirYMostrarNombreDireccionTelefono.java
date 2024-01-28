package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej13PedirYMostrarNombreDireccionTelefono {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
			
			System.out.print("Introduce tu nombre: ");
			String nombre=sc.nextLine();
			
			System.out.print("Introduce tu dirección: ");
			String direccion=sc.nextLine();
			
			System.out.print("Introduce tu número de teléfono: ");
			int telefono=sc.nextInt();
		
				System.out.println();
				System.out.println("Tu nombre es: " + nombre);
				System.out.println("Tu dirección es: " + direccion);
				System.out.println("Tu numero de teléfono es: " + telefono);
		
		sc.close();
		
	}
}
