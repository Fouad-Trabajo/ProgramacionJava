package ejHawolleen;

import java.util.*;

public class Ej08Horas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("HORAS MINUTOS Y SEGUNDOS");
		System.out.print("Introduce horas:");
		int horas = sc.nextInt();
		System.out.print("Introduce minutos: ");
		int minutos = sc.nextInt();
		System.out.print("Introduce segundos: ");
		int segundos = sc.nextInt() + 1; // --> Sumamos 1 a los segundos porqué el ejercicio lo pide.

		// TRANSFORMACIONES

		
		
		minutos = minutos + segundos / 60; // --> minutos+=segundos/60;
		horas = horas + minutos / 60; // --> horas+=minutos/60;
		
		minutos = minutos % 60; // --> minutos%=60;
		segundos = segundos % 60; // --> segundos%=60;

		System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
		
		if (horas>24) {
			System.out.println("Eso equivale a más de un día");
		}else {
			System.out.println("Las horas equivalen a menos de un día");
		}
		
		System.out.println(horas >= 24 ? "Es mayor que un día" : "Es menor que un día");
		sc.close();
	}

}
