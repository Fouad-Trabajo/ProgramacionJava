package fouad.personal.dam.tema4;

import java.util.*;

public class Ej05Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ARRAY MULTIDIMENSIONAL: CALCULADORA");
		/*
		 * 789
		 * 456
		 * 123
		 * Esto es un array de 3 elementos y cada uno de los elementos, 
		 * 	a su vez tiene otros 3 elemntos
		 */
		
		//Instancia de array multidimensional
		int [][] digito= new int [5] [4];
		for(int i=0;i<digito.length;i++) {
			for(int j=0;j<digito[i].length;j++) {
				System.out.println("digito [" + i + "] [" + j + "] " + " es digito " + digito[i][j]);
			}
		}
		sc.close();

	}

}
