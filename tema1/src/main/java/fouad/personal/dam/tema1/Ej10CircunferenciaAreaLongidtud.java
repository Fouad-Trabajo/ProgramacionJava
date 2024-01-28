package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej10CircunferenciaAreaLongidtud {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CALCULAR ÁREA Y LONGITUD DE CIRCUNFERENCIA:");

		System.out.print("Introduce radio (cm): ");
		float radio = sc.nextFloat();

		float longitud = 2 * (float) Math.PI * radio;
		System.out.println("La longitud es: " + longitud);

		// Math.pow sirve para elvar un número. También se puede poner: "radio*radio";
		// esto no se puede "radio^2".
		// (float) es un casting, porque el número PI es un dobule y los estoy pasando todos a "float".
		float area = (float) Math.PI * (float) Math.pow(radio, 2);
		System.out.println("El área es: " + area);

		sc.close();
	}

}
