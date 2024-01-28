package tema3Clases;
import java.util.Scanner;

public class MainCuenta {
	//ejercicioClases=new ejercicioClases();
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		//Me definiré varios objetos de la clase Cuenta
		
		
		Cuenta c001 =new Cuenta("Oscar",1000); // Estoy llamando al 1er contructor
		
		
		
		//Cuenta c001=new Cuenta ("Iván"); // Estoy llamando al 2º constructor.
		
		// Esto se hace vía Scanner, para pedir al usuario, el dinero de la cuenta
		System.out.print("¿Cuanto quieres tener en la cuenta c001?: ");
		double cantidad=sc.nextDouble();
		c001.Ingresar(cantidad);
		System.out.println(c001.getCantidad());
		
		//Usando Scanner, para pedir al usuario, cuánto quiere ingresar en la cuenta
		System.out.print("¿Cuanto quieres ingresar en la cuenta c001?: ");
		c001.Ingresar(sc.nextDouble());
		
		
		Cuenta c010=new Cuenta("Alicia","Jimenes", 589);
		Cuenta c020=new Cuenta("Carlota", 800);
		
		System.out.println(c001.getTitular());
		c001.setTitular("Adrian");
		
		System.out.println(c001.getCantidad());
		
		//c001.ingresar(-200);
		c001.Retirar(500);
		System.out.println(c001.getCantidad());
		
		
		
		System.out.println(c001.getTitular());
		
		Cuenta c002,c003,c004, c005;
		
		c002=new Cuenta ("Iván"); 
		//System.out.println(c002.getCantidad());
		
		c003=new Cuenta("Pablo");
		c004=new Cuenta("Iris");
		c005=new Cuenta("Jesús" , -100.99);//Estamos llamando al primer constructor, sundo constructor arriba
		
		// c002.setCantidad(555);
		c002.setCantidad(555); // coo2.ingresar(555); esto es para sumar y que te de 655.0
		
		
		System.out.println(c001.toString());
		System.out.println(c003.toString());
		System.out.println(c004.toString());
		System.out.println(c005.toString());
		System.out.println(c010.toString());
		System.out.println(c020.toString());
		
		

		sc.close();
		
		
	}

}
