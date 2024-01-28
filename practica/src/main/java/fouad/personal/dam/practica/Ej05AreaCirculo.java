package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej05AreaCirculo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÁREA DE CÍRULO");
		
		System.out.print("Introduce el radio (cm): ");
		double radio=sc.nextDouble();
		
		
		double area=Math.PI*Math.pow(radio, 2); //Math.pow sirve para elevar números en Java. 
		System.out.println("El área del círculo es: " + area + " centimetros cuadrados");
											
		System.out.println("Gracias por responder :)");

		sc.close();
	}

}
