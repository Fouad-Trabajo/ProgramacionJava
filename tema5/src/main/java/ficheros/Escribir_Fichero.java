package ficheros;

import java.io.FileWriter;

public class Escribir_Fichero { 
	/*
	 * Output: Salida de datos
	 */

	public static void main(String[] args) {
		Write_Fichero escribiendo = new Write_Fichero();
		escribiendo.escribe();
	}

	public static class Write_Fichero {
		public void escribe() {
			try {
				FileWriter escritura = new FileWriter("C:/Users/Fouad/Desktop/EjemEclipse.txt");           
				
				String texto ="Hola mundo esto es un fichero,\n"
						+ "este texto lo he escrito desde Eclipse";
				
				escritura.write(texto);
				escritura.write("\nEsto es una prueba: " + 65);
				
				escritura.close();
			} catch (Exception e) {
				System.err.println("No se ha podido escribir en el fichero");
			}
		}
	}

}
