package ultimosejercicios.banco;

public class Contador {

	private int valor;
	private final int minimo = 0;
	private final int maximo = 10;

	public Contador(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void incrementar() throws LimiteInferiorSuperior {
		for (;;) {
			valor += 1;
			if (valor > maximo) {
				throw new LimiteInferiorSuperior();
			}
		}
	}

	public void decrementar() throws LimiteInferiorSuperior {
		while (true) {
			valor -= 1;
			if (valor < minimo) {
				throw new LimiteInferiorSuperior();
			}
		}
	}

	@Override
	public String toString() {
		return "Contador [valor = " + valor + ", minimo = " + minimo + ", maximo = " + maximo + " ]";
	}

}
