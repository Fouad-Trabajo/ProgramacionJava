package noSeComoLlamarlo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BucleForEach {

	public static void main(String[] args) {
		/**
		 * Imprimir los número de 1 a N usando bucles
		 */
		
		// for
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hasta donde quieres imprimir: ");
		int n=input.nextInt();
		
		List<Integer> lista1 = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			lista1.add(i);
		}
		
		for(int c : lista1) {
			System.out.println(c);
		}
		
		
		
		
	}

}
