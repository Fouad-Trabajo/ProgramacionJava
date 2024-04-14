package ficheros.ejercicios;

import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {
	public static void main(String[] args) {
		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();

	}
	public static class Leer_Fichero {
		public void lee() {
			try {
				FileReader entrada = new FileReader("C:/Users/Fouad/Desktop/StarWars.txt");

				int c = 0;
				while (c != -1) {
					c = entrada.read();
					System.out.print((char) c); //Casting
				}
				entrada.close();

			} catch (IOException e) {

				System.err.println("Archivo no encontrado: " + e);
			}
		}

	}

}
