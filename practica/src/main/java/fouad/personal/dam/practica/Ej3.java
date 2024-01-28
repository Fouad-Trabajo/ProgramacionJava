package fouad.personal.dam.practica;

import java.util.*;

public class Ej3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número entero no negativo: ");
		int num=sc.nextInt();
		
		while(num<0) {
			System.out.print("Has introducido un número entero negativo, vuleve a intentarlo: ");
			num=sc.nextInt();
		}
		if (num== 0 || num==-1) {
			System.out.println("El doble factorial es 1");
		}
		
		else if((num%2)==0) {
			
			//2*4*6*8*(num-2)*num;
			
		}else {
			//1*3*5*(num-2)*num;
		}

		sc.close();

	}

}
