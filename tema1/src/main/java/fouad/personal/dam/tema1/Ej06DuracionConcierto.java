package fouad.personal.dam.tema1;

import java.util.*;

public class Ej06DuracionConcierto {

	public static void main(String[] args) {

		Scanner duracion=new Scanner(System.in);

		int segundostotales;
		
		System.out.println("DURACIÓN CONCIERTO");

		System.out.print("¿Cúantos segundos duró el concierto?: ");
		segundostotales=duracion.nextInt();

		int semanas= segundostotales/604800;
		int dias= (segundostotales%604800)/86400;
		/*int horas= (segundostotales%86400)/3600;	//int horas= segundostotales/3600;
		int minutos= (segundostotales%3600)/60;		//int minutos= (segundostotales%3600)=60;
		int segundos= segundostotales%60;	*/		//int segundos= segundostotales%60;
		
		
		int horas= segundostotales/3600;
		int minutos= segundostotales%3600;
		int segundos= segundostotales%60;
		
		System.out.println("");
		System.out.println("Duración del concierto: " + semanas + " semanas " + dias + " días " + horas + " horas " + minutos + " minutos y " + segundos + " segundos.");
		
		
		System.out.print("Gracias por responder :)");
		duracion.close();
		
		//int horas= segundostotales/3600;
		//int minutos= (segundostotales%3600)/60;
		//int segundos= segundostotales%60;
		}
	
	
}
