package examenTema4Practica;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Declaración array
		int [] enteros= new int [3];
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, posicion=0;
		
		//Pedir al usuario 10 números
		for (int i=0;i<enteros.length;i++) {
			System.out.print("Introduce numero["+i+"]: ");
			int numero=sc.nextInt();
			posicion=+1;
			enteros[i]=numero; //Asignar número a elemento del array
				if(numero>max) {
					max=numero;
					posicion=i;
				}
				if(numero<min) {
					min=numero;
					posicion=i;
				}
				
			
		}
		
		
		System.out.println("El máximo es " + max + ", su posción es " + posicion);
		System.out.println("El mínimo es " + min + ", su posción es " + posicion);

		//Imprimir array
		
		sc.close();
	}

}
