package herencia;

public class MainPersona {
	public static void main (String [] args) {
		
		
		//Instancias
		Empleado empleado1 =new Empleado(0, "",0.0, 0, "Juan","","", 0);
		Consultor consultor1=new Consultor("",1,"","","",0);
		
		System.out.println("El nombre del empleado es: " + empleado1.getNombre());
		System.out.println("El id del consultor es : "+ consultor1.getId());
	}

}
