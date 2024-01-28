package sobre;

public class SobreCargaMetodos {

	public class Circulo {
		// Atributos
		double pi;
		double radio;

		//Métodos-Constructores
		public Circulo() {
			// Constructor vacio
		}

		/* -----------------------NOTA IMPORTANTE-------------------------------
		 * El métodos de abajo está sobrecargado. Ambos métodos tienen el
		 * mismo nombre pero, se diferencian por el número y el tipo de parámetros.
		 * Desde el main se puede llamar a uno o a otro dependiendo del número y tipo de
		 * parámetros que se escriban. De esta forma, se pueden crear infinitos métodos
		 * con el mismo nombre y el IDE no los confundirá
		 */
		public Circulo(double pi, double radio) {
			this.pi = pi;
			this.radio = radio;
		}
	}

}
