package practicaTema4;

import java.util.Scanner;

public class Ej01OtraVez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numEnteros = new int[10]; // Esto es para declarar al mismo momento que la instancia

		// int[] numeros= {8,8,8,8,7,3,1,25,7,6,8,8,9,77,1,2,3,0,5,6}; //En la declaración

		int contador = 0;
		// Imprimir arrays
		for (int i = 0; i < numEnteros.length; i++) {
			int numAleatorio = (int) (Math.random() * 21 + 10);
			numEnteros[i]=numAleatorio;
			
			
			System.out.println("posición [" + i + "]: " + numEnteros[i]);
		}
		
		//System.out.println("2 ARRAY -------------------------");

		// Reccorrer el array numeros y decir cuantas veces aparece el número del usuario
		
		System.out.print("Introduce un número: ");
		int numUsuario = sc.nextInt();
		for (int i=0; i<numEnteros.length;i++) {
			if (numUsuario==numEnteros[i]) {
				contador++;
			}
		}

		System.out.println("El número " + numUsuario + " aparece " + contador + " veces");

		sc.close();
	}

}
