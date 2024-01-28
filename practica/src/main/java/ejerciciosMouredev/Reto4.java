package ejerciciosMouredev;


public class Reto4 {

	/*
	 * Escribe un programa que se encargue de comprobar si un número es o no primo.
	 * Hecho esto, imprime los números primos entre 1 y 100.
	 */

	public static void main(String[] args) {

	
		// Imprimir número primos entre el 1 y el 100
		for (int i = 1; i <= 100; i++) {
			if(i==2 || i==3 || i==5 || i==7) {
				System.out.println(i);
			}
			if (((i % 2) != 0)&&((i % 2) != 0) && ((i % 3) != 0) && ((i % 5) != 0) && ((i % 7) != 0)) {
				System.out.println(i);
			}
		}



	}

}
