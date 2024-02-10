package ejercicioCallofDuty;

public class Usuario {

	private String nombre;
	private int espacioMochila;
	private Arma armaPrincipal; //
	private Arma armaSecundaria;
	private Accesorio[] accesorio;
	
	
	
	//Constructor
	public Usuario(String nombre, int espacioMochila) {
		this.nombre = nombre;
		this.espacioMochila = espacioMochila;


	}



	//Getter y setter
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEspacioMochila() {
		return espacioMochila;
	}



	public void setEspacioMochila(int espacioMochila) {
		this.espacioMochila = espacioMochila;
	}



	public Arma getArmaPrincipal() {
		return armaPrincipal;
	}



	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}



	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}



	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}



	public Accesorio getAccesorio() {
		return accesorio;
	}



	public void setAccesorio(Accesorio accesorio) {
		this.accesorio = accesorio;
	}
	
	
	
	
}
