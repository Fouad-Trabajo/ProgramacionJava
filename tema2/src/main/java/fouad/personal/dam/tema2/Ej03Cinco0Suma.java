package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej03Cinco0Suma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, suma = 0, cont0 = 0;

		System.out.println("INTRODUCIR NÚMEROS Y SU SUMA");
		System.out.println("Introduce números:");

		do {
			System.out.print("-");
			num = sc.nextInt();
			suma += num; // --> El valor de la suma es: suma=suma+num

			if (num == 0) {
				cont0++;
			}

		} // Cerrammos el do y abrimos la condición while
		while (cont0 != 5);

		System.out.println("El programa se cierra porque has introducido 5 ceros.");
		System.out.println("La suma de los números introducidos es: " + suma + ".");

		sc.close();
	}

}
