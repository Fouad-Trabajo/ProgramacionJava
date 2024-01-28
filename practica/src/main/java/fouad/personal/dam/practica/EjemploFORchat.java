package fouad.personal.dam.practica;

import java.util.Scanner;

public class EjemploFORchat {
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner (System.in);
		int num=0;
		
		System.out.println("NÚMERO DEL 0-100");
		
		for (int i=0; i<=100;i++) {
			num=num+i;
			
		}
		System.out.println("Los número del 0 al 100 son: " + num);
		
		
		sc.close();
	}

}
