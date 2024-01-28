package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej03Multiplosde7 {

public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner (System.in);
		
		//declarar vaiable
		int num;
		
		//Indicar al usuario 
		System.out.print("Por favor escribe un número:");
		//leer variable
		num=scanner.nextInt();
		
		//	? {se cumple}	:  {no se cumple}
		System.out.println(num%7==0	? "Primer manera: Es múltiplo de 7 " : "Primer manera: No es múltiplo de 7");
		
		//Otra manera de realizarlo:
		boolean resultado; 
		resultado=num%7==0;
		System.out.println(resultado ? "Segunada manera: Es múltiplo de 7 " : "Segunda manera: No es múltiplo de 7");
		
	
		scanner.close();
		
	}
	
	
	
	
}
