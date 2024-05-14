package ultimosejercicios.banco;

public class NoMeGustaTuNombreException extends Exception{
	

	private static final long serialVersionUID = 1L;

	public NoMeGustaTuNombreException() {
		super("Tu nombre acaba en 'S', no nos gusta, no puedes entrar");
	}
}
