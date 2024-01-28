package herencia;

public class Consultor extends Persona{
	
	//Atributos de Consultor
	String posición;
	
	//Constructor
	public Consultor(){
		//Constructor vacio
	}
	
	public Consultor(String posicion, int id, String nombre, String apellido, String direccion, int telefono) {
		super(id, nombre, apellido, direccion, telefono);
		this.posición=posicion;
	}
	
	// Getter y Setter
	public String getPosición() {
		return posición;
	}

	public void setPosición(String posición) {
		this.posición = posición;
	}
	
	//Métodos especiales 
	
	// public...


}
