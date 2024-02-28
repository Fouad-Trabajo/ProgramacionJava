package proyectoVideoClub;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Cliente cliente1= new Cliente("Ruben");
		Cliente cliente2= new Cliente("Ruben");
		System.out.println(cliente1);
		System.out.println(cliente2);
		Pelicula pelicula1= new Pelicula("TENET");
		Pelicula pelicula2= new Pelicula("ET");
		System.out.println(pelicula1);
		System.out.println(pelicula2);
		
		
		
		
/*
		System.out.println("-------MENU--------");
		System.out.println("1-Buscar película");
		System.out.println("2-Buscar cliente");
		System.out.println("3-Buscar préstamo");
		System.out.println("4-");
		System.out.println("5-");
		System.out.println("6-Exit");

		System.out.print("\n¿Qué quieres hacer?: ");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Introduce el id de la pleícula");
			break;

		case 2:
			System.out.println("Añadiendo armas...");

			break;

		case 3:
			System.out.println("Introduce el id del cliente:");
			break;

		case 4:
			System.out.println("");
			break;

		case 5:
			System.out.println("");
			break;

		case 6:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opción no válida");
			break;
		}
*/
		sc.close();

	}

}
