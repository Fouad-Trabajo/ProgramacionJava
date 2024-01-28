package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej05PesoLuna2 {

	public static void main (String[] args) {

		Scanner peso=new Scanner(System.in);
		double masa;
		double resultado;

		System.out.print("Por favor, introduce tu masa en kilogramos: "); 
		masa=peso.nextDouble();
	
		resultado=masa/(9.8*1.62);
		System.out.println("Tu peso en la Luna es de: " +  resultado);

		peso.close();

	}
	
	
}
