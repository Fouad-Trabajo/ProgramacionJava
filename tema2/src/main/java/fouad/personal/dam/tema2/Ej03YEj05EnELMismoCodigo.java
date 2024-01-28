package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej03YEj05EnELMismoCodigo {
	// El ej 03 y 05 son los ejercicios más complicados hasta la fecha.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("NÚMERO MAYOR Y VECES REPETIDO");
		System.out.println("Introduce números:");
		int num, max = 0, rep = 0, cont0 = 0, suma = 0;
		do {
			// Leer hasta que meta 5 ceros
			System.out.print("-");
			num = sc.nextInt();
			suma += num;

			if (num == 0) {
				cont0++;
			} else {
				if (num > max) { // Si num>max, el valor de max es num
					max = num;
					rep = 1;
				} else if (num == max) { // Si num es igual a max,
					rep++;
				}
			}
		} while (cont0 != 5);

		// También se puede hacer utilizando solamente while: while(contador1=5)

		System.out.println("El programa se cierra porque has introducido 5 ceros.");
		System.out.println("El " + max + " es el mayor número introducido y se repite " + rep + " veces.");
		System.out.println("La suma es: " + suma);

		/* Ejercicio 5 pero sin la parte del ejercicio 3
		 * do { 
		 * System.out.print("-"); 
		 * num = sc.nextInt();
		 * 	suma += num;
		 * 
		 * if (num > max) { // Si num>max, el valor de max es num 
		 * 	max = num; 
		 * 	rep = 1; 
		 * }else if (num == max) { // Si num es igual a max, 
		 * 	rep++; }
		 * 
		 * } while (num != 0);
		 * 
		 */

		sc.close();
	}

}
