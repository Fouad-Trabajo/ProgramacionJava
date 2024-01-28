package fouad.personal.dam.tema3;

public class MainPersona {

	public static void main(String[] args) {

		// Instancia de objetos
		Persona persona1 = new Persona("Marcos", 19);
		Persona persona2 = new Persona("Fabio", 25);

		System.out.println("La edad de " + persona1.getNombre() +" es: " + persona1.getEdad());
		System.out.println("La edad de " + persona2.getNombre() + " es: " + persona2.getEdad());

		if (persona1.getEdad() > persona2.getEdad()) {
			System.out.println(persona1.getNombre() + " es el mayor");
		} else if (persona1.getEdad() < persona2.getEdad()) {
			System.out.println(persona2.getNombre() + " es el mayor");
		} else {
			System.out.println(persona1.getNombre() + ", " + persona2.getNombre() + " tiene la misma edad");
		}
	}

}
