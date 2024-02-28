package proyectoVideoClub;

public class Pelicula {

	private int codigo;
	private String titulo;
	private static int id = 0;


	public Pelicula(String titulo) {
        this.codigo = id++;
		this.titulo = titulo;
		
	}

	
}
