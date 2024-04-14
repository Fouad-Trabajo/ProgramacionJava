package noSeComoLlamarlo;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		/**
		 * Imprimir los número de 1 a N usando bucles
		 */
		
		// while
		Scanner input = new Scanner(System.in);
		int c=1;
		System.out.print("Hasta donde quieres imprimir: ");
		int n=input.nextInt();
		
		while(c<=n) {
			System.out.println(c);
			c+=1;
		}
		
		
		
		
	}

}
