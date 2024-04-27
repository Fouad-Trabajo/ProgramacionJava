package ultimosejercicios.iphone;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Init {
	public static void main(String[] args) {
		ClaseInterna ineritClass = new ClaseInterna();
		ineritClass.escribirFichero();
		ineritClass.leerFichero();
	}

	static class ClaseInterna {

		// Método 1
		public void escribirFichero() {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ficheroIphones.dat"))) {

				// Lista con el contenido/objetos que ha escrito el usuario por pantalla
				List<Iphone> listaIphones = PedirObjetos.instanciarObjetos();
				oos.writeObject(listaIphones);
				
				System.out.println("\nEscribiendo lista de iphones en el fichero...");
			} catch (IOException e) {
				System.err.println(e);
			}
		}

		// Método 2
		@SuppressWarnings("unchecked")
		public void leerFichero() {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ficheroIphones.dat"));) {

				System.out.println("Leyendo e imprimiendo fichero: ");
				try {
					List<Iphone> lista = (ArrayList<Iphone>) ois.readObject();
					for (Iphone ip : lista) {
						System.out.println(ip);
					}

				} catch (ClassNotFoundException | EOFException e) {
					System.err.println(e);

				}
			} catch (IOException e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}
	}

}
