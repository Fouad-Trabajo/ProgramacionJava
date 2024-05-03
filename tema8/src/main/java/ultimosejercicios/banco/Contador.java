package ultimosejercicios.banco;

public class Contador {

	private String valor;
	private int minimo;
	private int maximo;

	public Contador(String valor, int minimo, int maximo) {
		super();
		this.valor = valor;
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	@Override
	public String toString() {
		return "Contador [valor = " + valor + ", minimo = " + minimo + ", maximo = " + maximo + " ]";
	}

}
