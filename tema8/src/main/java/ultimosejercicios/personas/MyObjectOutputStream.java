package ultimosejercicios.personas;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

	// Sobreescribir el método que genera la cabecera
	public void writeStreamHeader() throws IOException{
		// No hacer nada
		
	}

	// Constructores
	public MyObjectOutputStream() throws IOException, SecurityException {
		// TODO Auto-generated constructor stub
	}

	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}

}
