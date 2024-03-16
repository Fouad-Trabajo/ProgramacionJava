package examen.tema5Collection;

import java.util.Stack;

public class InitRegistro {

	public static void main(String[] args) {

		// Generar de forma aleatoria 10 objetos de tipo registro
		Registro registro1 = new Registro("Enfoscar paredes", 12000.00);
		Registro registro2 = new Registro("Lamparas", 500.00);
		Registro registro3 = new Registro("Carreteras", 1500.50);
		Registro registro4 = new Registro("Aulas virtuales", 750.80);
		Registro registro5 = new Registro("Aulas virtuales", 750.80);
		Registro registro6 = new Registro("Aulas virtuales", 750.80);
		Registro registro7 = new Registro("Aulas virtuales", 750.80);

		// Procesar los resgistros
		Stack<Registro> pila = new Stack<>();
		// Meter los registros en la pila
		pila.push(registro1);
		pila.push(registro2);
		pila.push(registro3);
		pila.push(registro4);
		pila.push(registro5);
		pila.push(registro6);

		// Borrar registros
		pila.pop();

		for (Registro registro : pila) {
			System.out.println(registro);
		}

	}

}
