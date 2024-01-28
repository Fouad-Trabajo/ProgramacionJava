package herencia;

public class Empleado extends Persona {

	// Atributos de empleado
	int num;
	String cargo;
	Double sueldo;

	// Constructores
	public Empleado() {

	}

	/*Cosntructor normal del hijo/Empleado
	public Empleado(int num, String cargo, Double sueldo) {
		this.num = num;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	 */
	public Empleado(int num, String cargo, Double sueldo, int id, String nombre, String apellido, String direccion, int telefono) {
		super(id, nombre, apellido, direccion, telefono);
		this.num=num;
		this.cargo=cargo;
		this.sueldo=sueldo;
	}

	//getter y setter
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	

	
	
	
	

}
