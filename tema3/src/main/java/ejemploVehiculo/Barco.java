package ejemploVehiculo;

public class Barco extends Vehiculo{

	private double eslora;
	private double toneladas;
	
	//constructor
	public Barco(int num_ruedas, String color, int num_puertas, String ultimaRevision, double eslora, double toneladas) {
		super(num_ruedas, color, num_puertas, ultimaRevision);
		eslora=15;
		toneladas=40;
		 //constructor de la clase padre
	}

	
}
