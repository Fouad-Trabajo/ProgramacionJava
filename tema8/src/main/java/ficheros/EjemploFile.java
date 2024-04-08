package ficheros;

import java.io.File;
import java.io.FileWriter;

public class EjemploFile {

	public static void main(String[] args) {

		ConstructoresFile contructores = new ConstructoresFile();
		contructores.escribir(); //Escribir en un fichero creandolo en el proceso
		contructores.info();
	}

	// Clase inherit
	public static class ConstructoresFile {
		File archivo = new File("Primavera.txt");

		public void escribir() {
			try {
				FileWriter escribir = new FileWriter("Primavera.txt", true);
				String texto = "Hola como estás";
				escribir.write(texto + " \n");

				escribir.close();
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}

		public void info() {
			System.out.println("INFORMACIÓN DIVULGABLE SOBRE EL FICHERO(referencia a SNK)");

			System.out.println("1-Nombre del fichero: " + archivo.getName());
			System.out.println("2-Ruta absoluta del fichero: " + archivo.getAbsolutePath());
			System.out.println("3-Tamaño del fichero : " + archivo.length() + " bytes");

			if (archivo.isDirectory()) {
				System.out.println("4-Es un directorio: " + archivo.isDirectory());
			} else if (archivo.isFile()) {
				System.out.println("4-Es un fichero: " + archivo.isFile());
			} else {
				System.out.println("4-No es un directorio ni un archivo");
			}
			
			if (archivo.exists()) {
				File archivoRenombrado = new File("PrimaveraTrompetilla.txt");
				if (archivo.renameTo(archivoRenombrado)) {
					System.out.println("El archivo ha sido renombrado a : " + archivoRenombrado.getName());
				}else {
					
				}
			} else {
				
				System.out.println("5-El archivo no existe: [" + archivo.exists() + "]");
			}
			archivo.delete();

			/*
			 * 1- Obtener el nombre del fichero 2- Ruta absoluta del fichero 3- Tamaño del
			 * archivo 4- Comprobar que el archivo de tipo File es un directorio o un
			 * fichero 5- Comprobar que el archivo existe, y si es así lo renombramos a
			 * "PrimaveraTrompetera.txt" y si no existe decirlo por consola
			 */
		}

	}

}
