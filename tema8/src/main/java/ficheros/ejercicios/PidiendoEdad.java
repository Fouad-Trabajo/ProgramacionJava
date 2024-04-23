package ficheros.ejercicios;

import java.util.Scanner;

public class PidiendoEdad {

	public static void main(String[] args) {
		
		//Hemos creado nuestra propia excepción
		
	try {
		System.out.print("Introduce la edad: ");
		Scanner sc = new Scanner(System.in);
		int edad= sc.nextInt();
		
		if(edad<0) {
			throw new ExcepcionEdadNegativa();
		}else {
			System.out.println("Edad correcta");
		}
		sc.close();
	} catch (ExcepcionEdadNegativa ex) {
		System.out.println(ex);
	}		
		
		
	}

}
