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




	public static int getNumeroCarnet() {
		return numeroCarnet;
	}




	public static void setNumeroCarnet(int numeroCarnet) {
		Cliente.numeroCarnet = numeroCarnet;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getIdentificador() {
		return identificador;
	}




	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	


	


	
	
	
	
	
	

}
