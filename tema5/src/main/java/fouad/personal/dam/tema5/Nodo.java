package fouad.personal.dam.tema5;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(info, sig);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		return Objects.equals(info, other.info) && Objects.equals(sig, other.sig);
	}
	
	

}
