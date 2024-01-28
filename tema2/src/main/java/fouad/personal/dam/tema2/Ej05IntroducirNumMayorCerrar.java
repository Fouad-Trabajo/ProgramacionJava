package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej05IntroducirNumMayorCerrar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("NÚMERO MAYOR Y VECES REPETIDO");
		System.out.println("Introduce números:");
		int num, max = 0, rep = 0, contador = 0, suma = 0;
		do {
			// Leer hasta que meta 1 cero
			System.out.print("-");
			num = sc.nextInt();

			if (num == 0) {
				contador++;
			} else {

				if (num > max) { // Si num>max, el valor de max es num
					max = num;
					rep = 1;
				} else if (num == max) { // Si num es igual a max, incrementa el repetición en 1 vez
					rep++;
				}
			}
		} while (contador != 5);

		// Opción de hacerlo con solo while: while(contador1=5)
		System.out.println("Ya has introducido 5 ceros.");
		System.out.println("El " + max + " es el mayor número introducido y se repite " + rep + " veces.");
		System.out.println("La suma de los números introducidos es: " + suma);

		sc.close();
	}

}
