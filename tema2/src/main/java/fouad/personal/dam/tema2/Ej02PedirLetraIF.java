package fouad.personal.dam.tema2;

import java.util.Scanner;

public class Ej02PedirLetraIF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("VOCALES Y CONSONANTES");
		
		// Cabiar de mayus a minus--> toLowerCase() || Cambiar de minus a mayus-->toUpperCase()
		String Cadena = "Esto es UnA Frase EN minuscula";
		String EnMinusculas = Cadena.toLowerCase();
		System.out.println(EnMinusculas);
		
		System.out.print("Introduce una letra: ");
		char letra = sc.next().charAt(0);
		letra = Character.toLowerCase(letra); // Para cambiar minuscula a mayúsucla en char

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Has introducido una vocal: ");
		}

		else if (letra == '1' || letra == '2' || letra == '3' || letra == '4' 
				|| letra == '5' || letra == '6'|| letra == '7' || letra == '8' || letra == '9') {
			System.out.println(
					"Error, has introducido un número, " +
					"ejecuta el programa de nuevo e introduce un caracter ");
		}

		else {
			System.out.println("Has introducido una consonante: ");
		}

		System.out.print("Gracias por participar :)");

		sc.close();
	}

}
