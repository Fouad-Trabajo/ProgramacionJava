package fouad.personal.dam.tema1;

import java.util.Scanner;

public class Ej04AnioBisiesto {

	public static void main (String[] args) {
		
		Scanner anio= new Scanner (System.in);

		int year;
		boolean resultado;
		
		System.out.print("Por favor, escriba un año: ");
		year=anio.nextInt();
		
		
		resultado= year%4==0 && (year%100!=0 || year%400==0);
		System.out.println(year + " " + (resultado ?" Es bisiesto" : " No es bisiesto"));
		
		
		
		anio.close();		
			
		}
	
}
