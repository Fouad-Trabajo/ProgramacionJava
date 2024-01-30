package fouad.personal.dam.tema5;

public class Nodo {
	private String info;
	private Nodo sig;

	// Constructor
	public Nodo(String info) {
		this.info = info;
	}

	// Getter y setter
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	@Override
	public String toString() {
		return "Nodo [info=" + info + ", sig=" + sig + "]";
	}

}
