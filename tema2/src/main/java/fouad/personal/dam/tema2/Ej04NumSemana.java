package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej04NumSemana {

	// También se puede hacer con un swich,-->ejercicio 06

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  //

		System.out.println("DÍAS DE LA SEMANA");
		System.out.print("Introduce un número entre el 1 y 7 incluidos: ");
		byte num = input.nextByte();

		if (num == 1) {
			System.out.println("El día de la semana correspondiente es: Lunes");
		} else if (num == 2) {
			System.out.println("El día de la semana correspondiente es: Martes");
		} else if (num == 3) {
			System.out.println("El día de la semana correspondiente es: Miércoles");
		} else if (num == 4) {
			System.out.println("El día de la semana correspondiente es: Jueves");
		} else if (num == 5) {
			System.out.println("El día de la semana correspondiente es: Viernes");
		} else if (num == 6) {
			System.out.println("El día de la semana correspondiente es: Sabado");
		} else if (num == 7) {
			System.out.println("El día de la semana correpondiente es: Domingo");
		} else {
			System.out.println("Ese número no corresponde a ningun día de la semana");
		}
		input.close();
	}

}
