package listaSimpleProfesor;

public class InitListaEjercicio {

	public static void main(String[] args) {

		Lista lista = new ListaSimple(); // ListaSimpleHermanaTorpe();

		// Creamos 5 objetos de tipo Persona
		Persona p1 = new Persona("Fouad", 21);
		Persona p2 = new Persona("Rubén", 45);
		Persona p3 = new Persona("Alejandro", 36);
		Persona p4 = new Persona("Diana", 3);
		Persona p5 = new Persona("Francisco Frasco", 1945);

	

		// Lista
		System.out.println("----------Lista----------");
		lista.insertAtEnd(p1);
		lista.insertAtEnd(p2);
		lista.insertAtEnd(p3);
		lista.insertAtEnd(p4);
		lista.insertAtEnd(p5);
		lista.print();

		//Insertar al final
		System.out.println("Insertar al final de la lista: BEICON");
		lista.insertAtEnd(new Persona("Beicon", 33) );
		lista.print();

		// Insertar al principio
		System.out.println("Insetar al principio de la lista: MARCOS");
		lista.insertAtBegin(new Persona("Marcos", 21));
		lista.print();

		
		//Insertar posición concreta
		System.out.println("Insertar en un posicón concreta (posición 3): LILLANA");
		lista.insertAtPosition(new Persona("LILIANA", 23), 3);
		lista.print();

	}

}
