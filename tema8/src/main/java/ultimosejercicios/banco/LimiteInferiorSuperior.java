package ultimosejercicios.banco;

public class LimiteInferiorSuperior extends Exception{

	private static final long serialVersionUID = 8854406802807800284L;
	
	public LimiteInferiorSuperior () {
		super("Te has pasado del límite");
	}

}
