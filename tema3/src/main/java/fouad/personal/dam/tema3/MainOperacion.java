package fouad.personal.dam.tema3;

import java.util.Scanner;

public class MainOperacion {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce operador 1: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce operador 2: ");
		int num2 = sc.nextInt();
		System.out.println("RESULTADO");

		int suma = Operacion.suma(num1, num2);
		System.out.println("La suma de los números introducidos es: " + suma);
		int resta = Operacion.resta(num1, num2);
		System.out.println("La resta de los números introducidos es " + resta);

		sc.close();
	}

}
