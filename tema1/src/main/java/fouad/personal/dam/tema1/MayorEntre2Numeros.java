package fouad.personal.dam.tema1;

public class MayorEntre2Numeros {

public static void main(String[] args) {
		
		/*
	1 (pedir por pantalla dos valores A y B)
	2 (meter los valores en una variable cada una distinta)	DEFINIR DOS VARIABLES	
		A=primer valor										ASIGNAR VALORES 	
		B=segundo valor
	3 (calcualar cual es el mayor de los dos variables)
		Si A es > B escribe "A es mayor"
		Sino... si A==B escribe : "Son iguales"
		sino... escribe "B es mayor"
	4 (sacar resultado escrito por pantalla)
	*--------------------------------------------------------------------------------------------------------
*/
		int A,B;
		A=33;
		B=29;
		
		if (A>B) {
			System.out.println("A es mayor.");	
		} else if (B>A){
			System.out.println("B es mayor.");
		} else 
			System.out.println("A y B son iguales");

}
	
	
}
