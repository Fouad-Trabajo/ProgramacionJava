package fouad.personal.dam.tema2;

import java.util.Scanner;

public class EjercicioClasePotencia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("POTENCIA DE UN NÚMERO");
		double potencia = 1;

		System.out.print("Introduce la base: ");
		double num = sc.nextDouble();

		System.out.print("Introduce el exponente: ");
		double n = sc.nextDouble();

		if (n == 0 && num == 0) {
			System.out.println("Ha donde vas máquina, eso es una indeterminación");
		} else if (n == 0 || n == -0) {
			System.out.println("El valor de la potencia es: " + (int) potencia);
		} else if (n > 0) {
			for (int i = 1; i <= n; i++) // (int i=-1; i>n; i--) basicamente es al reves
				potencia = potencia * num;
			System.out.println("El valor de la potencia es: " + potencia);
		} else if (n < 0) {
			// cambio de signo de la variable n
			for (int i = 1; i <= -n; i++) {
				potencia /= num; // --> potencia=potencia/num;
			}
			System.out.println("El valor de la potencia es: " + potencia);
		}

		sc.close();
	}

}
