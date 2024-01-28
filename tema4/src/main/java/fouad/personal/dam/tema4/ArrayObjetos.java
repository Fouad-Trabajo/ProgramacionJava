package fouad.personal.dam.tema4;

import java.util.*; //Aqui tenemos el Random y el Scanner



public class ArrayObjetos {
	Random rand = new Random();
	/*
	 * El random se puede poner fuera del main o dentro si lo pongo dentro, me dirá
	 * que no se está usando porque lo estoy usando fuera del main
	 */
public final static String[] NOMBRES = { "Alejandra", "Candela", "Vega", "Sergio" };
	
	public static void rellenarArray(Alumno[] datos) {
		Random rand = new Random();
		for (int i = 0; i < datos.length; i++) {
			datos[i] = new Alumno(NOMBRES[rand.nextInt(NOMBRES.length)], rand.nextInt(6) + 10); // Esto es importante
			System.out.println(datos[i]);
		}
	}

	public static void main(String[] args) {

		// Array de 20 objetos alumno
		Alumno[] datos = new Alumno[20];
		Scanner sc = new Scanner(System.in);

		int contador = 0;

		rellenarArray(datos); // Esto es para imprimir el array que está fuera del main (abajo)
		System.out.println("-----------------------------------------");
		System.out.println("Dime un nombre, el programa lo buscará en la base de datos: ");
		String nombre = sc.nextLine();

		System.out.println("Dime una edad, el programa lo buscará en la base de datos: ");
		int edad = Integer.valueOf(sc.nextInt());

		// Instancia de un objeto de la clase Alumno
		Alumno alumnoABuscar = new Alumno(nombre, edad);

		for (int i = 0; i < datos.length; i++) {
			if (datos[i].equals(alumnoABuscar)) {
				contador++;
			}
		}

		System.out.println("El alumno se ha encontrado " + contador + " veces");
		sc.close();

	} // Main cerrado

	// Esto está fuera del main
	
}
