package fouad.personal.dam.tema1;

import java.util.Scanner;

public class MayorEntre2ValoresEscribirEnConsola {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double n1, n2;
		
		System.out.print("Introduce el primer valor: ");
		n1=sc.nextDouble();
		
		System.out.print("Introduce el segundo valor: ");
		n2=sc.nextDouble();
		
		if  (n1>n2)
		System.out.println("El primer valor es mayor: " + n1 + " > " + n2);
		
		if (n2>n1)
		System.out.println("El segundo valor es mayor: " + n2 + " > " + n1);
		
		if (n1==n2)
		System.out.println("Ambos valores son iguales: " + n1 + " = " + n2);
		
		sc.close();
	}
	
}
