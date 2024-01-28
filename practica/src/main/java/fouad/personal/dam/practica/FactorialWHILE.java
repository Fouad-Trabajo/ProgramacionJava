package fouad.personal.dam.practica;

import java.util.Scanner;

public class FactorialWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int producto = 1;
		System.out.println("FACTORIAL DE UN NÚMERO");
		System.out.print("Introduce número: ");
		int num = input.nextInt();

		while (num >= 1) {
			producto = producto * num;
			num--;
		}
		System.out.println(producto);

		input.close();

	}

}
