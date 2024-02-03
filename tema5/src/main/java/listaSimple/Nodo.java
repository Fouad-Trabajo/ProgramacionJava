package listaSimple;

public class Nodo {
	private Persona info;
	private Nodo sig;

	// Constructor
	public Nodo(Persona info) {
		this.info = info;
	}

	// Getter y setter
	public Persona getInfo() {
		return info;
	}

	public void setInfo(Persona info) {
		this.info = info
				;
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
