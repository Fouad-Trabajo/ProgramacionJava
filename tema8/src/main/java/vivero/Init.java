package vivero;

import java.util.ArrayList;
import java.util.List;

public class Init {

	public static void main(String[] args) {
		// Declaramos una lista de tipo plantas para luego guardalo en el fichero
		List<Planta> plantas = new ArrayList<>(); //Vamos a serializar esta coleccion
		
		//Actualizar vivero
	
		
		//Imprimir_vivero
	}
	
	public Planta modificarPrecio() {
		Planta planta = new Planta(0, null, null, 0, 0);
		if (planta.getCantidad() < 10) {
			planta.setPrecio(planta.getPrecio() * 0.8);
		} else if (planta.getCantidad() >= 10 && planta.getCantidad() <= 50) {
			planta.setPrecio(planta.getPrecio() * 0.7);
		} else { // planta.getCantidad()>50
			planta.setPrecio(planta.getPrecio() * 0.6);
		}
		return planta;
	}
	
	public void imprimirVivero() {
		
	}

}
