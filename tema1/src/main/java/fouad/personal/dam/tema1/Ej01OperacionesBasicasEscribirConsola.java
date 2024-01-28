package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej01OperacionesBasicasEscribirConsola {

	public static void main(String[] args) {

		// Crear la variable para recoger la infomación
		Scanner sc = new Scanner(System.in);

		// Declarar variable
		double op1, op2, resultado;

		// Muestro al usuario información respecto al primer y segundo valor
		System.out.print("Escribe el operador 1: ");
		op1 = sc.nextDouble();

		System.out.print("Escribe el operador 2: ");
		op2 = sc.nextDouble();

		// Cerrar Scanner
		sc.close();

		resultado = op1 + op2;
		System.out.println(op1 + " + " + op2 + " = " + resultado);

		// Ejemplo pero con operadores: System.out.pirintln("op1 + " + " op2 + " = " +
		// (op1+op2);

		resultado = op1 - op2;
		System.out.println(op1 + " - " + op2 + " = " + resultado);

		resultado = op1 * op2;
		System.out.println(op1 + " * " + op2 + " = " + resultado);

		if (op2 == 0) {
			System.out.print("");
		}
		if (op2 == 1) {
			System.out.print(op1 + " / " + op2 + " = " + resultado + " Es el mismo número ");
		}

		else {
			resultado = op1 / op2;
			System.out.println(op1 + " / " + op2 + " = " + resultado);
		}

	}
}
