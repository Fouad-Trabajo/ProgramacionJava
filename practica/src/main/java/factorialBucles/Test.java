package factorialBucles;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("NOTA PROGRAMACIÓN");
		System.out.print("Introduce la nota del exámen: ");
		double nota1 = sc.nextDouble();
		System.out.print("Introduce la nota que quieres tener en el trimestre: ");
		double notaTri = sc.nextDouble();

		nota1 = nota1 * 0.4;
		double nota2 = (notaTri - nota1) / 0.6;
		System.out.println("Para tener un " + notaTri + " en el trimestre, "
				+ "la nota del segundo examen debe ser " + nota2);

		sc.close();
	}

}
