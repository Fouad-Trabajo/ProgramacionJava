package fouad.personal.dam.practica;

import java.util.Scanner;

public class Ej09PrecioMasIVA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Calcular el precio del producto más el IVA:
		System.out.println("PRECIO DEL PRODUCTO MÁS IVA(21%)");
		double preciofinal;

		System.out.print("Introduce el precio del producto: ");
		double precio = sc.nextDouble();
		final double IVA = precio * 0.21;

		preciofinal = (precio + IVA);
		System.out.println("El precio del producto más el IVA es de: " + preciofinal);

		// Quitarle el IVA a un precio, para saber el valor del producto sin el IVA:
		System.out.println();
		System.out.println("CALCULAR BASE IMPONIBLE (Precio sin IVA)");
		System.out.print("Introduce el precio del producto más el IVA: ");
		preciofinal = sc.nextDouble();
		final double baseimponible = preciofinal / 1.21;

		System.out.println("El precio del producto sin IVA (base imponible) es de: " + baseimponible);

		sc.close();
	}

}
