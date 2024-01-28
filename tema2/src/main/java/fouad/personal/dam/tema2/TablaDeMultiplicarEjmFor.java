package fouad.personal.dam.tema2;

import java.util.Scanner;

public class TablaDeMultiplicarEjmFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero, resultado;


		System.out.println("TABLA DE MULTIPLICAR");

		System.out.print("Por favor escribe un número: ");
		numero = sc.nextInt();

		// ejemplo FOR (inicializar / condición / modificar vaiable)
		for (int i = 0; i <= 10; i++) {
			resultado = i * numero;

			System.out.println(numero + " x " + i + " = " + resultado);

			// Otra manera
			// System.out.println(numero + " x " + i + " = " + numero*i);

		}

		/*
		 * ejemplo WHILE int i=1; while (i<=10){
		 * 
		 * System.out.println(numero + " x " + i + " = " + resultado); i=i++; }
		 */

		/*
		 * ejemplo DO-WHILE int i=1; do { System.out.println(numero + " x " + i + " = "
		 * + resultado); i=i++; } while (i<=10);
		 * 
		 */

		sc.close();

	}
	
}
