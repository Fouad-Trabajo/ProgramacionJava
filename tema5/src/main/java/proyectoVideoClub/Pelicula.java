package proyectoVideoClub;

public class Pelicula {

	private String codigo;
	private String titulo;
	private static int id = 0;


	public Pelicula(String titulo) {
        this.codigo = id++;
		this.titulo = titulo;
		
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Pelicula.id = id;
	}
	
	

	
}
