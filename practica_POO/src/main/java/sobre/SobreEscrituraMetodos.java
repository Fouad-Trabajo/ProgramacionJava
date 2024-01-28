package sobre;

public class SobreEscrituraMetodos extends Animal {

	@Override
	public int calcularEdad() {
		System.out.println("Esto es sobre escribir");
		return 0;
	}
	/*
	 * En este caso estoy sobreescribiendo el método y lo estoy modificando a mi
	 * manera, NO estoy sobrecargando, estoy MODIFICANDO, REESCRIBIR el método de la
	 * forma que yo quiero, y generalmente se hace en herencias. 
	 * El método se implementa de la forma que quiera la clase hija.
	 * Lo hemos hecho en el ejemplo de clase abstracta, donde el método calcularArea, 
	 * se modifica/sobreescribe al gusto de la clase hija
	 * 
	 */

}
