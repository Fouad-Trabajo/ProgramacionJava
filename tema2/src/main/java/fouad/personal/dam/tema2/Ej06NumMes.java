package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej06NumMes {
	// También se puede hacer con else-if, --> ejercicio 04

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // Alt+Shift*R: Para cambiar todas las variables a la vez
		String dia = "0"; // Es una variable que utilizamos a nivel local (es decir, que la utilizamos en una función)

		System.out.println("MES DEL AÑO");
		System.out.print("Introduce un número entre el 1 y el 12 incluidos: ");
		byte num;
		do {
			 num = entrada.nextByte();
		switch (num) { 
		case 1:
			System.out.println("El número " + num + " corresponde a Enero y tiene 31 días.");
			dia = "Enero";
			break;
		case 2:
			System.out.println("El número " + num + " corresponde a Febrero y tiene 28 o 29 días.");
			dia = "Febrero";
			break;
		case 3:
			System.out.println("El número " + num + " corresponde a Marzo y tiene 31 días.");
			dia = "Marzo";
			break;
		case 4:
			System.out.println("El número " + num + " corresponde a Abril y tiene 30 días.");
			dia = "Abril";
			break;
		case 5:
			System.out.println("El número " + num + " corresponde a Mayo y tiene 31 días.");
			dia = "Mayo";
			break;
		case 6:
			System.out.println("El número " + num + " corresponde a Junio y tiene 30 días.");
			dia = "Junio";
			break;
		case 7:
			System.out.println("El número " + num + " corresponde a Julio y tiene 31 días.");
			dia = "Julio";
			break;
		case 8:
			System.out.println("El número " + num + " corresponde a Agosto y tiene 31 días.");
			dia = "Agosto";
			break;
		case 9:
			System.out.println("El número " + num + " corresponde a Septiembre y tiene 30 días.");
			dia = "Septiembre";
			break;
		case 10:
			System.out.println("El número " + num + " corresponde a Octubre y tiene 31 días.");
			dia = "Octubre";
			break;
		case 11:
			System.out.println("El número " + num + " corresponde a Noviembre y tiene 30 días.");
			dia = "Noviembre";
			break;
		case 12:
			System.out.println("El número " + num + " corresponde a Diciembre y tiene 31 días.");
			dia = "Diciembre Feliz Navidad jeje";
			break;
		default:
			System.out.println("Has introducido un número que no corresponde con ningún mes. Introduce otro número");
		
		// Otra forma de hacer sacar por pantalla el día de la semana
			System.out.println("El número " + num + " equivale a: " + dia);	
			}
		
		}
		
		while (num<1 || num>12);
		entrada.close();
	}

}



