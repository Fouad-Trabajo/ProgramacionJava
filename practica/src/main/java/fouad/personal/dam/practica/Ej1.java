package fouad.personal.dam.practica;
import java. util. Scanner;

public class Ej1 {
	public static void main (String [] args ) {
		
		
		Scanner sc=new Scanner(System.in);
		int num; int contador=0; int sumaAprobado=0;
		int sumaSuspenso=0; int contadorSuspenso=0;
		int contadorAprobado=0, sumaTotal=0;
		double promedioTotal=0, promedioSuspenso=0, promedioAprobado=0;
		
		do {
		System.out.print("Introduce una nota entre 1 y 7: ");
		num=sc.nextInt();
		contador++;
		sumaTotal=sumaTotal+num;
		if (num>=5) {
		sumaAprobado+=num;
		contadorAprobado++;
		}
		else if (num<4) {
			sumaSuspenso+=num;
			contadorSuspenso++;
		}
			
		}while(contador<6);
		while (num>7 || num<1) {
			System.out.print("Has introducido una nota erronea, vuelve a intentarlo: ");
			num=sc.nextInt();
			}
		if (num>=5) {
			promedioAprobado=sumaAprobado/contadorAprobado;
		}
		else if(num<4) {
			promedioSuspenso=sumaSuspenso/contadorAprobado;
		}else {
			contador=contadorAprobado+contadorSuspenso;
			promedioTotal=sumaTotal/contador;
		}
		System.out.println(promedioAprobado);
		System.out.println(promedioSuspenso);
		System.out.println(promedioTotal);
		
		
	
		
		
		sc.close();
		}

}
