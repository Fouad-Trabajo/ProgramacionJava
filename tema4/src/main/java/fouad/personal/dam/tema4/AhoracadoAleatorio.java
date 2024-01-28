package fouad.personal.dam.tema4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; //Puedo poner * para importar todas las clases/bibliotecas que necesite

public class AhoracadoAleatorio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random azar = new Random(); // Crear un objeto de la clase Random

		System.out.println("___: !!!AHORCADO!!! :____");

		// Instancia de array unidimensional de tipo String

		String[] arrayPalabras = new String[4];
		arrayPalabras[0] = "pajaro";
		arrayPalabras[1] = "mesa";
		arrayPalabras[2] = "adios";
		arrayPalabras[3] = "dos";

		// Genera un número aleatorio entre 0 y la longitud del array
		int aleatorio = azar.nextInt(arrayPalabras.length);
		String palabraAzar = arrayPalabras[aleatorio];
		System.out.println(palabraAzar);

		char[] raya2 = new char[palabraAzar.length()];
		
		// Recorrer bucle para generar mismo número de guiones que palabra
		for(int i=0;i<palabraAzar.length();i++) {
			raya2[i]='_';
		}
		
		
		char[] palabra = { 'm', 'e', 's', 'a' }; // Array de palabra escondida
		char[] raya = { '_', '_', '_', '_' }; // Array de rayitas en el suelo

		

		String palabraAleatoria = new String();
		System.out.println(raya2);

		System.out.println("Adivina la palabra -- Tienes 7 intentos");

		int intento = 0;

		do {

			// Imprimir rayitas en el suelo
			for (int j = 0; j < raya.length; j++) {
				System.out.print(raya[j] + " ");

			}
			System.out.println(); // Salto de línea

			// Pedir al usuario una letra
			System.out.print("Introduce una letra: ");
			char letra = input.next().charAt(0); // Pedir un String y quedarme con la letra que ocupa posión 0
			char letraMinuscula = Character.toLowerCase(letra);

			// Recorrer el array palabra e imprimir letra si coincide
			for (int i = 0; i < palabra.length; i++) {
				if (letraMinuscula == palabra[i]) {
					raya[i] = letraMinuscula;
				}
			}

			// Instanciar variable que crea una cadena (String) a partir del array char
			String palabraAdivinada = new String(palabra);

			// Detener el juego si el usuario gana
			if (Arrays.equals(raya, palabra)) {
				System.out.println("Felicidades, has ganado la palabra es: [" + palabraAdivinada + "]");
				System.out.println("Intentos: " + (intento + 1)); // Imprimir intentos del usuario
				break;
			}

			intento++;

			// Detener el juego si el usuario pierde
			if (intento == 7) {
				System.out.println("No lo has conseguido. SadMonkey :(");
				System.out.println("Intentos: " + intento); // Imprimir intentos del usuario
			}
		} while (intento < 7); // Fin del bucle

		while (intento <= 7) {
			System.out.print("¿Quieres volver a jugar? (yes/no): ");
			String opcion = input.next();
			String opcionMinus = opcion.toLowerCase();
			if (opcionMinus.equals("yes")) {
				System.out.println("Aquí debería poner algo pero no se lo que és");
				break;
			} else {
				System.out.println("Cerrando programa");
				break;
			}
		}
		input.close();
	} // Cierre main

}
