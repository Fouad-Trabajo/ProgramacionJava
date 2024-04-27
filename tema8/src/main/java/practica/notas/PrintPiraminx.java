package practica.notas;

public class PrintPiraminx {

	public static void main(String[] args) {

		int altura = 6;

		// Espacios
		for (int i = 0; i <= altura; i++) {
			for (int j = altura; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}

			System.out.println();
		}

	}

}
