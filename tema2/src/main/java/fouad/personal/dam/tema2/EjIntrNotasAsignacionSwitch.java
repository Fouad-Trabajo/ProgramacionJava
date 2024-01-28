package fouad.personal.dam.tema2;

import java.util.Scanner;

public class EjIntrNotasAsignacionSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota, nota1 = 0, nota2 = 0;

		System.out.println("INTRODUCIR NOTAS Y CALIFICACIÓN");
		System.out.print("Introduce la calificación (Bien, Sobre...): ");
		String rango = sc.next();

		switch (rango) {
		case "Insuficiente":
			nota1 = 0;
			nota2 = 4.99;
			break;
		case "Suficiente":
			nota1 = 5;
			nota2 = 5.49;
			break;
		case "Bien":
			nota1 = 5.5;
			nota2 = 6.49;
			break;
		case "Notable":
			nota1 = 6.5;
			nota2 = 8.49;
			break;
		case "Sobresaliente":
			nota1 = 8.5;
			nota2 = 10;
			break;
		default:
			System.out.println("Has introducido un rango no válido");
			break;

		}
		System.out.println(rango + " equivale al rango de notas desde " + nota1 + " a " + nota2 + ", ambos incluidos");

		System.out.print("¿Que nota tines?: ");
		nota = sc.nextDouble();

		// Este if lo he copiado de la otra forma que hice el ejercicio
		while (nota > 10 || nota < 0) {
			System.out.print("Has introducido un nota no válida. \nPor favor introduce una nota entre 0 y 10: ");
			nota = sc.nextDouble();
			}
				if (nota < 5) {
					System.out.println("Insuficiente \nEspero que apruebes programación");
				} else if (nota < 5.50) {
					System.out.println("Suficiente pero por los pelos, te estoy vigilando...");
				} else if (nota < 6.50) {
					System.out.println("Bien");
				} else if (nota < 8.50) {
					System.out.println("Notable");
				} else {
					System.out.println("Sobresaliente");
				}
			

			sc.close();
		
	}
}
