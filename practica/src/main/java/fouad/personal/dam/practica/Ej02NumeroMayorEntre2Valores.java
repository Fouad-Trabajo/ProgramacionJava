package fouad.personal.dam.practica;

public class Ej02NumeroMayorEntre2Valores {

	public static void main(String[] args) {

		int num1 = 158;
		int num2 = 158;

		if (num1 > num2)
			System.out.print("El número " + num1 + " > " + num2);

		if (num2 > num1)
			System.out.print("El número " + num2 + " > " + num1);

		if (num1 == num2)
			System.out.print("Ambos números son iguales " + num1 + " = " + num2);

	}
}
