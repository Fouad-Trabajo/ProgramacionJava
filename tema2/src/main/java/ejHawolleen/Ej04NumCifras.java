package ejHawolleen;

import java.util.Scanner;

public class Ej04NumCifras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CIFRAS Y NÚMEROS");
		// 3 formas distinas de hacer el ejercicio

		System.out.print("Introduce un número entero entre 0 y 9.999 incluidos: ");
		int num = sc.nextInt();
		while (num < 0 || num > 9999) {
			System.out.print("Has introducido un número erroneo, introduce un número válido: ");
			num = sc.nextInt();
		}
		// 1.BUCLE WHILE
		/*int contador=0, number=num;
		if (number==0) {
			System.out.println("El número que has introducido tiene 1 cifra");
		}else {
		while (number!=0) {
		number/=10;  // --> number=number/10;
		contador++;
			}
		}
		System.out.println("El número " + num + " tiene " + contador + " cifras.");
		como estoy utilizando valores int, si metes 15, será 15/10=1,5 pero en int es 1
		luego 1/10=0,1 pero en int sería 0 y como number es igual a 0 se cierra el bucle.*/
		
		
		// 2.Estructura de control IF-Else if
		
		/*if (num < 10) {
			System.out.println("El número que has introducido tiene 1 cifra");
		} else if (num < 100) {
			System.out.println("El número que has introducido tiene 2 cifras");
		} else if (num < 1000) {
			System.out.println("El número que has introducido tiene 3 cifras");
		} else if (num < 10000) {
			System.out.println("El número que has introducido tiene 4 cifras");
		}*/
		
		
		// 3.LOGARITMOS
		/*if (num==0) {
			System.out.println("El número que has introducido tiene 1 cifra");
		}else {
		int cifras=(int)(Math.log10(num))+1;
			System.out.println("El número " + num + " tiene " + cifras + " cifras");
		}*/
		
		// 4. MÓDULO (%) 
		int unidadesmillar=num/1000;
		int centenas=(num%1000)/100;
		int decenas=(num%100)/10;
		int unidades=num%10;
		if (unidadesmillar!=0) {
			System.out.println("El número " + num + " tiene 4 cifras");
		}else if (centenas!=0) {
			System.out.println("El número " + num + " tiene 3 cifras");
		}else if (decenas!=0) {
			System.out.println("El número " + num + " tiene 2 cifras");
		}else  if (unidades==1){
			System.out.println("El número " + num + " tiene 1 cifras");
		}
		System.out.println("El número " + num + " tiene " + unidadesmillar + " unidades de millar " 
		+ centenas + " centenas " + decenas + " decenas y " + unidades + " unidades");
		sc.close();

	}
}
