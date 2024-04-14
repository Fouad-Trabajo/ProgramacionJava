package noSeComoLlamarlo;

import java.util.Scanner;

public class BucleFor {

	public static void main(String[] args) {
		/**
		 * Imprimir los número de 1 a N usando bucles
		 */
		
		// for
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hasta donde quieres imprimir: ");
		int n=input.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		
		
		
	}

}
