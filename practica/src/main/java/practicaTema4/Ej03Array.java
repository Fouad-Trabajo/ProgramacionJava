package practicaTema4;

import java.util.Scanner;

public class Ej03Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Instancia de array
		int[] numEnteros = { 4, 8, 15, 19, 21, 33, 37, 42 }; //Array de 8 elementos

		int numAnterior = Integer.MIN_VALUE; // Valor más pequeño que puede tener un int
		boolean ordenado = true;
		// Suponemos que un array está ordenado cuando es de menor a mayor(1,2,4,5,7..)ASCENDENTE
		System.out.println("ARRAY DE 8 ELEMENTOS");
		for (int i = 0; i < numEnteros.length; i++) {
			System.out.println("Indice [" + i + "]: " + numEnteros[i]);
			if (numEnteros[i] < numAnterior) { //Esto mayor/menor debo repasarlo
				ordenado = false;
			}else if(numEnteros[i]==numAnterior){
				
			}
			numAnterior = numEnteros[i];
			// Estoy igualando el numAnterior al numero actual del array
		}
		if (ordenado==true) {
			System.out.println("El array  está ordenado :)");
		} else {
			System.out.println("El array NO está ordenado :(");
		}
		sc.close();

	}

}
