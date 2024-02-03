package listaSimple;

public class ListaSimple implements Lista {

	//Main principal
	public static void main (String [] args) {
		
		// Lista listaSimple= new Lista(); No se puede instanciar una interfaz
		Lista listaSimple = new ListaSimple();
		
	}
	
	private int tama;
	private int primero;

	
	//Método a definir
	@Override
	public boolean isEmpty() {
		if(primero==null) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public int getFirst() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLast() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertAtBegin(Persona info) {
		/)/ TODO Auto-generated method stub
		
	}

	@Override
	public void insertAtEnd(Persona info) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAtPosition(Persona info, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsInfo(Persona info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeByInfo(Persona info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean clearList() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
