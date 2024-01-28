package fouad.personal.dam.tema4;

import java.util.*;

public class Ej01Array {

	Random rand= new Random();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		// Declaración del array de 20 elementos
		//int[] Enteros = { 43, 1, 2, 5, 6, 9, 200, 6, 0, 4, 200, 77, 10, 200, 46, 889, 4, 10, 99, 99 };

		// Bucle para recorrer y mostrar el array por pantalla
		/*for (int i = 0; i <= Enteros.length - 1; i++) { //En este caso se puede poner i<20
			System.out.println("nota [" + i + "] es " + Enteros[i]);
		}*/

		// Pedir por pantalla un número entero
		

		int contador = 0;

		
		
		
		int [] Enteros=new int [20];
		for (int i=0; i<Enteros.length;i++) {
			int numAleatorio=(int)(Math.random()*31+20);
			Enteros[i]=numAleatorio;
			System.out.print(Enteros[i] + " ");
		}
/*
		// for-each
		for (int digito : Enteros) { // Cada elemento del array se le asigna una variable nueva
			if (num == digito) { // (cada elemento del array se le asigna la misma variable
				contador++; // y luego se imprime esa variable
			}
		}
		if (contador >= 1) {
			System.out.println("El número " + num + " aparece " + contador + " veces dentro del array :)");
		} else {
			System.out.println("El número " + num + " no aparece dentro del array :(");
		}
*/
		System.out.println("\n------------------------------");
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		
		
		
		//Esto es más fácil de lo que yo he echo jaajja, pero funciona igual XD
		
		
		for (int i=0; i<Enteros.length;i++) {
			if (Enteros[i]==num) {
				contador++;
			}
		}
		//También se puede hacer con un for-each
		for (int digito: Enteros) {
			if (digito==num) {
				contador++;
			}
		}
		System.out.println("El número " + num + " aparece " + contador + " veces");
		
		//Esto es para generar un número aleatorio entre 20 y 50(en este caso)
		/*
		int numAleatorio=(int)(Math.random()*31+20);
		System.out.println(numAleatorio);
		*/
		
		
		//Generar número randoms
		
		
		sc.close();

	}

}
