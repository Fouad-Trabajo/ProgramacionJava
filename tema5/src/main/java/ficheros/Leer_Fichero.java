package ficheros;

import java.io.FileReader;

public class Leer_Fichero {
	/**
	 * Input: Entrada de datos
	 * Leer un fichero caracter a caracter
	 * */

	public static void main(String[] args) {
		Read_Fichero leyendo = new Read_Fichero();
		leyendo.leer();

	}

	private static class Read_Fichero {
		public void leer() {
			try {
				FileReader entradaDatos = new FileReader("C:/Users/Fouad/Desktop/EjemEclipse.txt");

				int c = 0;
				while (c != -1) {
					c = entradaDatos.read();
					char letra = (char) c;
					System.out.print(letra);
				}
				entradaDatos.close();
			} catch (Exception e) {
				System.err.println("Archivo no encontrado: " + e);
			}

		}
	}

}
