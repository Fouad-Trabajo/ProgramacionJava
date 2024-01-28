package fouad.personal.dam.practica;

import java.util.Scanner;

public class FactorialFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int producto = 1;
		System.out.println("FACTORIAL DE UN NÚMERO");
		System.out.print("Introduce número: ");
		int num = input.nextInt();

		for (int i = 2; i <= num; i++) {

			producto = producto * i;

		}
		System.out.println(producto);

		input.close();

	}

}
