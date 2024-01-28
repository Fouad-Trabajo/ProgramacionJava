package fouad.personal.dam.tema2;

import java.util.Scanner;

public class AreaFiguraEjemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("AREA DE FIGURAS");
		System.out.println("Elije una figuras: \n2-Cuadrado \n2-Rectangulo \n3-Triangulo \n4-Circulo");

		System.out.print("Figura: ");
		String figura = sc.nextLine();
		double lado, base, altura, radio;

		// Esto no se hacerlo, necesito ayuda de la profesora
		while (!figura.equals("Cuadrado")) {
			System.out.print("Figura no válida, introduce una de las figuras anteriores: ");
			figura = sc.nextLine();
		}

		switch (figura) {

		case "Cuadrado":
			System.out.print("Introduce el valor de los dos lados con un espacio entre ellos (cm): ");
			lado = sc.nextDouble();
			System.out.println("El área del cuadrado es l*l:  " + lado * lado + " centimetros cuadrados");
			break;

		case "Rectangulo":
			System.out.print("Introduce el valor de la base y la altura con un espacio entre ellos (cm): ");
			base = sc.nextDouble();
			altura = sc.nextDouble();
			System.out.println("El área del rectángulo es b*h:  " + base * altura + " centimetros cuadrados");
			break;

		case "Triangulo":
			System.out.print("Introduce el valor de la base y la altura con un espacio entre ellos (cm): ");
			base = sc.nextDouble();
			altura = sc.nextDouble();
			System.out.println("El área del triángulo es (b*h)/2:  " + (base * altura) / 2 + " centimetros cuadrados");
			break;

		case "Circulo":
			System.out.print("Introduce el radio (cm): ");
			radio = sc.nextDouble();
			System.out.println("El área del círculo es PI*r^2:  " + (float) Math.PI * (float) Math.pow(radio, 2)
					+ " centimetros cuadrados");
			break;

		}

		sc.close();
	}
}
