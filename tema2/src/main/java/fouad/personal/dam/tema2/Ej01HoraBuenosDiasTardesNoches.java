package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej01HoraBuenosDiasTardesNoches {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("HORARIO Y SALUDO :)");
		System.out.print("Introduce una hora en formato 24h: ");
		byte hora = sc.nextByte();

		if (hora > 24 || hora<=0) {
			System.out.println("Has introducido una hora erronea.");
		} else if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos días");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenos tardes");
		} else {
			System.out.println("Buenas noches.");
		}
		sc.close();
	}

}
