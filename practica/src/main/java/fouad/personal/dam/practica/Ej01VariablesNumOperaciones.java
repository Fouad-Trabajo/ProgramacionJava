package fouad.personal.dam.practica;

public class Ej01VariablesNumOperaciones {

	public static void main(String[] args) {

		int a = 15;
		int b = 10;
		double resultado;

		System.out.println("CALCULADORA SIMPLE: ");
		System.out.println("Las variables son: a=" + a + " ; b=" + b);

		resultado = a + b;
		System.out.println("a + b = " + resultado);

		resultado = a - b;
		System.out.println("a - b = " + resultado);

		resultado = a * b;
		System.out.println("a * b = " + resultado);

		resultado = (double) a / b;
		System.out.println("a / b = " + resultado);

		if (a % b == 0) {
			System.out.println("El resto es 0");
		}

		else {
			System.out.println("El resto es: " + (a % b));
		}

	}
}
