package explicacionLowerUpperCase;

import java.util.*;

public class ConversionMayusMinus {
	public static void main (String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("CAMBIO DE MAYÚSCULA - MINÚSCULA");
		
		System.out.print("Introduce una palabra: ");
		String palabra=sc.next();
		
		// Palabra mayúscula
		String palabraMayus=palabra.toUpperCase();
		System.out.println("Palabra en mayúsuclas: " + palabraMayus);
		// Palabra minúscula
		String palabraMinus=palabra.toLowerCase();
		System.out.println("Palabra en minsúsulas: " + palabraMinus);
		
		System.out.print("Introduce una letra: ");
		char letra=sc.next().charAt(0);
		
		// Letra mayúscula
		char letraMayus=Character.toUpperCase(letra);
		System.out.println("Letra en mayúsculas: " + letraMayus);
		
		
		// Letra minúscula
		char letraMinus=Character.toLowerCase(letra);
		System.out.println("Letra en minúsculas: " + letraMinus);
		
		sc.close();
	}

}
