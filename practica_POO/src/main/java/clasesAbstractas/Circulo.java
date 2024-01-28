package clasesAbstractas;

public class Circulo extends Figura{

	//Atributos
	private double pi;
	private double radio;
	
	//Constructores
	public Circulo() {
		//Constructor vacio
	}
	// Este segundo constructor está sobrecargado
	//Ambos métodos tienen el mismo nombre, pero 
	public Circulo(double pi, double radio, double x, double y) {
		super(x,y);
		this.pi=pi;
		this.radio=radio;
	}
	
	
	//Getter , Setter y toString
	public double getPi() {
		double resultado=pi*radio*radio;
		return resultado;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//toString
	@Override
	public String toString() {
		double resultado=pi*radio*radio;
		return "" + resultado;
	}

	//Método especial
	@Override
	public double calcularArea() {
		double resultado=pi*radio*radio;
		return resultado;
	}

}
