package ficheros.ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CancionPirata {

	public static void main(String[] args) {
		/*
		 * Escribe como una cadena , en el fichero binario llamado cancionPirata.dat la
		 * siguiente estrofa:
		 * 
		 * Con diez cañones por banda, viento en popa a toda vela, no corta el mar, sino
		 * vuela un velero bergantín.
		 */
		Escribiendo cancionPirataEscribir = new Escribiendo();
		cancionPirataEscribir.escribirFichero();
		
		Leyendo cancionPirataLeer = new Leyendo();
		cancionPirataLeer.leyendoFichero();

	}
	

	static class Escribiendo {
		public void escribirFichero() {
			
			try (FileOutputStream fos = new FileOutputStream("C:/Users/Fouad/Desktop/cancionPirata.dat");
					ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				
				System.out.println("Comienzo de la escritura...");
				
				String texto = "Con 10 años por banda,\n" 
				+ "viento en ropa a toda vela,\n"
				+ "no corta el mar, sino vuela,\n" 
				+ "un velero bergantín";
				
				oos.writeObject(texto);
							
			} catch (IOException e) { 
				System.err.println("Error en la escritura del fichero");
			}
		}
	}
	
	static class Leyendo{
		public void leyendoFichero() {
			try (FileInputStream fis = new FileInputStream("C:/Users/Fouad/Desktop/cancionPirata.dat");
					ObjectInputStream ois = new ObjectInputStream(fis);)
			{
				
				System.out.println("Lectura del fichero binario \n");
				try {
					String texto = (String) ois.readObject();
					System.out.println(texto);
					
				} catch (ClassNotFoundException e) {
					System.out.println(e);
					e.printStackTrace();
				}
				//System.out.println();
			} catch (IOException e) {
				System.err.println("Error en la lectura del fichero");
			}
		}
	}

}
