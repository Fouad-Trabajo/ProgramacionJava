package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej17DiaLaboral {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("DÍA DE LA SEMANA LABORAL, NO LABORAL");

		String tipo = "";

		System.out.print("Introduce el día de la semana: ");
		String dia = sc.nextLine();

		switch (dia) {

		case "Lunes":
			tipo = "Laboral";
			break;
		case "Martes":
			tipo = "Laboral";
			break;
		case "Miércoles":
			tipo = "Laboral";
			break;
		case "Jueves":
			tipo = "Laboral";
			break;
		case "Viernes":
			tipo = "Laboral";
			break;
		case "Sábado":
			tipo = "No laboral";
			break;
		case "Domingo":
			tipo = "No laboral";
			break;
		default:
			System.out.println("Has introducido un día de la semana no válido");
			break;

		}

		System.out.println("El " + dia + " es " + tipo);

		sc.close();
	}

}
