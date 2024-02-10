package ejercicioCallofDuty;

public class Equipamiento {
	private static int contador_id=1;
	
	
	//Atributos
	private int id;
	private int espaciosEnMochila;
	private String nombre;
	
	
	//Constructor
	public Equipamiento(int id, int espaciosEnMochila, String nombre) {
		super();
		this.id = id;
		this.espaciosEnMochila = espaciosEnMochila;
		this.nombre = nombre;
	}

	//Getter y setter
	public static int getContador_id() {
		return contador_id;
	}


	public static void setContador_id(int contador_id) {
		Equipamiento.contador_id = contador_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getEspaciosEnMochila() {
		return espaciosEnMochila;
	}


	public void setEspaciosEnMochila(int espaciosEnMochila) {
		this.espaciosEnMochila = espaciosEnMochila;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
