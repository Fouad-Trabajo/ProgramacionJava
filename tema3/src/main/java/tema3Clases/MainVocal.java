package tema3Clases;

import java.util.*;

public class MainVocal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Instaciar-Inicializar
		Vocal esvocal = new Vocal();

		System.out.print("Por favor, escriba una letra: ");
		char letra = sc.next().charAt(0);
		char letraMinuscula = Character.toLowerCase(letra);

		
		/*boolean comprobacion = Vocal.esVocal(letraMinuscula);
		 * Se declara una variable llamada "comprobacion" de tipo boolean y se le dá
		 * valor de la letraMinuscula
		 */

		if (Vocal.esVocal(letraMinuscula)) {
			System.out.println("La letra [" + letra + "] es vocal");
		} else {
			System.out.println("La letra [" + letra + "] no es una vocal");
		}

		sc.close();

	}

}
