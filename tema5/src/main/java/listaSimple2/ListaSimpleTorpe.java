package listaSimple2;

public class ListaSimpleTorpe implements Lista {

	private Nodo  primero;
	//No tiene tamaño
	
	/*
	 * Esta lista es menos eficiente, porque no tiene contador
	 * de tamaño y no está reestructurada*/
	
	//Main
	public static void main(String [] args) {
		
		Nodo nodo= new Nodo(null);
		Lista lista = new ListaSimpleTorpe(nodo);
	}
	
	
	//Constructor
	public ListaSimpleTorpe(Nodo primero) {
		this.primero = primero;
	}

	@Override
	public boolean isEmpty() {
		return primero ==null;
	}

	@Override
	public Persona getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertAtBegin(Persona info) {
		Nodo nuevo= new Nodo(info);
		
		if(primero==null) {
			primero=nuevo;
		}else {
			nuevo.setSig(primero);
			primero=nuevo;
		}
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
