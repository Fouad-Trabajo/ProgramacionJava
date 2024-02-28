package proyectoVideoClub;

public class Cliente {
	
	private static int numeroCarnet;
	private String nombre;
	private int identificador=0;
	//private String Id="cli_";
	
	
	public Cliente(String nombre) {
		this.numeroCarnet = identificador++;
		this.nombre = nombre;
	}


	

	@Override
	public String toString() {
		return "Cliente [numeroCarnet=" + numeroCarnet + ", nombre=" + nombre + "]";
	}


	


	
	
	
	
	
	

}
