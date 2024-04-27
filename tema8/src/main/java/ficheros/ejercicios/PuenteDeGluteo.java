package ficheros.ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PuenteDeGluteo {
	/* Lectura y escritura de foto */
	public static void main(String[] arg) {

		// Lectura de foto
		Imagen imagen1 = new Imagen();
		int [] array = imagen1.imprimirFoto();

		// Escritura de foto
		imagen1.crearFichero(array );
	}

	static class Imagen {

		public int[] imprimirFoto() {
			List<Integer> lista = new ArrayList<>();
			int[] array = new int[24339];
			int contador = 0;
			try (FileInputStream fis = new FileInputStream("C:/Users/Fouad/Desktop/kamasutra.jpg")) {

				boolean finalArchivo = false;

				while (!finalArchivo) {

					int byteEntrada = fis.read();
					if (byteEntrada != -1) {
						array[contador] = byteEntrada;

						System.out.println(byteEntrada);
						contador++;

					}
					if (byteEntrada == -1) {
						finalArchivo = true;
						System.out.println(byteEntrada);
					}

				}

			} catch (IOException e) {
				System.err.println("Error de E/S");
			}

			// Imprimir el ArrayList
			for (int b : lista) {
				System.out.println(b);
			}

			System.out.println("El número de lecturas es: " + contador);
			return array;
		}

		public  void crearFichero(int[] array_nuevo_fichero) {

			try (FileOutputStream fos = new FileOutputStream("C:/Users/Fouad/Desktop/2kamasutra.jpg");
					ObjectOutputStream oos = new ObjectOutputStream(fos);)

			{
				for (int i = 0; i < array_nuevo_fichero.length; i++) {
					fos.write(array_nuevo_fichero[i]);
				}
			} catch (IOException e) {
				System.err.println("Se ha producido un error al crear el archivo con el nombre diferente");
			}
		}

		

	} // Cierre de la clase interna

	
}
