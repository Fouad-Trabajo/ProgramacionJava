package fouad.personal.dam.tema1;

import java.util.*;// * Todas las clases que están en el paquete util

public class ComoTeLlamas { //public es un modificador de acceso
	
	public static void main (String[] args) {
	
		String nombre; //También se puede poner en la misma linea
		// String nombre=sc.nextLine();		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Hola Mundo ¿Cómo te llamas?: ");
		nombre=sc.nextLine();
		
		
		System.out.println("Es un placer conocerte, " + nombre);
		
		
		sc.close();		
	}
	
	

}
