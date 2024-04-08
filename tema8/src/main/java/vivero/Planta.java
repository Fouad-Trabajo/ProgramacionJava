package vivero;

import java.io.Serializable;
import java.util.Objects;

public class Planta implements Serializable { // Lo hacemos serializable
	/* Serializar: Convertir un objeto en una sucesión de bytes para poder guardarlo
	en un espacio informático
	Deserializar: Es lo contrario, convierte una sucesión de bytes en objeto
	*/
	private int código;
	private String nombreVulgar;
	private String nombreCientífico;
	private double precio;
	private int cantidad;

	public Planta(int código, String nombreVulgar, String nombreCientífico, double precio, int cantidad) {
		super();
		this.código = código;
		this.nombreVulgar = nombreVulgar;
		this.nombreCientífico = nombreCientífico;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getNombreCientífico() {
		return nombreCientífico;
	}

	public void setNombreCientífico(String nombreCientífico) {
		this.nombreCientífico = nombreCientífico;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Planta [código=" + código + ", nombreVulgar=" + nombreVulgar + ", nombreCientífico=" + nombreCientífico
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, código, nombreCientífico, nombreVulgar, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		return cantidad == other.cantidad && código == other.código
				&& Objects.equals(nombreCientífico, other.nombreCientífico)
				&& Objects.equals(nombreVulgar, other.nombreVulgar)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
