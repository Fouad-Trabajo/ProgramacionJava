package fouad.personal.dam.tema3;

public class Vocal {

	public static boolean esVocal(char letra) {
		if (letra >= 'a' && letra <= 'z') {
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
