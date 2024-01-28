package clasesAbstractas;

public class Cuadrado extends Figura {

	// Atributos
	private double lado;

	// Constructores
	public Cuadrado() {

	}

	public Cuadrado(double lado, double x, double y) {
		super(x, y);
		this.lado = lado;
	}
	
	
	// Getter , Setter y ToString
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	//Metodo especial
	@Override
	public double calcularArea() {
		double resultado=lado*lado;
		return resultado;
	}

}
