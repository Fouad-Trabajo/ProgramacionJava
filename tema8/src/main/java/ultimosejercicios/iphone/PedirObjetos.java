package ultimosejercicios.iphone;

import java.util.ArrayList;
import java.util.Scanner;

public class PedirObjetos {
	
	public static ArrayList<Iphone> instanciarObjetos() {
		Scanner input = new Scanner(System.in);

		ArrayList<Iphone> listaIphone = new ArrayList<>();

		System.out.print("¿Cúantos Iphones quieres introducir?: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			Iphone ip = new Iphone(null, 0, 0, 0);
			System.out.println("Objeto número " + i);
			System.out.print("Dime el nombre del modelo del Iphone: ");
			ip.nombreModelo = input.next();

			System.out.print("Dime el año de lanzamiento: ");
			ip.lanzamiento = input.nextInt();

			System.out.print("Dime el tamaño de almacenamiento: ");
			ip.almacenamiento = input.nextInt();

			System.out.print("Dime el precio: ");
			ip.precio = input.nextDouble();

			listaIphone.add(ip);
		}
		input.close();

		return listaIphone;
	}

}
