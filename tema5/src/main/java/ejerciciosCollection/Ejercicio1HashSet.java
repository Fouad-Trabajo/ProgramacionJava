package ejerciciosCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1HashSet {

	// Instancia de lista HashSet
	private static Set<Integer> collectionNumeros = new HashSet<>();

	public static void pedirNumber() {
		Scanner sc = new Scanner(System.in);
		int numUsuario = 0;
		// Pedir 5 números
		for (int i = 0; i < 5; i++) {
			System.out.print("Escribe numero " + (i + 1) + ": ");
			numUsuario = sc.nextInt();

			

			// Introducir número de usuario a la lista HashSet
			collectionNumeros.add(numUsuario);
			/*
			if(!collectionNumeros.add(numUsuario)) {
				System.out.println("Ese valor ya existe");
			}
			*/
		}
			
		sc.close();
		
	}

	// Cálculo de la suma de los números
	public static int sumaNumeros() {
		int sum = 0;
		for (int numero : collectionNumeros) {
			sum += numero;
		}
		System.out.println("La suma es : " + sum);
		return sum;

	}

	public static void main(String[] args) {

		// Pedir números
		Ejercicio1HashSet.pedirNumber();

		// Mostarar suma de números
		Ejercicio1HashSet.sumaNumeros();

	}

}
