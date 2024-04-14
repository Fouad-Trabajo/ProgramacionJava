package noSeComoLlamarlo;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		/**
		 * Imprimir los número de 1 a N usando bucles
		 */
		
		// do-while
		Scanner input = new Scanner(System.in);
		int c=1;
		System.out.print("Hasta donde quieres imprimir: ");
		int n=input.nextInt();
		
		do {
			System.out.println(c);
			c=c+1;
		}while(c<=n);
		
		
		
		
	}

}
