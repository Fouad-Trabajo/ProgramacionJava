package examen.tema5Collection;

import java.util.Objects;

public class Nodo<T> {

	private T info;
	private Nodo<T> sig;
	
	//Constructor
	public Nodo(T info, Nodo<T> sig) {
		this.info = info;
		this.sig = null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodo<T> getSig() {
		return sig;
	}

	public void setSig(Nodo<T> sig) {
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
