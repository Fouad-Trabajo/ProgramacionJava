package fouad.personal.dam.tema4;

public class AhorcadoAleatorio {

	/*public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Instancia de scanner
		Random azar= new Random();

		System.out.println("____:-!!!AHORCADO!!!-:____");

		String opcionMinus; // Declaración variable de String minúsculas
		do {
			//Generar palabra secreta aleatoriamente
			String[] palabraAleatoria= new String[10];
			palabraAleatoria[0]="pajaro";
			palabraAleatoria[1]="almendra";
			palabraAleatoria[2]="carrusel";
			palabraAleatoria[3]="ordenador";
			palabraAleatoria[4]="matriz";
			palabraAleatoria[5]="perro";
			palabraAleatoria[6]="almohada";
			palabraAleatoria[7]="raton";
			palabraAleatoria[8]="mesa";
			palabraAleatoria[9]="ola";
			
			//Generar número aleatorio entre 0 y la longitud del array
			int numAleatorio= azar.nextInt(palabraAleatoria.length);
			String palabraAzar=palabraAleatoria[numAleatorio];
			System.out.println(palabraAzar);
			
			//Declaro array rayas con misma longitud que la palabra escondida
			String[] guion= new String[palabraAzar.length()];
			
			//Imprimo array-guion
			for(int i=0;i<guion.length;i++) {
				System.out.print(guion[i]='_' + " ");
			}System.out.println(); //Salto de línea
			// Instancia de array unidimensional de tipo String
			System.out.println("Adivina la palabra -- Tienes 10 intentos");

			int intento = 0; // Variable para contar los intentos del usuario

			do {
				// Imprimir rayitas en el suelo
				for (int j = 0; j < guion.length; j++) {
					System.out.print(guion[j] + " ");
				}
				System.out.println(); // Salto de línea

				System.out.print("Introduce una letra: ");
				char letra = input.next().charAt(0); // Pedir un String y quedarme con la letra que ocuapa posición 0
				char letraMinuscula = Character.toLowerCase(letra);
				// Recorrer el array palabra e imprimir letra si coincide
				for (int i = 0; i < palabraAleatoria.length; i++) {
					if (letraMinuscula == palabraAleatoria[i]) {
						guion[i] = letraMinuscula;
					}
				}
				// Declarar variable que crea una cadena (String) a partir del array de char
				String palabraAdivinada = new String(palabraAleatoria);

				/*
				 * DETENER EL JUEGO SI EL USUARIO GANA Para eso debo comparar ambos arrays, y si
				 * coninciden, significa que el usuario ha encontrado la palabra escondida
				 *

				boolean comparacion = true;

				// COMPARACIÓN DE AMBOS ARRAYS (SIN UTILIZAR LA CLASE ARRAYS)
				if (palabraAleatoria.length != guion.length) { // Primero comparo ambas longitudes de los arrays
					comparacion = false;
				} else {
					for (int i = 0; i < palabraAleatoria.length; i++) { // Segundo comparo índice por índice de cada array
						if (palabraAleatoria[i] != guion[i]) {
							comparacion = false;
							break;
						}
					}
				} 
				if (comparacion==true) {
					System.out.println("Felicidades, has ganado la palabra es: [" + palabraAdivinada + "]");
					System.out.println("Intentos: " + (intento + 1));
					break;
				} // Fin de la comparacion de ambos arrays

				intento++;

				// Detener el juego si el usuario pierde
				if (intento == 10) {
					System.out.print("No lo has conseguido. SadMonkey :( \nLa palabra era: [" + palabraAdivinada + "]");
					System.out.println("\nIntentos: " + intento);
				}
			} while (intento < 10); // Fin del segundo Do-While
		

			/* -------------------------------------------------------------------------- **

			// Preguntarle al usuario si quiere volver a jugar
			System.out.print("¿Quieres volver a jugar? (yes/no): ");
			opcionMinus = input.next().toLowerCase(); // Convierto a minusculas la opción del usuario

			while (!opcionMinus.equals("yes") && !opcionMinus.equals("no")) {
				System.out.print("Has introducido un valor erroneo, ¿Quieres volver a jugar? (yes/no): ");
				opcionMinus = input.next().toLowerCase(); // Convierto a minusculas la opción del usuario
			}

			if (opcionMinus.equals("no")) {
				System.out.println("Programa cerrado.");
				break;
			}

		} while (opcionMinus.equals("yes")); // Fin del primer Do-While
	} // Cierre main
*/
}
