package tema3Clases;

public class Vocal {

	// atributos declaración
	public char letra;

	// método especial - Constructor
	public static boolean esVocal(char letra) {

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			return true;
		}

		else {
			return false;
		}

	}
	/*
	 * Se puede poner directamente en el if, dentro del constructor: letra=='a' ||
	 * ...., porque hemos declarado la variable arriba. Al declararla arriba,
	 * también podemos hacer los getters, setter, to String.... Si quitamos la
	 * declaración, dentro del if, debemos poner simplemente letra=='a' ||
	 * letra=='e' ...., pero debemos quitar los métodos: getters...
	 */

	// Getter
	public char getCaracter() {
		return letra;
	}

	// Setter
	public void setCaracter(char letra) {
		this.letra = letra;
	}

	// toString
	@Override
	public String toString() {
		return "Vocal [letra=" + letra + "]";
	}

}
