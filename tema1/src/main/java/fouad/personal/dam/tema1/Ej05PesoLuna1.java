package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej05PesoLuna1 {

	public static void main (String[] args) {

		Scanner peso=new Scanner(System.in);
		double masa;
		double resultadoT, resultadoL;

		System.out.print("Por favor, introduce tu masa en kilogramos: "); 
		masa=peso.nextDouble();

		resultadoT=masa*9.88;
		System.out.println("Tu peso en la Tierra es de: " +  resultadoT + " Newtons.");

		resultadoL=masa*1.62;
		System.out.println("Tu peso en la Luna es de: " +  resultadoL + " Newtons.");

		peso.close();
		
	}
	
}
