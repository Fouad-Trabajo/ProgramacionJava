package fouad.personal.dam.tema1;

public class Cosecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidadDeVino = 5;
		final int BuenaCosecha = 25; // Para definir una contante, se pone "final" al prinicipio

		if (cantidadDeVino > BuenaCosecha) {
			System.out.println("Has tenido una buena cosecha");
		} else if (cantidadDeVino == BuenaCosecha) {
			System.out.println("Has tenido una cosecha aseptable");
		} else {
			System.out.println("Has tendido una mala cosecha");
		}

	}

}
