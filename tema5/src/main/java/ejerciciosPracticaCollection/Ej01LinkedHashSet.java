package ejerciciosPracticaCollection;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ej01LinkedHashSet {
	public void pedirNum() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduce el tamaño de la lista: ");
		int num= sc.nextInt();
		 
		
		Set<Integer> conjuntoNumero = new LinkedHashSet<Integer>();
		conjuntoNumero.size();
		sc.close();
	}

	public void add() {
		
	}
	
	
	
	public static void main(String[] args) {
/*
	Set<Integer> conjuntoNumero = new LinkedHashSet<Integer>();
	conjuntoNumero.add(5);
	conjuntoNumero.add(2);
	conjuntoNumero.add(9);
	conjuntoNumero.add(7);
	conjuntoNumero.add(0);
	conjuntoNumero.add(3);
		
	System.out.println(conjuntoNumero);
	
		*/
		Random rand= new Random();
		
		int numAleatorio = rand.nextInt(500);
		
		int [] array= new int[numAleatorio];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10)+1;
			System.out.print(array[i] + " ");
		}	
	}

}
