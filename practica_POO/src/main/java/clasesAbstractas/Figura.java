package clasesAbstractas;

public abstract class Figura {
	// Para que una clase sea abstracta, debe tener al menos 1 método abstracto
	// y además no puede instanciar objetos, eso deben hacelo las clases hijas

	/*
	 * ATRIBUTOS - Protected para que solo las clases hijas puedan acdeder a los
	 * atributos y que sean visibles solo para ellas
	 */
	protected double x; // posicion x
	protected double y; // posición y

	// Constructores-Normales
	
	/*
	 * Estos constructores solo servirán para las clases hijas, puesto que las
	 * clases abstractas, no pueden instanciar objetos
	 */

	protected Figura() {
		// Constructor vacio
	}

	protected Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Método abstracto
	public abstract double calcularArea();

	// Getter y Setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
