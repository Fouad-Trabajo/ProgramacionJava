package ultimosejercicios.banco;

import java.util.ArrayList;

public class InitPanda {

	public static void main(String[] args) {

		Amigo a1 = new Amigo("Carlos", "Charly");
		Amigo a2 = new Amigo("Maria", "Mar");
		Amigo a3 = new Amigo("Pierre", "Pipi");
		Amigo a4 = new Amigo("Nadie", "N");
		Amigo a5 = new Amigo("Marcos", "Maquitos");

		ArrayList<Amigo> lista = new ArrayList<>();
		Pandilla p1 = new Pandilla(lista); // capcidad es final

		try {

			p1.add(a1);
			p1.add(a2);
			p1.add(a3);
			p1.add(a4);
			//p1.add(a4);

		} catch (PandillaCompletaException | NoMeGustaTuNombreException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(p1.toString());


	}
}
