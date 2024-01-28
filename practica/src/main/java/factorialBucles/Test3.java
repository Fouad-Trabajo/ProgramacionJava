package factorialBucles;

import java.util.Scanner;

public class Test3 {
	public static void main (String [] args) {
		
		Scanner sc=new Scanner (System.in);
	
		int num;
		int suma=0, contador=0;
		double media=0;
		while (suma<=10000) {
			System.out.print("Introduce un número: ");
			num=sc.nextInt();
			suma=suma+num;
			contador++;
		}
		media=suma/contador;
		System.out.println("Se han introducido " + contador + " números,"
				+ " la suma es " + suma + " y la media es: " + media);
		
		
		
		sc.close();
	}

}
