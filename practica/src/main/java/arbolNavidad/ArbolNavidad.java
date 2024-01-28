package arbolNavidad;

public class ArbolNavidad {

	public static void main(String[] args) {

		// declarar altura de árbol y tronco
		int alturaArbol = 10; // para cambiar el tamaño del arbol, modifica el valor de esta variable
		int alturaTronco = 4; // para cambiar la altura del tronco, modifica el valor de esta variable

		System.out.println("Feliz navidad 😊 \n");
		// BUCLE DEL ÁRBOL(asteriscos)
		// bulce para recorrer todas las filas (altura)
		for (int fila = 0; fila < alturaArbol; fila++) {

			// bucle para los espacios de los asteriscos
			for (int espacio = 0; espacio < (alturaArbol - fila - 1); espacio++) {
				System.out.print(" ");
			}
			// bucle para los asteriscos
			for (int asterisco = 0; asterisco < ((fila * 2) + 1); asterisco++) {
				System.out.print("*");
			}
			System.out.println();

			/*
			 * salto de línea para que despúes de agregar los espacios y los asteriscos en
			 * el bucle principal, salte a la siguente linea para seguir dibujando los
			 * espacios y los asteriscos
			 */
		}

		// BUCLE DEL TRONCO
		for (int base = 0; base < alturaTronco; base++) {

			// bucle para los espacios del tronco
			for (int espacio = 0; espacio < (alturaArbol - 2); espacio++) {
				System.out.print(" ");
			}
			// bucle para el tronco
			for (int barra = 0; barra < 2; barra++) {
				System.out.print("|");
				System.out.print(" ");

			}
			System.out.println();
		}

	}

}
