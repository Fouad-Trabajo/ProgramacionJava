package listaSimpleGenericos;

import java.time.LocalDate;

public class PlanoGenerico<T> {

	T maxY, minY, maxX, minX;

	public PlanoGenerico(T maxY, T minY, T maxX, T minX) {
		this.maxY = maxY;
		this.minY = minY;
		this.maxX = maxX;
		this.minX = minX;
	}

	@Override
	public String toString() {
		return "Plano [minY=" + minY + ", minY=" + minY + ", maxX=" + maxX + ", minX=" + minX + "]";
	}

	public static void main(String[] args) {

		// Intancia de generico
		// PlanoGenerico<T> planoGenerico = new PlanoGenerico(null, null, null, null);

		PlanoGenerico<Integer> planoEnteros = new PlanoGenerico<Integer>(0, 2, 2, 0);
		PlanoGenerico<Double> planoDecimal = new PlanoGenerico<Double>(0.0, 2.2, 2.4, 0.0);
		PlanoGenerico<String> planoString = new PlanoGenerico<String>("1cm", "3cm", "5cm", "2cm");
		PlanoGenerico<Character> planoCaracter = new PlanoGenerico<Character>('a', 'b', 'c', 'd');

		System.out.println("Integer " + planoEnteros);
		System.out.println("Double " + planoDecimal);
		System.out.println("String " + planoString);
		System.out.println("Character " + planoCaracter);

		// Fechas
		LocalDate.now(); // Fecha
		LocalDate.now().plusDays(0);
		LocalDate.now().plus(null);

		/*
		 * Debo implementar las fechas en mis códigos
		 * */
	}

}
