package fouad.personal.dam.practica;

import java.util.Scanner;

public class SumaNumIntroducido {

	// Sumar números del 1 hasta el número introducido por pantalla

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int suma = 0;
		System.out.println("SUMA DE NÚMERO INTRODUCIDO");
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		/*
		while (num >= 1) {
			suma = suma + num; // --> Suma combinada --> suma+=num;
			num--; 		// --> Decremento --> num=num-1;
		}
		System.out.println("La suma de todos los número hasta el números que has introducido es: " + suma);

		*/
		//Se puede hacer con FOR o con While
		for (int i=num; i>0; i--) {
			suma+=i;
		}
		System.out.println(suma);
		sc.close();
	}

}
