package proyectoVideoClub;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		boolean salir = false;
        int opcion; // Guardaremos la opción del usuario

        while (!salir) {
            System.out.println("1-");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6-");
            System.out.println("7-Salir");
            System.out.print("¿Que quieres hacer?: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado ");
                    break;
                case 2:
                    System.out.println("Has seleccionado ");
                    break;
                case 3:
                    System.out.println("Has seleccionado ");
                    break;
                case 4:
                    System.out.println("Has seleccionado ");
                    break;
                case 5:
                    System.out.println("Has seleccionado ");
                    break;
                case 6:
                    System.out.println("Has seleccionado ");
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }

        System.out.println("¡Hasta luego!");

		sc.close();

	}

}
