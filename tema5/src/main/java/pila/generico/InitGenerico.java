package pila.generico;

import pila.Pila;

public class InitGenerico {

	public static void main(String[] args) {

		Pila pila = new Pila();
		boolean vacia = pila.isEmpty();

		pila.push(3);
		pila.push(4);
		pila.push(4);
		pila.push(6);

		pila.print();

		// saco
		pila.peak(); //mostarar la cima sin borrar
		pila.pop(); //mostarar la cima borrandolo
		pila.print();
	}

}
