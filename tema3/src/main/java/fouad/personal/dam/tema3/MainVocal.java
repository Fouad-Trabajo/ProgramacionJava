package fouad.personal.dam.tema3;

import java.util.*;

public class MainVocal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("VOCALES-CONSONANTES");
		System.out.print("Introduce una letra: ");
		char letra = sc.next().charAt(0);
		char letraMinus = Character.toLowerCase(letra);

		boolean comprobacion = Vocal.esVocal(letraMinus);

		if (comprobacion == true) {
			System.out.println("La letra [" + letra + "] es una vocal");
		} else {
			if (letraMinus >= 'a' && letraMinus <= 'z') {
				System.out.println("La letra [" + letra + "] no es una vocal");
			} else {
				System.out.println("NO has introducido un letra");
			}
		}
		System.out.println("Gracias por participar :)");

		sc.close();
	}

}
