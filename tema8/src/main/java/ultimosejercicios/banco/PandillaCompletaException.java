package ultimosejercicios.banco;

public class PandillaCompletaException extends Exception{


	private static final long serialVersionUID = -64418260075723401L;
	
	public PandillaCompletaException() {
		super("Lo siento, la panda está llena");
	}
}
