package tema3Clases;

public class Operacion {

	// Creación atributos
	

		// atributos declaración
		char letra;

		// método especial - Constructor
		public boolean esVocal(char letra) {

			if (this.letra == 'a' || this.letra == 'e' || this.letra == 'i' || this.letra == 'o' || this.letra == 'u') {
				return true;
			}

			else {
				return false;
			}

		}
}