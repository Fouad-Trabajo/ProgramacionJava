package ultimosejercicios.personas;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MyObjectInputStream extends ObjectInputStream {

	// Sobreescribir el método que lee la cabecera
	public void readStreamHeader() throws IOException{
		// No hacer nada
		
	}

	public MyObjectInputStream() throws IOException, SecurityException {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyObjectInputStream(InputStream in) throws IOException {
		super(in);
		// TODO Auto-generated constructor stub
	}

	

}
