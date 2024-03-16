package examen.tema5Collection;

import java.util.ArrayList;
import java.util.List;

public class InitContenedor {

	public static void main(String[] args) {
		
		Contenedor<Integer> numero1= new Contenedor<>(5);
		Contenedor<Integer> numero2= new Contenedor<>(1);
		Contenedor<Integer> numero3= new Contenedor<>(6);
		Contenedor<Integer> numero4= new Contenedor<>(9);
		Contenedor<Integer> numero5= new Contenedor<>(0);
		
	
		
		
		List<Contenedor> listaGenerica = new ArrayList<>();
		
		listaGenerica.add(numero1);
		listaGenerica.add(numero2);
		listaGenerica.add(numero3);
		listaGenerica.add(numero4);
		listaGenerica.add(numero5);
		
		listaGenerica.remove(numero1);
		
		for (Contenedor num : listaGenerica) {
			System.out.println(num);
		}
		
		
		
		
		
		

		
		
	}

}
